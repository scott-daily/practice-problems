/*
You are given an array of strings and an integer k. 
Your task is to return the first longest string consisting of k consecutive strings in the array.

Example Input: 
{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2

Example Output:
"abigailtheta"
*/

import java.util.*;

public class ConsecutiveStrings {
    public static String longestConsec(String[] strarr, int k) {

        if (strarr.length < k || strarr.length == 0 || k <= 0) {
            return "";
        }

        String longestString = "";

        for (int i = 0; i < strarr.length; i++) {
            String[] tempSlice = Arrays.copyOfRange(strarr, i, i + k); 
            String tempString = String.join("", tempSlice);
            if (tempString.length() > longestString.length()) {
                longestString = tempString;
            }
        }
        return longestString;
    }

    public static void main(String[] args) {
        String[] testArray = new String[] {"zone", "abigail", "theta", "form", "libe", "zas"};

        System.out.println(longestConsec(testArray, 2));
    }
}