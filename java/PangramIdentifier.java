/*
Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
*/

import java.util.*;

class PangramIdentifier {
    public static boolean check(String sentence) {
        String noExtraSentence = sentence.replaceAll("[^A-Za-z+]", "").toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String noDupesSentence = removeDuplicates(noExtraSentence);
        char[] sortingArray = new char[noDupesSentence.length()];

        for (int i = 0; i < noDupesSentence.length(); i++) {
            sortingArray[i] = noDupesSentence.charAt(i);
        }

        Arrays.sort(sortingArray);
        StringBuilder sb = new StringBuilder();

        for (char c : sortingArray) {
            sb.append(c);
        }

        String finalSentence = new String(sb);
        for (int i = 0; i < alphabet.length(); i++) {
            if (finalSentence.charAt(i) != alphabet.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static String removeDuplicates(String input) {
        if (input == null || input.length() < 2) {
            return input;
        }
        StringBuilder sb = new StringBuilder(input.length());
        input.chars().distinct().mapToObj(ch -> (char)ch).forEach((ch) -> sb.append(ch));
        return sb.toString();
    }

    public static void main(String[] args) {
        String test_sentence = "fbrj psqikhxtavogzuncwyldm";

        System.out.println(check(test_sentence));
    }
}
