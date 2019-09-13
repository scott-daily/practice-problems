/*
In the given string find the first longest word and output it.

Input data:
Given a string in a single line. Words in the string are separated by a single space.

Output data:
Output the longest word. If there are several such words, you should output the one, which occurs earlier.
*/

import java.util.*;

class LongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        String longestWord = "";

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() > longestWord.length()) {
                longestWord = inputArray[i];
            }
        }
        System.out.println(longestWord);
    }
}
