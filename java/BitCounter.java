/*
Create a function that takes an integer as input and returns the number of bits that are equal to one in the binary representation of that number.
*/
public class BitCounter {
	public static int countBits(int n){
        
        int count = 0;

        for (char digit : Integer.toBinaryString(n).toCharArray()) {
            if (digit == '1') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int test = 1234;
        System.out.println(countBits(test));
    }
}