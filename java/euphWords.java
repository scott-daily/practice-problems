/*
All the letters of the English alphabet are divided into vowels and consonants.
The vowels are: a, e, i, o, u, y.
The remaining letters are consonants.

A word is considered euphonious if it has not three or more vowels or consonants in a row. Otherwise, it is considered discordant.

Your task is to create euphonious words from discordant. You can insert any letters inside word. You should output the minimum number of characters needed to create a euphonious word from a given word.

For example, word "schedule" is considered discordant because it has three consonants in a row - "sch". To create a euphonious word you need to add any vowel between 's' and 'c' or between 'c' and 'h'.

Sample Input 1:

schedule

Sample Output 1:

1
*/

import java.util.*;

public class euphWords {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        ArrayList<Character> charArray = new ArrayList<Character>(0);

        for (char c : word.toCharArray()) {
            charArray.add(c);
        }

        System.out.println(Arrays.toString(charArray.toArray()));
        
        int nextIndex = 0;
        int charsInserted = 0;
        while (nextIndex < charArray.size() - 2) {
            char first = charArray.get(nextIndex);
            char second = charArray.get(nextIndex + 1);
            char third = charArray.get(nextIndex + 2);
            if (isVowel(first) && isVowel(second) && isVowel(third)) {
                charArray.add(nextIndex+2, 'l'); // Arbitrary consonant inserted
                charsInserted += 1;
                nextIndex = 0;
            }
            if (!isVowel(first) && !isVowel(second) && !isVowel(third)) {
                charArray.add(nextIndex+2, 'y');  // Arbitrary vowel inserted
                charsInserted += 1;
                nextIndex = 0;
            }
            nextIndex++;
        }
        System.out.println(Arrays.toString(charArray.toArray()));
        System.out.println(charsInserted);
    }

    static boolean isVowel(char c) {
        c = Character.toLowerCase(c); 
        if (c == 'a' || c == 'e' || c == 'i'
            || c == 'o' || c == 'u' || c == 'y') 
        { 
            return true; 
        } 
        return false; 
    }
} 