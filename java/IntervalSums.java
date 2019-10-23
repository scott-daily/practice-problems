/*
Write a function that accepts an array of intervals, and returns the sum of all the interval lengths. 
Overlapping intervals should only be counted once.
Intervals are represented by a pair of integers in the form of an array. 
The first value of the interval will always be less than the second value. 
Interval example: [1, 5] is an interval from 1 to 5. The length of this interval is 4.
Example:
[[1,4],[7, 10],[3, 5]] - This length is 7.
*/
import java.util.*;

public class IntervalSums {
    public static int sumIntervals(int[][] intervals) {

        if (intervals == null || intervals.length == 0) {
            return 0;
        } 
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int sum = 0;
        int currentLow = intervals[0][0]; 
        int currentHigh = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int tempLow = intervals[i][0];
            int tempHigh = intervals[i][1];

            if (currentHigh >= tempLow) {
                if (i+1 == intervals.length) {
                    if (currentHigh > tempHigh) {
                        sum += (int) Math.abs(currentHigh - currentLow);
                    }
                    else {
                        sum += (int) Math.abs(tempHigh - currentLow);
                    }
                    break;
                }
                if (currentHigh < tempHigh) {
                    currentHigh = tempHigh;
                }
            }
            else if (currentHigh < tempLow) {
                sum += (int) Math.abs(currentHigh - currentLow);
                currentLow = tempLow;
                currentHigh = tempHigh;
            }
            if (i+1 == intervals.length) {
                sum += (int) Math.abs(currentHigh - currentLow);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] test = new int[][]{{-9679, 3281}, {-9126, 9432}, {-8810, 6682}, {-7127, 7499}, 
        {-6957, 3718}, {-6889, 4848}, {-6336, -801}, {-5766, 4238}, {-5262, 271}, {-5184, 5821},
    {   -455, 6702}, {-127, 7385}, {1086, 8459}, {4104, 7305}};

        System.out.println(sumIntervals(test));
    }
}