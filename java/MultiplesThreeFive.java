/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
The sum of these multiples is 23.
Create a function that returns the sum of all the multiples of 3 or 5 below the number passed in.
Note: If the number is a multiple of both 3 and 5, only count it once.
*/

public class MultiplesThreeFive {
    public static int findTheSum(int number) {
        
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (i%3 == 0 && i%5 != 0) {
                sum += i;
            }
            else if (i%5 == 0 && i%3 != 0) {
                sum += i;
            }
            else if (i%15 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int test = 20;

        System.out.println(findTheSum(test));
    }
}