
from user import User

"""
users=[
    {
        'id':1,
        'username': 'bob',
        'password': 'asdf'
    }
]
"""
# user now is a list of object, used in database
users=[
    User(1,'bob','asdf')
]


"""username_mapping= {'bob':
    {
        'id':1,
        'username': 'bob',
        'password': 'asdf'
    }
}
"""
username_mapping = {u.username: u for u in users} # we are assigning us as a key value pairs

userid_mapping = {u.id: u for u in users}

"""userid_mapping = {
    {
        'id':1,
        'username': 'bob',
        'password': 'asdf'
    }
}
"""

def authenticate(username, password):
    user = username_mapping.get(username, None) # None is the dafault value
    if user and user.password == password:
        return user


def identity(payload): #payload is the content of JWT Token
    user_id = payload['identity']
    return userid_mapping.get(user_id, None)

