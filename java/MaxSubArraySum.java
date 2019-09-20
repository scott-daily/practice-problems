/*
The maximum sum subarray problem consists of finding the maximum sum of a contiguous subsequence in an array.
Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array. 
If the list is made up of only negative numbers, return 0 instead.
Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.
*/

public class MaxSubArraySum {
    public static int sequence(int[] arr) {
        int currentBest = 0;
        int currentSum = 0;
        for (int x : arr) {
            currentSum = Math.max(0, currentSum + x);
            currentBest = Math.max(currentBest, currentSum);
        }
        return currentBest;
    }
}