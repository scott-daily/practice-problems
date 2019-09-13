/* Write a program that prompts the user for two numbers and returns the greatest common divisor */

#include <stdio.h>

int main(void)
{
    int m, n, temp;

    printf("Please enter two numbers to compute their greatest common denominator: ");
    scanf("%d%d", &m, &n);

    while (n > 0) {
        temp = n;
        n = m % n;
        m = temp;
    }
    printf("The GCD is %d", m);

    return 0;
}