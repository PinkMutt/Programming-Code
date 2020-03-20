# Dictionaries is a data type similar to arrays, instead of indexes they use keys and values.
# Each value stored in a dictionaries can be accessed using a key, which is any type of object in of using its index to address it.

phonebook = {}
phonebook["John"] = 938477566
phonebook["Jack"] = 938377264
phonebook["Jill"] = 947662781
print(phonebook)

# you could also do it all at once
phonebook = {
    "John" : 938477566,
    "Jack" : 938377264,
    "Jill" : 947662781
}
print(phonebook)

# Iterating over dictionaries require key value pairs
for name, number in phonebook.items():
    print("Phone number of %s is %d" % (name, number))

# Phonebook.items will print out the keys and values of the dictionaries
print(phonebook.items())

# del <dictionary name>[<stringValue>]

print('new Dictionary: ')
del phonebook["John"] # or you could also use "phonebook.pop(<stringValue)"
print(phonebook)

py_set_num = {77, 88}
