/*
You are given an input string. 
Replace each character with how many times it has occurred and return this new string.

Example:
input = "maryhadalittlelamblittlelamb"

Output:
result = "1111121311122134214234526532"
*/

import java.util.*;

public class CountChars {
    public static String numericals(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int count = map.containsKey(s.charAt(i)) ? map.get(s.charAt(i)) : 0;
            map.put(s.charAt(i), count + 1);
            sb.append(map.get(s.charAt(i)));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String x = "maryhadalittlelamblittlelamb";

        System.out.println(numericals(x));
    }
}