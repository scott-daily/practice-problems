/*
Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.

Input: S = "loveleetcode", C = 'e'
Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
*/
import java.util.Arrays;

public class ShortestDistToChar {
    public static int[] shortestToChar(String S, char C) {
        
        int[] distArray = new int[S.length()];
        int CFirstIndex = S.indexOf(C);
        int counter = CFirstIndex;

        if (CFirstIndex == 0) {
            distArray[0] = 0;
        }

        for (int i = 0; i <= CFirstIndex; i++) {
            distArray[i] = counter--;
        }
        
        int indexPrevC = CFirstIndex;
        counter = 1;

        for (int i = CFirstIndex + 1; i < S.length(); i++) {
            if (S.charAt(i) != C) {
                distArray[i] = counter;
                counter++;
            }
            else if (S.charAt(i) == C) {
                distArray[i] = 0;
                counter = 1;
                if (indexPrevC != i && distArray[i-1] != 1) {
                    int reverseAmount = (i - indexPrevC) / 2;

                    for (int j = i-1; j > indexPrevC; j--) {
                        if (reverseAmount > 0) {
                            distArray[j] = counter;
                            counter++;
                            reverseAmount--;
                        }
                    }
                    counter = 1;
                }
                indexPrevC = i;
            }
        }
        return distArray;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar("whowenttothestoretobuygrapesandpop", 'o')));
    }
}