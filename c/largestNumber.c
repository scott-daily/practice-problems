/* 
Write a program that finds the largest number in a series of numbers entered by the user.
The program must prompt the user to enter numbers one by one.  
When they enter a 0 or negative number, the program displays the largest number and exits.
*/

#include <stdio.h>

int main(void)
{
    double input, largest;

    printf("Please enter a number. (Press 0 to view the largest number entered and exit): ");
    scanf("%lf", &input);
    while (input > 0){
        if (input > largest) {
            largest = input;
            printf("Enter another number. (0 to exit): ");
            scanf("%lf", &input);
        }
        else {
            printf("Enter another number. (0 to exit): ");
            scanf("%lf", &input);
        }
    }
    printf("The largest number entered was %lf", largest);
    
    return 0;
}