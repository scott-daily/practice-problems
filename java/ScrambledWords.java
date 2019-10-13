/*
Complete the function scramble(str1, str2) which returns true if a portion of str1 characters can be rearranged to match str2, otherwise it returns false.
Note: Performance needs to be considered
*/

import java.util.*;
import java.util.stream.*;

public class ScrambledWords {
    public static boolean unscramble(String str1, String str2) {

        if (str1.length() < str2.length()) {
            return false;
        }
    
        List<Character> listOne = str1.chars().mapToObj((i) -> Character.valueOf((char)i)).collect(Collectors.toList());
        List<Character> listTwo = str2.chars().mapToObj((i) -> Character.valueOf((char)i)).collect(Collectors.toList());

        listOne.retainAll(listTwo);

        Map<Character, Integer> listOneMap = new HashMap<>();
        Map<Character, Integer> listTwoMap = new HashMap<>();

        for (Character item : listOne) {
            if (!listOneMap.containsKey(item)) {
                listOneMap.put(item, 1);
            }
            else {
                listOneMap.put(item, listOneMap.get(item) + 1);
            } 
        }
        for (Character item : listTwo) {
            if (!listTwoMap.containsKey(item)) {
                listTwoMap.put(item, 1);
            }
            else {
                listTwoMap.put(item, listTwoMap.get(item) + 1);
            } 
        }

        List<Integer> listOneValues= new ArrayList<Integer>(listOneMap.values());
        List<Integer> listTwoValues= new ArrayList<Integer>(listTwoMap.values());
        
        boolean matches = true;

        for (int i = 0; i < listOneValues.size(); i++) {
            if (listOneValues.get(i) < listTwoValues.get(i) || listOneMap.keySet().equals(listTwoMap.keySet()) == false) {
                matches = false;
                break;
            }
        }
        return matches;
    }

    public static void main(String[] args) {
        String test1 = "cedewaraaossoqqyt";
        String test2 = "codewars";

        System.out.println(unscramble(test1,test2));
    }
}