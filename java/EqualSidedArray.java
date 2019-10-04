/*
Given an array of integers, return the index where the sum of the integers leading up to index N (not including N),
and the sum of integers following index N, not including N, are equal.
If there is no such index N, then return -1.

Example Input: {1,2,3,4,3,2,1}
Example Output: 3 (returns index 3, since 1 + 2 + 3 == 3 + 2 + 1)
*/

import java.util.*;

public class EqualSidedArray {
    public static int findEvenIndex(int[] arr) {
        int leftSide = 0;
        int rightSide = 0;
        int end = arr.length;

        for (int i = 0; i < end; i++) {
            leftSide = Arrays.stream(arr, 0, i).sum();
            rightSide = Arrays.stream(arr, i+1, end).sum();
            if (leftSide == rightSide) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 3, 2, 1};

        System.out.println(findEvenIndex(array));
    }
}