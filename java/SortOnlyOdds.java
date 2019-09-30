/*
Write a method to sort an array of integers, only sorting the odd numbers in ascending order. 
The even integers (including 0) must remain in the same position they were at in the original array.

Example Input: 
sortArray([5, 3, 2, 8, 1, 4])

Example Output:
[1, 3, 2, 8, 5, 4]
*/

import java.util.*;

public class SortOnlyOdds {
    public static int[] sortArray(int[] array) {
        if (array.length == 0){
            return array;
        }

        List<Integer> oddIndexes = new ArrayList<Integer>();
        List<Integer> oddNums = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) != 0) {
                oddIndexes.add(i);
                oddNums.add(array[i]);
            }
        }
        
        List<Integer> resultList = new ArrayList<Integer>();
        Collections.sort(oddNums);

        int oddIndexCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (oddIndexes.contains(i)) {
                int temp = oddNums.get(oddIndexCount);
                resultList.add(i, temp);
                oddIndexCount++;
            }
            else {
                resultList.add(array[i]);
            }
        }
        return resultList.stream().mapToInt(i->i).toArray();
    }
}