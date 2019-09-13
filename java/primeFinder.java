/* 
Program that identifies whether a number N is prime or not.  If it is not, it returns the smallest divisor of N.
*/

import java.util.*;

class PrimeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        int squareOfN = (int) Math.sqrt(N);
        boolean isPrime = true;
        int divisor = 0;

        for (int i = 2; i <= squareOfN; i++){
            if (N%i == 0){
                isPrime = false;
                divisor = i;
                break;
            }
        }

        if (isPrime){
            System.out.println(N + " is prime.");
        }
        else {
            System.out.println(N + " is not prime. " + divisor + " was the smallest divisor.");
        }
    }
}