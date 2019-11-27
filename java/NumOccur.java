// Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class NumOccur {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> arrMap = new HashMap<Integer,Integer>();

        for (int num : arr) {
            int count = arrMap.containsKey(num) ? arrMap.get(num) : 0;
            arrMap.put(num, count + 1);
        }

        for (Integer num : arrMap.values()) {
            int count = Collections.frequency(arrMap.values(), num);
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] test = new int[]{1};

        System.out.println(uniqueOccurrences(test));
    }
}