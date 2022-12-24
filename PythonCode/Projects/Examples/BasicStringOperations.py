# The string can take in with double and single quotes.
astring = "Hello world!"
astring2 = 'Hello world!'

# len() static method returns the length of the string
# it works with both single or double quotes
print("Double Quotes: %s" % len(astring))
print("Single Quotes: %s" % len(astring2))

# <stringName>.index("<char>") - the INDEX is a instance method that returns the index of
# the first appearance of the char.
# "o" is the index 4 of astring, the first index starts at 0
print("Index: %s" % astring.index("o"))

# <stringName>.count("<char>") - the COUNT is a instance method that returns how many of
# the selected char are in the string.
print("Count: %s" % astring.count("l"))

# <stringName>[<number>:<number>] - the SLICE instance method that holds an index range and prints out the chars.
# Pay Attention to how the second number will print to index 6 not 7.
print("Slice: %s" % astring[3:7])

# <stringName>.[<number>:<negative number>] - negative numbers with start from the end.
print("Negative Number: %s" % astring[3:-3])

# <stringName>[start:stop:step] - extended slice syntax prints based on the step size
print("Extended Slice: %s" % astring[3:7:3])
# so it will print every 3rd step.

# You can print it backwards by making it step backwards
print("Backwards: %s" % astring[::-1])

# <stringName>.upper() - instance method that will make all the characters uppercase.
print("Uppercase: %s" % astring.upper())

# <stringName>.lower() - instance method that will make all the characters lowercase.
print("Lowercase: %s" % astring.lower())

# <stringName>.startswith("<String>") - instance method that returns a boolean based on whether the String begins with
# the string provided.
print(astring.startswith("Hello"))

# <stringName>.endswith("<String>") - instance method that returns a boolean based on whether the String ends
# with the string provided.
print(astring.endswith("adsfasdfasdf"))

# <stringName>.split("<String>") - instance method splits from the string provided into a list.
afterwords = astring.split(" ")
print(afterwords)