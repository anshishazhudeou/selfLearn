class User:
    def __init__(self,_id, username, password):

        self.id = _id
        # id is a python keyword, that's why we wanna add an underscore. However, self.id is fine here
        self.username=username
        self.password=password