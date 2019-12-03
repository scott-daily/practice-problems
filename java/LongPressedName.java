/*
Your friend is typing his name into a keyboard.  
Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.
You examine the typed characters of the keyboard.  
Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

Input: name = "saeed", typed = "ssaedd"
Output: false
Explanation: 'e' must have been pressed twice, but it wasn't in the typed output.
*/
public class LongPressedName {
    public static boolean isLongPressedName(String name, String typed) {
        
        if (name.equals(typed)) {
            return true;
        }

        int nameIndex = 0;
        int typedIndex = 0;

        while (nameIndex < name.length() && typedIndex < typed.length()) {
            if (name.charAt(nameIndex) == typed.charAt(typedIndex)) {
                nameIndex++;
                typedIndex++;
            }
            else {
                typedIndex++;
            }
        }

        if (typedIndex == typed.length() && nameIndex < name.length()) {
            return false;
        }
    
        return true;
    }
    public static void main(String[] args) {
        String testName = "abc";
        String testTyped = "abccd";

        System.out.println(isLongPressedName(testName, testTyped));
    }
}