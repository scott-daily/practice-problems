/*
The letter value of a letter is its position in the alphabet starting from 0 (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, etc.).
The numerical value of some string of lowercase English letters s is the concatenation of the letter values of each letter in s, which is then converted into an integer.
For example, if s = "acb", we concatenate each letters letter value, resulting in "021". After converting it, we get 21.
You are given three strings firstWord, secondWord, and targetWord, each consisting of lowercase English letters 'a' through 'j' inclusive.
Return true if the summation of the numerical values of firstWord and secondWord equals the numerical value of targetWord, or false otherwise.
*/

public class Solution {
    public bool IsSumEqual(string firstWord, string secondWord, string targetWord) {
        
        Dictionary<char, int> charValues = new Dictionary<char, int>();
        string letters = "abcdefghij";
        
        StringBuilder firstW = new StringBuilder();
        StringBuilder secondW = new StringBuilder();
        StringBuilder targetW = new StringBuilder();
            
        for (int i = 0; i < 10; i++) {
            charValues.Add(letters[i],i);
        }
        
        for (int i = 0; i < firstWord.Length; i++) {
            firstW.Append(charValues[firstWord[i]]);
        }
        
        for (int i = 0; i < secondWord.Length; i++) {
            secondW.Append(charValues[secondWord[i]]);
        }
        
        for (int i = 0; i < targetWord.Length; i++) {
            targetW.Append(charValues[targetWord[i]]);
        }
        
        return (System.Int32.Parse(firstW.ToString()) +  System.Int32.Parse(secondW.ToString())) == System.Int32.Parse(targetW.ToString());
    }
}
