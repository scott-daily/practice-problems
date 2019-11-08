/* Given a BigInteger N (Which is how many Fibonacci numbers to calculate to find the perimeter of the sum of them + 1), 
return a BigInteger which contains the total perimeter of all the Fibonacci numbers.
Calculate the total perimeter by adding all the Fibonacci numbers and multiplying by four.
*/  
import java.math.BigInteger;
import java.util.*;

public class SquarePerimeters {
	public static BigInteger getTotalPerimeter(BigInteger n) {
        
        BigInteger result = new BigInteger("0");

        List<BigInteger> squareList = new LinkedList<BigInteger>();
        squareList.add(new BigInteger("1"));
        squareList.add(new BigInteger("1"));

        for (int i = 2; i < n.intValue() + 1; i++ ) {
            int secondLastIndex = squareList.size()-2;
            int lastIndex = squareList.size()-1;
            squareList.add(squareList.get(secondLastIndex).add(squareList.get(lastIndex)));
        }

        for (BigInteger number : squareList) {
            result = result.add(number);
        }

        return result.multiply(new BigInteger("4"));
    }
    public static void main(String[] args) {
        BigInteger test = new BigInteger("2");
        System.out.println(getTotalPerimeter(test));
    }
}