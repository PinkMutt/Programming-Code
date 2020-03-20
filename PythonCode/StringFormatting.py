# You can comment using the '#' symbol
# We will be practicing some Strings

# print method
string_1 = "Hello"
print(string_1)

# C-style string formatting
# "%s" and "%d" are argument specifiers
"""
basic argument specifiers:
    %s - String (or any object with a string representation, like numbers)
    %d - Integers
    %f - Floating point numbers
    %.<number of digits>f - Floating point numbers with a fixed amount of digits of the right of the dot.
    %x/%X - Integers in hex representation (lowercase/uppercase)
"""
print("%s" % string_1)

# using multiple argument specifiers
# example 1:
string_2 = "World!"
print("%s %s" % (string_1, string_2))

# example 2:
number = 2
print("%s %d My %s" % (string_1, number, string_2))

# Any object which is not a string can be formatted using the %s operator
mylist = [1, 2, 3]
print("A list: %s" % mylist)

# A Tuple is a collection of Python objects separated by commas.
data = ("Can you say", "at", 4)
print("%s %s %d" % data)