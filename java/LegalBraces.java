/*
Create a function that's input is a string of braces, and determines if the braces are in the correct order.

Example Input:
([(])
Example Output:
false
*/
import java.util.*;

public class LegalBraces {
    public static boolean isValid(String braces) {
        Deque<Character> bracesStack = new ArrayDeque<Character>();
        boolean isValid;

        for (Character brace : braces.toCharArray()) {
            if (bracesStack.size() == 0) {
                bracesStack.push(brace);
            }
            else if (bracesStack.size() >= 1) {
                if (brace == '(' || brace == '[' || brace == '{') {
                    bracesStack.push(brace);
                }
            }
            if (brace == ')') {
                if (bracesStack.peek() != null) {
                    if (bracesStack.peek() == '(') {
                        bracesStack.pop();
                    }
                    else if (!bracesStack.contains('(')) {
                        bracesStack.push(brace);
                    }
                }
            }
            else if (brace == ']') {
                if (bracesStack.peek() != null) {
                    if (bracesStack.peek() == '[') {
                        bracesStack.pop();
                    }
                    else if (!bracesStack.contains('[')) {
                        bracesStack.push(brace);
                    }
                }
            }
            else if (brace == '}') {
                if (bracesStack.peek() != null) {
                    if (bracesStack.peek() == '{') {
                        bracesStack.pop();
                    }
                    else if (!bracesStack.contains('{')) {
                        bracesStack.push(brace);
                    }
                }
            }
        }

        if (bracesStack.size() == 0) {
            isValid = true;
        }
        else {
            isValid = false;
        }
        return isValid;
    }
    public static void main(String[] args) {
        String test = "([{}])";
        System.out.println(isValid(test));
    }
}