/*
Sort a string of numbers.  The numbers will be "weighted" according to the sum of its digits.

For example, 99 will have "weight" 18, 100 will have "weight" 1, so in the list 100 will come before 99.
Given a string with the weights of gym members, return this string ordered by "weights", as described above, instead of these numbers.

Example Input:
"56 65 74 100 99 68 86 180 90" 
Example Output:
"100 180 90 56 65 74 68 86 99"

When two numbers have the same "weight", let us class them as if they were strings: 100 is before 180 because its "weight" (1),
is less than the weight of 180 (9). 180 is before 90 since, having the same "weight" (9, 1 + 8 = 9, 9 + 0 = 9), it comes first according to the natural order of Strings.
*/

import java.util.*;
import java.util.stream.IntStream;

public class WeightedSorting {
	public static String orderWeight(String strng) {

        String[] stringArray = strng.split(" ");
        Arrays.sort(stringArray);

        int[] sumArray = new int[stringArray.length];
        int[] indexArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            indexArray[i] = i;
            int tempSum = 0;
            for (int j = 0; j < stringArray[i].length(); j++) {
                int tempNum = Integer.valueOf(stringArray[i].charAt(j));
                tempSum += Character.getNumericValue(tempNum);
            }
            sumArray[i] = tempSum;
        }

        final Object[] sortedIndexes = IntStream.range(0, sumArray.length)
        .mapToObj(i -> new SortNums(sumArray[i], indexArray[i]))
        .sorted()
        .map(i -> i.indexValue)                                     
        .toArray();
        

        StringBuilder resultString = new StringBuilder();

        for (Object i : sortedIndexes) {
            resultString.append(stringArray[Integer.valueOf(i.toString())] + " ");
        }

        return resultString.toString().trim();
    }

    public static class SortNums implements Comparable<SortNums> {
        int sums;
        int indexValue;
    
        public SortNums(int sum, int indexValue) {
            this.sums = sum;
            this.indexValue = indexValue;
        }

        public int compareTo(SortNums otherSum) {
            int result = 0;
            if (this.sums > otherSum.sums) {
                result = 1;
            }
            else if (this.sums < otherSum.sums) {
                result = -1;
            }
            else if (this.sums == otherSum.sums) {
                result = 0;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        String numberTest = "103 123 4444 99 2000";

        System.out.println(orderWeight(numberTest));
    }
}