/*
Given a long, return an array containing two consecutive Fibonacci numbers and 1 for true or 0 for false.
True if two adjacent Fibonacci numbers multiplied together equals the given number.  
False if the product of two Fibonacci numbers exceeds the given number
and no pair of consecutive smaller Fibonacci numbers equaled the given number.

Example Input:
2
Example Output:
[1,2,1]
*/
import java.util.*;

public class FibProducts { 
	public static long[] fibProduct(long prod) {
        
        List<Long> fibList = new LinkedList<Long>(Arrays.asList(0L, 1L, 1L));
        long[] resultArray = new long[3];

        while (true) {
            if (fibList.get(fibList.size()-1) * fibList.get(fibList.size()-2) == prod) {
                resultArray[0] = fibList.get(fibList.size()-2);
                resultArray[1] = fibList.get(fibList.size()-1);
                resultArray[2] = 1;
                break;
            }
            else if (fibList.get(fibList.size()-1) * fibList.get(fibList.size()-2) > prod) {
                resultArray[0] = fibList.get(fibList.size()-2);
                resultArray[1] = fibList.get(fibList.size()-1);
                resultArray[2] = 0;
                break;
            }
            else {
                fibList.add(fibList.get(fibList.size()-1) + fibList.get(fibList.size()-2));
            }
        }
		return resultArray;
   }
   public static void main(String[] args) {
       System.out.println(Arrays.toString(fibProduct(4895)));
   }
}