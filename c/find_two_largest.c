/*
When passed an array A of length N, the function will search A for its
largest & second largest elements, storing them in the variables pointed to
by largest & second_largest, respectively.
*/
#include <stdio.h>

int main()
{
    void find_two_largest(int a[], int n, int *largest, int *second_largest);

    int n = 10;
    int largest, second_largest, i;
    int b[n];

    printf("Enter %d numbers: ", n);
    for (i = 0; i < n; i++) {
        scanf("%d", &b[i]);
    }

    find_two_largest(b, n, &largest, &second_largest);

    printf("Largest: %d\n", largest);
    printf("Second largest: %d\n", second_largest);

    return 0;
}

void find_two_largest(int a[], int n, int *largest, int *second_largest)
{
    int i;

    if (a[0] > a[1]) {
        *largest = a[0];
        *second_largest = a[1];
    } else {
        *largest = a[1];
        *second_largest = a[0];
    }

    for (i = 2; i < n; i++) {
        if (a[i] > *largest) {
            *second_largest = *largest;
            *largest = a[i];
        } else if (a[i] > *second_largest) {
            *second_largest = a[i];
        }
    }
}