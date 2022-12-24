# Author: Dragon Liu
# Date: 08/25/2019 @ 14:51
# Assignment: Fibonacci Series

def fib():
    a, b = 1, 1
    while 1:
        yield a # yield statement is used to define generators.
        # The yield statement holds the value till the next invocation. 
        a, b = b, a + b

# testing
import types
print("type: %s" % str(type(fib())))

counter = 0
for n in fib():
    print(n)
    counter += 1
    if counter == 10:
        break
