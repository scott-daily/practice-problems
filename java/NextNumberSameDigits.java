/*
Create a function that takes a positive integer number and returns the next bigger number that can be formed by the same digits.
14 ==> 41
1017 ==> 1071
4144372343==> 4144372433

If no bigger number can be made, return -1:
6 ==> -1
333 ==> -1
764 ==> -1
*/
import java.util.*;
import java.util.Collections;

public class NextNumberSameDigits {
    public static long getNextBiggerNumber(long n) {

        String nString = String.valueOf(n);
        
        if (isDescending(nString) || isSameChars(nString)) {
            return -1L;
        }

        if (isAscending(nString)) {
            StringBuilder nSB = new StringBuilder(nString);
            char lastDigit = nSB.charAt(nSB.length()-1);
            char AdjLastDigit = nSB.charAt(nSB.length()-2);
            if (lastDigit != AdjLastDigit) {
                nSB.setCharAt(nSB.length()-2, lastDigit);
                nSB.setCharAt(nSB.length()-1, AdjLastDigit);
                return Long.valueOf(nSB.toString().trim());
            }
        }

        List<Integer> nList = new ArrayList<Integer>();
        for (char digit : nString.toCharArray()) {
            nList.add(Character.getNumericValue(digit));
        }

        int leftDigitIndex = 0;
        for (int i = nList.size()-1; i >= 0; i--) {
            if (nList.get(i) > nList.get(i-1)) {
                leftDigitIndex = i-1;
                break;
            }
        }

        int currentBestIndex = 0;
        int leftDigit = nList.get(leftDigitIndex);
        int currentBest = Integer.MAX_VALUE;
        for (int i = leftDigitIndex+1; i < nList.size(); i++) {
            if (nList.get(i) > leftDigit && nList.get(i) < currentBest) {
                currentBestIndex = i;
                currentBest = nList.get(i);
            }
        }

        nList.remove(currentBestIndex);
        nList.add(leftDigitIndex, currentBest);
        Collections.sort(nList.subList(leftDigitIndex+1,nList.size()));
        
        StringBuilder result = new StringBuilder();
        for (Integer digit : nList) {
            result.append(digit);
        }
        return Long.valueOf(result.toString());
    }

    public static boolean isDescending(String number) {

        for (int i = 0; i < number.length()-1; i++) {
            if (Character.getNumericValue(number.charAt(i)) < Character.getNumericValue(number.charAt(i+1))) {
                return false;
            }  
        }
        return true;
    }

    public static boolean isAscending(String number) {
        for (int i = 0; i < number.length()-1; i++) {
            if (Character.getNumericValue(number.charAt(i)) > Character.getNumericValue(number.charAt(i+1))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSameChars(String number) {
        for (int i = 0; i < number.length()-1; i++) {
            if (number.charAt(i) != number.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        long test = 4144372343L;

        System.out.println(getNextBiggerNumber(test));
    }
}