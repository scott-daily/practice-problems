/*
Given an array, find the int that appears an odd number of times.
There will always be only one integer that appears an odd number of times.
*/

public class FindOdd {
    public static int findIt(int[] a) {

      int result = 0;

      for (int i = 0; i < a.length; i++) {
        int count = 0;
        for (int j = 0; j < a.length; j++) {
          if (a[i] == a[j]) {
            count++;
          }
        }
        if (count % 2 != 0) {
          result = a[i];
          break;
        }
      } 
    return result;
    }
}