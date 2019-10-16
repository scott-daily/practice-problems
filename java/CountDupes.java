/*
Create a function that returns how many letters (case insensitive) or numbers occur in a string more than once.
*/
import java.util.*;

public class CountDupes {
    public static int duplicateCount(String text) {

        Map<Character, Integer> textMap = new HashMap<>();

        for (Character letter : text.toLowerCase().toCharArray()) {
            if (!textMap.containsKey(letter)) {
                textMap.put(letter, 1);
            }
            else {
                textMap.put(letter, textMap.get(letter) + 1);
            } 
        }

        int count = 0;

        for (Integer value : textMap.values()) {
            if (value >= 2) {
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String test = "aabBcde";
        
        System.out.println(duplicateCount(test));
    }
}