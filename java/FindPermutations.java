/*
Given a String N, return a List of Strings composed of all permutations of N.  
The elements of the List can be in any order.
*/
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class FindPermutations {
    public static List<String> getPermutations(String s) {

        return recursivePerms(s).stream().collect(Collectors.toUnmodifiableList());

    }
    public static Set<String> recursivePerms(String letters) {

        Set<String> resultSet = new HashSet<String>();

        if (letters == "")
            return resultSet;

        Character firstChar = letters.charAt(0);

        if (letters.length() > 1) {

            letters = letters.substring(1);
            Set<String> permSet = recursivePerms(letters);

            for (String combo : permSet) {
                for (int i = 0; i <= combo.length(); i++) {
                    resultSet.add(combo.substring(0, i) + firstChar + combo.substring(i));
                }
            }
        }
        else {
            resultSet.add(firstChar + "");
        }
        return resultSet;
    }
    public static void main(String[] args) {
        String testString = "the fat cat";
        System.out.println(getPermutations(testString).toString());
    }
}