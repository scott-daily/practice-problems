/*
Task:
Given an array/list [] of n integers , find maximum triplet sum in the array, without duplications.
Notes :

-Array/list size is at least 3 .
-Array/list numbers could be a mixture of positives , negatives and zeros .
-Repetition of numbers in the array/list could occur , So (duplications are not included when summing).

Input >> Output Examples

1- maxTriSum ({3,2,6,8,2,3}) ==> return (17)
*/

import java.util.*;

public class TestMaxTriSum
{
    public static int maxTriSum (int[] numbers)
    {
      Arrays.sort(numbers);
      
      int count = 0;
      int total = 0;
        
      for (int i = numbers.length -1; count < 3; i--) {
        if (numbers[i] > numbers[i-1]) {
          total += numbers[i];
          count += 1;
        }
      }
      return total;
    }
}