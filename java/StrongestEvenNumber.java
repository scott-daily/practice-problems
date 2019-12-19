/*
The strongness of an even number is the amount of times it can be divided by 2 until it becomes an odd number.

Given a closed interval, (includes endpoints), [n, m], return the even number that is the strongest in the interval. 
If multiple solutions exist, then return the smallest strongest even number.

Constraints: 1 <= n < m <= INT_MAX
*/
public class StrongestEvenNumber {
    public static int strongestEven(int n, int m) {
                                                                
        int currentBest = 0;
        int highCount = 0;

        if (n % 2 != 0) {
            n = n + 1;
        }
        
        for (int i = n; i <= m; i += 2) {
            int iCount = Integer.numberOfTrailingZeros(i);
            if (Math.max(iCount, highCount) == iCount) {
                highCount = iCount;
                currentBest = i;
            }
        }
        
        return currentBest;
    }
    public static void main(String[] args) {
        System.out.println(strongestEven(737403836,1941965989));  // expected: 1073741824
    }
}