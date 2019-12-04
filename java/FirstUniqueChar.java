/*
Given a string, find the first non-repeating character in it and return it's index. 
If it doesn't exist, return -1. 
Example Input: "aiabboixeboeb"
Example Output: 7
*/
import java.util.*;

public class FirstUniqueChar {
    public static int firstUniqChar(String s) {
        
        Map<Character,Integer> charCounts = new HashMap<Character,Integer>();

        for (Character letter : s.toCharArray()) {
            int count = charCounts.containsKey(letter) ? charCounts.get(letter) : 0;
            charCounts.put(letter, count + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (charCounts.get(s.charAt(i)) == 1) 
                return i;
        }

        return -1;
    }
    public static void main(String[] args) {
        String test = "aiabboixeboeb";

        System.out.println(firstUniqChar(test));
    }
}