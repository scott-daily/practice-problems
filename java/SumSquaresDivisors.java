/*
Given two integers m, n (1 <= m <= n) find all the integers between m and n (inclusive)
whose sum of squared divisors is a square itself.

Examples:
list_squared(1160, 3540) --> [[1434, 2856100], [1673, 2856100], [1880, 4884100]]
list_squared(75, 400) --> [[246, 84100], [287, 84100]]
*/
import java.util.*;

public class SumSquaresDivisors {
	public static String listAllSquared(long m, long n) {

        ArrayList<ArrayList<Long>> resultLists = new ArrayList<ArrayList<Long>>();

        for (long i = m; i <= n; i++) {
            ArrayList<Long> tempList = new ArrayList<Long>();
            if (isSumSquare(i) != -1) {
                tempList.add(i);
                tempList.add(isSumSquare(i));
                resultLists.add(tempList);
            }
        }
        
        Long[][] resultArray = resultLists.stream()
            .map(arr -> arr.toArray(Long[]::new))
            .toArray(Long[][]::new);

        return Arrays.deepToString(resultArray);
    }

    public static long isSumSquare(long number) {
        List<Integer> divisorList = new ArrayList<Integer>();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisorList.add(i);
            }
        }

        long sum = 0;
        for (Integer num : divisorList) {
            sum += num * num;
        }

        double squareRoot = Math.sqrt(sum);
        if (squareRoot % 1 == 0) {
            return sum;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(listAllSquared(75,400));
    }
}