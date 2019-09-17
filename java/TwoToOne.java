/*
Take two strings s1 and s2 including only letters from a to z. 
Return a new sorted string, the longest possible, containing distinct letters,
each taken only once - coming from s1 or s2.

Example:

a = "xyaabbbccccdefww"
b = "xxxxyyyyabklmopq"
longest(a, b) -> "abcdefklmopqwxy"
*/

import java.util.*;

class TwoToOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        inputString += scanner.nextLine();

        String noDupes = removeDupes(inputString);
        String[] myArray = noDupes.split("");
        Arrays.sort(myArray);

        String sortedString = "";
        for (int i = 0; i < myArray.length; i++){
            sortedString += myArray[i];
        }
        System.out.println(sortedString);
    }

     public static String removeDupes(String string) {
        char[] chars = string.toCharArray();
        Set<Character> present = new HashSet<>();
        
        int len = 0;
        for (char c : chars)
            if (present.add(c)) {
                chars[len++] = c; {
                }
            }
        return new String(chars, 0, len);
    }
}