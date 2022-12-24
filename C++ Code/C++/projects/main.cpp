#include <iostream>
using namespace std;
int main() {
    String operation;
    int a, b, result, reset;
    do {
        do {
            cout
                    << "What operation would you like to use?\nAddition\tSubtraction\tMultiplication\tDivision"; << endline;
            cin >> operation;
        } while (
            ((operation.compare("addition")) != 0) ||
            ((operation.compare("Addition")) != 0) ||
            ((operation.compare("subtraction")) != 0) ||
            ((operation.compare("Subtraction")) != 0) ||
            ((operation.compare("multiplication")) != 0) ||
            ((operation.compare("Multiplication")) != 0) ||
            ((operation.compare("division") != 0)) ||
            ((opertaion.compare("Division") != 0)));

        cout << "Type the first number and then a space following the second number:" << endline;

        switch (operation) {
            case "Addition", "addition":
                result = addition(a, b);
                break;
            case "Subtraction", "subtraction":
                result = subtraction(a, b);
                break;
            case "Multiplication", "multiplication":
                result = multiplication(a, b);
                break;
            case "Division", "division":
                result = division(a, b);
                break;
        }
        cout << "result: ", result << endline;
        do {
            cout << "Enter 1 to reset or 0 to end: ";
            cin >> &reset;
        } while(reset != 1 || reset != 0)
    } while(reset == 1)
}

int addition( int a, int b){
    return a + b;
}
int subtraction(int a, int b){
    return a - b;
}
int multiplication(int a, int b){
    return a * b;
}
int division(int a, int b){
    return a / b;
}