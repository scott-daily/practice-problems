/*   
Progam Purpose:

Encoding is performed as follows:
The string "aaaabbсaa" is converted into "a4b2с1a2", that is, the groups of the same characters of the input string are replaced by the symbol and the number of its repetitions in this string.

Write a program, which reads the string, encodes it by this algorithm and outputs the encoded sequence. The encoding must be case sensitive.

Note, string can be empty or contain only a single character.
*/

import java.util.*;

class dnaSeq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dnaSeq = scanner.nextLine();
        StringBuilder dnaString = new StringBuilder();
        
        if (dnaSeq.length() == 1){
            if (dnaSeq.charAt(0) == ' '){
                System.out.println();
            } else {
                System.out.println(dnaSeq + "1");
            }
        }

        int countUntilOne = dnaSeq.length();
        int count = 1;
        int indexOfLastChar = dnaSeq.length()-1;

        for (int i = 0; i < dnaSeq.length()-1; i++){
            countUntilOne -= 1;
            char currentChar = dnaSeq.charAt(i);

            if (dnaString.length() == 0){
                dnaString.append(currentChar);
            }
            if (dnaString.charAt(dnaString.length()-1) != currentChar){
            dnaString.append(currentChar);
            }

            if (currentChar == dnaSeq.charAt(i+1)){
                count += 1;
                if (i+1 == indexOfLastChar){
                    dnaString.append(count);
                }
            }
            else {
                dnaString.append(count);
                count = 1;
            }
            if (countUntilOne == 1 && count == 1){
                dnaString.append(dnaSeq.charAt(i+1));
                dnaString.append(count);
            }
        }
        if (dnaSeq.length() > 1) {
            System.out.println(dnaString);
        }
    }
}