/*
Write a method that returns the highest scoring word in a sentence.  
The score for 'a' is 1 and 'z' is 26.  
If two words have the same score, return the first word that appeared.
*/
public class StringScores {
    public static String high(String s) {

        String[] stringArray = s.toUpperCase().split(" ");

        int highScore = 0;
        String highestWord = "";

        for (int i = 0; i < stringArray.length; i++) {
            int tempScore = 0;
            for (char letter : stringArray[i].toCharArray()) {
                tempScore += (letter - 64);
            }
            if (tempScore > highScore) {
                highScore = tempScore;
                highestWord = stringArray[i];
            }
        }
        return highestWord.toLowerCase();
    }
    public static void main(String[] args) {
        high("when are we going to see the dinosaurs in new zealand");
    }
}