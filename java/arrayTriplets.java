/*
Write a program that reads an array of ints and outputs the number of "triples" in the array.

A "triple" is three consecutive ints in increasing order differing by 1 (i.e. 3,4,5 is a triple, but 5,4,3 and 2,4,6 are not).

Input data format

The first line contains the size of an array.
The second line contains elements of the array separated by spaces.

Output data format

Only a single integer value - the number of "triples".

Sample Input 1:

6
1 2 4 5 6 7

Sample Output 1:

2
*/

import java.util.*;

public class ArrayTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt(); 
        }

        System.out.println(getNumberOfTriplets(array));

    }

    public static int getNumberOfTriplets(int[] toBeChecked) {
        int numberOfTriplets = 0;
        int nextIndex = 0;
        while (nextIndex < toBeChecked.length - 2) {
            int first = toBeChecked[nextIndex];
            int second = toBeChecked[nextIndex + 1];
            int third = toBeChecked[nextIndex + 2];
            if ((first + 1 == second) && (second + 1 == third)) {
                numberOfTriplets++;
            }
            nextIndex++;
        }
        return numberOfTriplets;
    }
}