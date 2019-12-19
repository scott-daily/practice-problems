#include <stdio.h>

int main()
{
    void swap(int *a, int *b);

    int x = 2;
    int y = 1;

    printf("x: %i & y: %i\n", x, y);
    swap(&x, &y);
    printf("x: %i & y: %i\n", x, y);

    return 0;
}

void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}