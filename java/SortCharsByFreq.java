/*
Given a string, sort it in decreasing order based on the frequency of characters.
Input: "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
*/
import java.util.*;

public class SortCharsByFreq {
    public static String frequencySort(String s) {

        Map<Character,Integer> charCounts = new HashMap<Character,Integer>();

        for (Character letter : s.toCharArray()) {
            int count = charCounts.containsKey(letter) ? charCounts.get(letter) : 0;
            charCounts.put(letter, count + 1);
        }

        StringBuilder result = new StringBuilder();

        charCounts.entrySet().stream()
        .sorted((k1, k2) -> -k1.getValue()
        .compareTo(k2.getValue())).forEach(e -> {
        for(int i = 0 ;i < e.getValue(); i++) 
            result.append(e.getKey());
        });

        return result.toString();
    }
    public static void main(String[] args) {
        String test  = "bjdadaadjjjeelllllndd";

        System.out.println(frequencySort(test));
    }
}