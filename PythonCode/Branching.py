# Branching if/ elif/ else:

i = 3
if i < 3:
    print 'less than 3'
elif i < 5:
    print 'less than 5'
else:
    print '5 or more'


# "in" operator checks if a specified object exists within an iterable object container, such as a list:
name = "John"
if name in ["John", "Rick"]:
    print("Your name is either John or Rick.")

# python's code uses indentation to define code blocks.

# "True" boolean variable is given, or calculated using an expression, such as an arithmetic comparison.
# An object which is not considered "empty" is passed.
# The "is" operator does not match the values of the variables, but the instances themselves.
x = [1,2,3]
y = [1,2,3]
print(x == y) # Prints out True
print(x is y) # Prints out False

# The "not" inverts a boolean expression.
print(not False) # Prints out True
print((not False) == (False)) # Prints out False
