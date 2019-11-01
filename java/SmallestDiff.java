/*
Given a string of at least two positive numbers, the sum of the digits of each number in the string is called it's weight.  
Find the two numbers whose difference of "weights" is smallest.
If two pairs of numbers have equal differences, then return the pair with the lower weight. 
If both of these are equal, then return the pair with the lowest indexes.

Return an int[][] array with two sub arrays, both containing the following:
[The weight of the number, the index in the string of the corresponding number, and the actual number]

Example Input:
"189437 110 263080 175 55764 13 257647 53 486111 27 66"
Example Output:
[[8, 7, 53], [9, 9, 27]]
*/
import java.util.*;

class SmallestDiff {
    public static int[][] closest(String strng) {

        int[][] resultArray = new int[2][];
        int[][] allData = new int[strng.split(" ").length][];

        int index = 0;
        for (String number : strng.split(" ")) {
            int[] tempArray = new int[3];
            int tempSum = 0;
            int tempNum = Integer.valueOf(number);
            for (int i = 0; i < number.length(); i++) {
                tempSum += Character.getNumericValue(number.charAt(i));
            }
            tempArray[0] = tempSum;
            tempArray[1] = index;
            tempArray[2] = tempNum;
            allData[index] = tempArray;
            index++;
        }
        Arrays.sort(allData, Comparator.comparingInt(arr -> arr[0]));
        
        int[] diffArray = new int[3];
        diffArray[0] = Integer.MAX_VALUE;

        for (int i = 0; i < allData.length-1; i++) {
            if (allData[i+1][0] - allData[i][0] < diffArray[0]) {
                diffArray[0] = allData[i+1][0] - allData[i][0];
                diffArray[1] = i;
                diffArray[2] = i+1;
            }
        }
        resultArray[0] = allData[diffArray[1]];
        resultArray[1] = allData[diffArray[2]];
 
        return resultArray;
    }
    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(closest("315411 165 53195 87 318638 107 416122 121 375312 193 59")));
    }
}