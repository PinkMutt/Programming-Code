#   Scanner used for Lexical Analysis
#   takes input string and tokens them
from array import array

# split characters based off spaces
def toToken(l: str) -> str:   
    x = l.split(" ")
    return x
        



while True:
    try:
        str = input("Enter command: \n")
        arr = list(str)     # Array for character of the initial input
        arr2 = list(toToken(str))          # Array for Tokens

        print(str)
        print(arr)
        print(arr2)
    except EOFError as e:
        print("EOF ERROR" + e)
    except KeyboardInterrupt:
        print("Exited the Program")
        break