/*
Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
Examples

pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
*/
import java.util.*;

public class PigLatin {
    public static String pigIt(String str) {
        String[] inputArray = str.split(" ");
        String[] resultArray = new String[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            if (Character.isLetter(inputArray[i].charAt(0)) == false) {
                resultArray[i] = inputArray[i].charAt(0) + "";
            }
            else {
                resultArray[i] = inputArray[i].substring(1, inputArray[i].length()) + inputArray[i].charAt(0) + "ay";
            }
        }
        return String.join(" ", resultArray);
    }

    public static void main(String[] args) {
        String test = "O tempora o mores !";

        System.out.println(pigIt(test));
    }
}