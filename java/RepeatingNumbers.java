/*
Write a program that prints a part of the sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ... (the number is repeated as many times as the number it equals). 
The input to the program is a positive integer n: the number of the elements of the sequence the program should print. 
Output the sequence of numbers, written in a single line, space-separated.
*/

import java.util.*;

class RepeatingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (count < n) {
                    System.out.print(i + " ");
                    count++;
                }
            }
        }
    }
}
