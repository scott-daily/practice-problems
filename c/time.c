/* Short program that converts from a 24 Hour time to 12 Hour time. */


#include <stdio.h>

int main(void)
{
    int hours;
    int minutes;
    int difference;

    printf("Enter a 24-hour time:");
    scanf("%d:%d", &hours, &minutes);

    if (hours == 0){
        printf("Equivalent 12-hour time: 12:%d AM", minutes);
    } else if (hours < 12) {
        printf("Equivalent 12-hour time: %d:%d AM", hours,minutes);
    }
    else if (hours == 12){
        printf("Equivalent 12-hour time: %d:%d PM", hours,minutes);
    }
    else {
        difference = hours - 12;
        printf("Equivalent 12-hour time: %d:%d PM", difference, minutes);
    }
    return 0;
}