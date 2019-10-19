/*
Create a method that determines if a given number is prime.
*/

public class PrimeFinderTwo {
    public static boolean isPrime(int num) {
        boolean isPrime = true;
        
        if (num <= 1) {
            isPrime = false;
            return isPrime;
        }
        
        int squareOfNum = (int) Math.sqrt(num);

        for (int i = 2; i <= squareOfNum; i++){
            if (num%i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}