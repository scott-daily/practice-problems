/*
Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
You may return any answer array that satisfies this condition.

Input: [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also be accepted.
*/
import java.util.Arrays;

public class SortArrayParity {
    public static int[] sortArrayByParityII(int[] A) {
        
        int temp = 0;
        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                if (A[i] % 2 != 0) {
                    temp = A[i];
                    for (int j = i + 1; j < A.length; j++) {
                        if (A[j] % 2 == 0) {
                            A[i] = A[j];
                            A[j] = temp;
                            break;
                        }
                    }
                }
            }
            else {
                if (A[i] % 2 == 0) {
                    temp = A[i];
                    for (int j = i + 1; j < A.length; j++) {
                        if (A[j] % 2 != 0) {
                            A[i] = A[j];
                            A[j] = temp;
                            break;
                        }
                    }
                }
            }
        }
        return A;
    }
    public static void main(String[] args) {
        int[] test = new int[]{4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(test)));
    }
}