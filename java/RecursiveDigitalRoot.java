/*
Given a number N, find it's digital root.

The digital root of a natural number is the single digit value obtained 
by an iterative process of summing digits, on each iteration 
using the result from the previous iteration to compute a digit sum. 
The process continues until a single-digit number is reached. 
*/
public class RecursiveDigitalRoot {
    public static int findRoot(int n) {
        
        int tempTotal = 0;
        for (int num : Integer.toString(n).chars().map(c -> c-'0').toArray()) {
            tempTotal += num;
        }

        if (tempTotal > 9) {
            return findRoot(tempTotal);
        }
        else {
            return tempTotal;
        }
    }
    public static void main(String[] args) {
        System.out.println(findRoot(493193));
    }
}