# Variables

ten = 10

# Dynamic Typing - the variable itself does not have a strict type.
# This means that you can change the value to any type.

ten = 'ten'

# converting variable type
print('Day ' + str(1))

# Integer Division - If they are both Integers

print('Integer Division: ' + str(10/3))

# Float Division - having a float within the division will force float division
print('Float Division: ' + str(float(10)/3))

# Internals: type, value, and id.
# type is also a type of object(<type>).
a = 1
print(type(a))
print('a : ' + str(type(a)))

# id is also a type of object(<int>).
print(id(a))
print'a : ' + str(id(a))

b = 2
print(type(b))
print(id(b))

# instances can be substracted from there value to point to a location.
b = b - 1
print(type(b))
print(id(b))
