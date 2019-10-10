/*
You will be given a string of words, with each containing a number.  The number is the index the word should at in the 
result string.  

Note: Numbers can range from 1 to 9 in the words.

If the given string is empty, return an empty string.
*/

public class StringOrder {
    public static String order(String words) {

        if (words.length() == 0) {
            return "";  
        }

        String[] wordsArray = words.split(" ");
        String[] resultArray = new String[wordsArray.length];

        for (int i = 0; i < wordsArray.length; i++) {
            for (int j = 0; j < wordsArray[i].length(); j++) {
                if (Character.isDigit(wordsArray[i].charAt(j))) {
                    int tempIndex = Character.getNumericValue(wordsArray[i].charAt(j)-1);
                    resultArray[tempIndex] = wordsArray[i];
                }
            }
        }
        return String.join(" ", resultArray);
    }

    public static void main(String[] args) {
        String test = "apple1 bana2na carrot3";
        System.out.println(order(test));
    }
}