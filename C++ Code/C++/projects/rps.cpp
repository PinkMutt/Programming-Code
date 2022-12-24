#include <iostream>
#include <cmath>
using namespace std;
// TODO(Dragon): 
//    * Exception handling on Input
//    * Encapsulating the code out of main().

/*
Rock, Paper, Scissor Game

Player input will be go against the computer
*/
int main() {
    srand(time(0));
    
    int value = rand(), choice = 0, input = 0, p1 = 0, pc = 0;

    cout << "Welcome Player to Rock, Paper, Scissors!" << endl; 
    cout << "This game is a 1v1 best out of 3, so Good Luck!" << endl;

    while (p1 < 3 && pc < 3) {    
        int max = 3 * ((RAND_MAX + 1u) / 3);

        while(value >= max)     // Corrects for Modulus Bias of %n.
            value = rand();
        choice = value % 3 + 1;


        cout << "Choose a Number:" << endl;
        cout << "[1]    Rock" << endl;
        cout << "[2]    Paper" << endl;
        cout << "[3]    Scissor" << endl << endl;

        cout << input << endl;
        try {
        cin >> input;
        }
        cout << input << endl;

        if(input == choice) {    // tie condition
            cout << "You guys Tied!" << endl << endl;
        } else if(input == 1 && choice == 3 ||
         input == 2 && choice == 1 || 
         input == 3 && choice == 2) {   // win condition
            p1++;
            cout << "Player 1 Wins!" << endl;
            cout << p1 << " to " << pc << endl << endl;
        } else if(!isnan(input)) {
            input = 0;
            cout << "Invalid Input, try again." << endl << endl;
        }
         else {        // loss condition
            pc++;
            cout << "Computer Wins!" << endl;
            cout << p1 << " to " << pc << endl << endl;
        }
    }
    if (p1 > pc)
        cout << "You won the Game!" << endl;
    else
        cout << "The Computer won the game!" << endl;
}