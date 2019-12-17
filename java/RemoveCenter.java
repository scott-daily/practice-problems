/*
Write a program that reads a string, and then outputs the string without its middle character when the length is odd, and without the middle 2 characters when the length is even.
Sample Input 1: Hello
Sample Output 1: Helo
Sample Input 2: abcd
Sample Output 2: ad
*/
import java.util.Scanner;

public class RemoveCenter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.length() % 2 == 0) {
            int midPoint = (input.length() / 2) - 1;
            System.out.println(input.substring(0, midPoint) + input.substring(midPoint+2));
        }
        else {
            int midPoint = input.length() / 2;
            System.out.println(input.substring(0,midPoint) + input.substring(midPoint + 1));
        }
    }
}