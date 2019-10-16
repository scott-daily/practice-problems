/*
Create a method that takes an array of increasing letters as input and returns the missing letter in the array (not consecutive).

Example Input:
{ 'B','C','E','F' }

Example OutPut:
'D'
*/
public class LetterSequence {
    public static char findMissingLetter(char[] array) {

        char missingLetter = ' ';
        
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] - array[i+1] < -1) {
                missingLetter = (char) ((int) array[i] + 1);
                break;
            }
        }
        return missingLetter;
    }
    public static void main(String[] args) {
        char[] test = new char[] { 'O','Q','R','S' };

        System.out.println(findMissingLetter(test));
    }
}