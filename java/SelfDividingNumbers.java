/*
 A self-dividing number is a number that is divisible by every digit it contains.
For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
Also, a self-dividing number is not allowed to contain the digit zero.
Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible. 
Input: 
left = 1, right = 22
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
*/
import java.util.*;

public class SelfDividingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> results = new ArrayList<Integer>();

        List<String> numbers = new ArrayList<String>();

        for (int i = left; i <= right; i++) {
            numbers.add(String.valueOf(i));
        }

        for (String word : numbers) {
            boolean currWord = true;
            for (Character digit : word.toCharArray()) {
                if (Character.getNumericValue(digit) != 0 && Integer.valueOf(word) % Character.getNumericValue(digit) != 0) {
                    currWord = false;
                    break;
                }
                if (Character.getNumericValue(digit) == 0) {
                    currWord = false;
                    break;
                }
            }
            if (currWord) {
                results.add(Integer.valueOf(word));
            }
        }
        return results;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(selfDividingNumbers(1,22).toArray()));
    }
}