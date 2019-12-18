/*
The strongness of an even number is the amount of times it can be divided by 2 until it becomes an odd number.

Given a closed interval, (includes endpoints), [n, m], return the even number that is the strongest in the interval. 
If multiple solutions exist, then return the smallest strongest even number.

Constraints: 1 <= n < m <= INT_MAX
*/
public class StrongestEvenNumber {
    public static int strongestEven(int n, int m) {

        int count = 0;
        int highestCount = 0;
        int currentStrongest = 0;
        
        for (int i = n; i <= m; i++) {
            boolean tempStillEven = true;
            int temp = i;
            if (temp % 2 == 0) {
                while (tempStillEven && temp != 1) {
                    if (temp % 2 == 0) {
                        temp = temp / 2;
                        count++;
                    }
                    else {
                        tempStillEven = false;
                        count = 0;
                    }
                    if (temp % 2 != 0) {
                        if (count > highestCount) {
                            highestCount = count;
                            currentStrongest = i;
                            count = 0;
                            tempStillEven = false;
                        }
                    }
                }
            }
        }
        return currentStrongest;
    }
    public static void main(String[] args) {
        System.out.println(strongestEven(1,887344883));
    }
}