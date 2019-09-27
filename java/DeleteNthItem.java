/*
Given a list lst and a number N, create a new list that contains each number of lst at most N times without reordering. 
For example if N = 2, and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], 
drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times, 
and then take 3, which leads to [1,2,3,1,2,3].

Example:
EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1) // return [20,37,21]
*/

import java.util.*;

class DeleteNthItem {
    public static void main(String[] args) {
        int n = 3;
        int[] input = new int[] {1,1,3,3,7,2,2,2,2};
        
        int[] resultArray = deleteNth(input,n);

        for (int i : resultArray){
            System.out.print(i + " ");
        }
    }

    static int[] deleteNth(int[] array, int n) {
        HashMap<Integer, Integer> itemCounts = new HashMap<Integer, Integer>();
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            int count = itemCounts.containsKey(array[i]) ? itemCounts.get(array[i]) : 0;
            itemCounts.put(array[i], count + 1);
            if (count < n) {
                resultList.add(array[i]);
            }
        }
        return resultList.stream().mapToInt(i->i).toArray();
    }
}