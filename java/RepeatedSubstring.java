/*
Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. 
You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.
Input: "abab"
Output: True
Explanation: It's the substring "ab" twice.
*/
public class RepeatedSubstring {
    public static boolean repeatedSubstringPattern(String s) {
        
        for (int i = s.length() / 2; i >= 1; i--) {
            if (s.length() % i == 0) {
                StringBuilder tempString = new StringBuilder();
                String partString = s.substring(0, i);

                for (int j = 0; j < s.length() / i; j++) {
                    tempString.append(partString);
                }
                if (tempString.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String test = "abaababaab";

        System.out.println(repeatedSubstringPattern(test));
    }
}