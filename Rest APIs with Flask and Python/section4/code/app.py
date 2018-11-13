from flask import Flask, request
from flask_restful import Resource, Api, reqparse
from flask_jwt import JWT
from flask_jwt import jwt_required # it's a decorator that we are going to call in front of our get method
# we have to authenticate before we can call get method

from security import authenticate, identity


app = Flask(__name__)
app.secret_key='jose'
api=Api(app)


# initialize JWT object, that is going to use our app, the authenticate and identity function together to allow for
# authentication of users
jwt=JWT(app,authenticate,identity) #/auth


items=[]


class Item(Resource):
    # parser is now belongs to the Item class as it belongs to one of the method , there is not self at front so the parser belongs to the Items(class it self)
    # not any particular item Resource

    parser = reqparse.RequestParser()
    parser.add_argument('price',
                        type=float,
                        required=True,
                        help='This field cannot be left blank!'

                        )
    @jwt_required()
    def get(self, name):

        item = next(filter(lambda x: x['name']==name, items), None) # that will give us the first item that matches this item
                                                                    # None means if the next does not find the matched item, it will return none.
                                                                    # Otherwise, it will return an error
        return {'item': None}, 200 if item is not None else 404

    def post(self,name):
        # deal with errors first, then we do what we want to do
        # ensure item must have unique name
        if next(filter(lambda x: x['name'] == name, items), None) is not None:
            return {'message':  "An item with name '{}' already exists.".format(name)}, 400
        data = Item.parser.parse_args()
        data=request.get_json() # in case you dont know your client will give you json format or not, you can add this line to prevent error
        # force =True means you do not need the content header
        # slient=True. It does not give an error it just basically returns none

        item={'name':name, 'price': data['price']}
        items.append(item)

        # need to tell client we add this to our database
        return item,201

    def delete(self,name):
        global items
        # the variable that we used here is the outer variable
        items = list(filter(lambda x: x['name'] != name, items))
        return {'message': 'Item deleted'}

    def put(self, name):
        data = Item.parser.parse_args()
        # since we only define the price, if we put any other arguments in the JSON payload, they will just get erased and
        # we will never see them
        # print(data['another'])

        item = next(filter(lambda x: x['name'] == name, items), None)
        if item is None:
            # create an item if item does not exist
            item = {'name': name, 'price':data['price']}
            items.append(item)
        else:

            item.update(data)
        return item


class ItemList(Resource):
    def get(self):
        return {'items': items}


api.add_resource(Student, '/item/<string:name>') # http://127.0.0.1:5000/student/Rolf
api.add_resource(ItemList, '/items')

app.run(port=5000, debug=True)