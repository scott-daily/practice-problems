/* You are given a complete String, and two parts. If the two parts can be put together in a way that matches the goal string,
then return true. Otherwise, return false.  The parts must contain letters in the same order as the complete string, 
but don't have to be adjacent.

Example Input:
String = dictionary
part1 = dcio
part 2 = tinary

Example Output: 
true
*/
import java.util.Arrays;

public class MergeStrings {
    public static boolean isMerge(String s, String part1, String part2) {

        char[] goalArray = s.toCharArray();
        Arrays.sort(goalArray);
        char[] partsArray = (part1+part2).toCharArray();
        Arrays.sort(partsArray);
        String goalSorted = new String(goalArray);
        String partsSorted = new String(partsArray);

        if (!partsSorted.contains(goalSorted)) {
            return false;
        }

        if (!subInString(s,part1,part2)) {
            return false;
        }

       return true;
    }

    public static boolean subInString(String string, String part1, String part2) {

        int index = 0;

        for (char letter : part1.toCharArray()) {
            System.out.println(letter);
            index = string.indexOf(letter, index);
            if (index == -1)
                return false;
        }

        index = 0;

        for (char letter : part2.toCharArray()) {
            System.out.println(letter);
            index = string.indexOf(letter, index);
            if (index == -1)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String testPart1 = "dcio";
        String testPart2 = "tinary";
        String testGoal = "dictionary";

        System.out.println(isMerge(testGoal,testPart1,testPart2));
    }
}