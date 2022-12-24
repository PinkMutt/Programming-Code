def add(x,y):
    return x+y
def subtract(x,y):
    return x-y
def multiply(x,y):
    return x*y
def division(x,y):
    return x/y

print('select operation')
print('1. add')
print('2. subtract')
print('3. multiply')
print('4. divide')

while True:
    try:
        choice = input('enter choice(1/2/3/4)')

        if choice in {'1','2','3','4'}:
            num1= int (input('what is your first number?  \n'))
            num2= int (input('what is your second number? \n'))
            if choice == '1' :
                    print(add(num1,num2))
            elif choice == '2' :
                    print(subtract(num1,num2))
            elif choice == '3' :
                    print(multiply(num1,num2))
            elif choice == '4' :
            print(division(num1,num2))  
        else:
            print("invalid selection.")
        break
except EOFError:
    print("EOF ERROR")