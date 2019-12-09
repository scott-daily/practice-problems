/*
Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
Note that elements beyond the length of the original array are not written.
Do the above modifications to the input array in place, do not return anything from your function.

Input: [1,0,2,3,0,4,5,0]
Output: null
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
*/
import java.util.Arrays;

public class DuplicateZeros {
     public static void duplicateZeros(int[] arr) {
        
        StringBuilder arrSB = new StringBuilder();
        for (int num : arr) {
            arrSB.append(num);
        }

        String arrString = arrSB.toString().replaceAll("0", "00");
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.getNumericValue(arrString.charAt(i));
        }

        System.out.println(Arrays.toString(arr));
     }
     public static void main(String[] args) {
        int[] test = new int[] {1,0,2,3,0,4,5,0};

        duplicateZeros(test);
     }
}