/*
 * Conditions
 */
#include <stdio.h>
int main(){
    int target = 10;
    // if statements allow us to check if an expression is true or false.
    if (target == 10){
        printf("Target is equal to 10.");
    }
    // else if statements allows you to gives a second option if the first condition doesn't pass.
    else if(target < 10){
        printf("Target is less than 10.")
    }
    // else statement is used when none of the other conditional statements pass.
    else{
        printf("Target is greater than 10.")
    }
}
