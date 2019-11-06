/*
Given an array of integers, return a Map<String, List<Integer>> containing the index positions and values of 
all the local maximums in the array.  
If a maximum value appears adjacent to identical values, return the index of the first value in the series.

Example Input: 
{11, 13, 13, 16, 18, -4, 4, 6, -5, 16}
Example Output: 
{pos=[4,7], peaks=[18,6]}
*/
import java.util.*;

public class FindLocalMaximums {
    public static Map<String,List<Integer>> getMaxs(int[] arr) {

        Map<String, List<Integer>> peakMap = new HashMap<String, List<Integer>>();
        peakMap.putIfAbsent("pos", new LinkedList<Integer>());
        peakMap.putIfAbsent("peaks", new LinkedList<Integer>());

        if (arr.length <= 0) {
            return peakMap;
        }

        int tempLow = arr[0];
        int totalRepeats = 0;
        for (int i = 1; i < arr.length-1; i++) {
            if (tempLow < arr[i]) {
                tempLow = arr[i];
                totalRepeats = 0;
            }
            if (arr[i] == arr[i+1]) {
                totalRepeats++;
            }
            if (i - totalRepeats - 1 >= 0 && arr[i] >= arr[i-1] && arr[i] > arr[i-totalRepeats-1] && arr[i] > arr[i+1] && i != arr.length-1) {
                peakMap.get("pos").add(i-totalRepeats);
                peakMap.get("peaks").add(arr[i]);
                tempLow = arr[i+1];
                totalRepeats = 0;
            }
            if (arr[i] != arr[i+1]) {
                totalRepeats = 0;
            }
        }
        return peakMap;
    }
    public static void main(String[] args) {
        int[] testArray = new int[]{11, 13, 13, 16, 18, -4, 4, 6, -5, 16};

        System.out.println(getMaxs(testArray));
    }
} 