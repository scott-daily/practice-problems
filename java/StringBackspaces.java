/*
Assume "#" is like a backspace in string. This means that string "a#bc#d" actually is "bd"
Your task is to process a string with "#" symbols.

Examples
"abc#d##c"      ==>  "ac"
"abc##d######"  ==>  ""
"#######"       ==>  ""
""              ==>  ""
*/
import java.util.*;

public class StringBackspaces {
    public static String cleanString(String s) {
        
        Deque<Character> letterStack = new ArrayDeque<Character>();
        Deque<Character> backspaceStack = new ArrayDeque<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                letterStack.push(s.charAt(i));
            }
            else {
                if (letterStack.isEmpty()) {
                    backspaceStack.push(s.charAt(i));
                }
                else {
                    letterStack.pop();
                }
            }
        }

        StringBuilder result = new StringBuilder();
        if (letterStack.size() > 0) {
            while (letterStack.size() > 0) {
                result.append(letterStack.removeLast());
            }
        }
        
        return result.toString();
    }
    public static void main(String[] args) {
        String test = "abc##d######";

        System.out.println(cleanString(test));
    }
}