# Classes and Object
# Objects are an encapsulation of variable and functions into a single entity. Objects get their variables and functions
# from classes.
# Classes are essentially a template to create your objects.

class MyClass:
    variable = "blah"

    def function(self):
        print("This is a message inside the class.")

# This will instantiate the object with the class.

myobjectx = MyClass()
print(myobjectx.variable)

# You can change the variable with the object
myobjectx.variable = "something else"
