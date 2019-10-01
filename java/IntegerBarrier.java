/*
Write a program that reads a sequence of integer numbers in a loop and adds up all numbers. 
If a new number is equal to 0, the program must stop the loop and output the accumulated sum. 
When the sum is equal or exceeded 1000 (the barrier), the program should also stop and output the value equal to sum - 1000.
*/

import java.util.*;

class IntegerBarrier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean broken = false;

        while (!broken && sum < 1000) {
            int temp = scanner.nextInt();
            sum += temp;

            if (temp == 0) {
                System.out.println(sum-temp);
                broken = true;
                break;
            }
        }
        if (!broken || sum >= 1000) {
            System.out.println(sum-1000);
        }
    }
}