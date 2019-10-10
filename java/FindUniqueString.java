/*
There is an array of strings. All the strings contains similar letters, except for one. Try to find it!

Example Input: ["Aa", "aaa", "aaaaa", "BbBb", "Aaaa", "AaAaAa", "a"]
Example Output: "BbBb"

Example Input: ["abc", "acb", "bac", "foo", "bca", "cab", "cba"]
Example Output: "foo"
*/

import java.util.*;

public class FindUniqueString {
    public static String findUnique(String arr[]) {

        ArrayList<String> list = new ArrayList<String>();
        
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            String temp = removeDupeChars(arr[i].toLowerCase().trim());
            list.add(temp);
        }

        if (Collections.frequency(list, list.get(0)) > 1) {
            String toRemove = list.get(0);
            while (list.contains(toRemove)) {
                list.remove(toRemove);
            }
        }

        for (String s : arr) {
            String temp = removeDupeChars(s).toLowerCase();
            if (list.contains(temp)) {
                result = s;
            }
        }
        return result;
    }

    public static String removeDupeChars(String letters) {
        char[] chars = letters.toCharArray();
        Arrays.sort(chars);
        Set<Character> charSet = new HashSet<Character>();
            for (char c : chars) {
                charSet.add(c);
            }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String[] testArray = {"abc", "acb", "bac", "foo", "bca", "cab", "cba"};

        System.out.println(findUnique(testArray));
    }
}