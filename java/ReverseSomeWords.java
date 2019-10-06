/*
Create a function that takes in a string of one or more words. 
This function should return a string with all words equal to or greater than 5 characters reversed.
*/

public class ReverseSomeWords {
    public static String reverseWords(String sentence) {
        String[] sentenceArray = sentence.split(" ");

        for (int i = 0; i < sentenceArray.length; i++) {
            if (sentenceArray[i].length() >= 5) {
                String reversed = new StringBuilder(sentenceArray[i]).reverse().toString();
                sentenceArray[i] = reversed;
            }
        }
        return String.join(" ", sentenceArray);
    }

    public static void main(String[] args) {
        String test = "My super team is winning";

        System.out.println(reverseWords(test));
    }
}