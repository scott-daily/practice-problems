/*
You have two words. If the words are an anagram, print "yes", else "no".
Note: anagrams are words which contain the same characters with the same frequencies.
Sample Input: 
ppaaagg
gagaapp
Sample Output:
yes
*/
import java.util.*;
import java.util.stream.*;

public class AnagramFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine().toLowerCase();
        String input2 = scanner.nextLine().toLowerCase();

        List<Character> input1List = input1.chars().mapToObj(e->(char)e).collect(Collectors.toList());
        List<Character> input2List = input2.chars().mapToObj(e->(char)e).collect(Collectors.toList());

        Collections.sort(input1List);
        Collections.sort(input2List);

        if (input1List.equals(input2List)) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}