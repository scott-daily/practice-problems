/*
Given an array of directions, if two adjacent directions cancel each other out (North & South or East & West), then remove both.
If the remaining directions shift into a new position, where directions that cancel are now adjacent to each other, then remove these 
directions as well.  
Repeat until no more directions that cancel out are adjacent to each other, and return this new array of correct directions.  
Example Input: 
"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"
Example Output:
"WEST"
*/
import java.util.*;

public class Directions {
    public static String[] reduce(String[] arr) {

        List<String> directionList = new LinkedList<String>(Arrays.asList(arr));

        for (;;) {
            int lengthBeforeLoop = directionList.size();

            for (int i = 0; i < directionList.size()-1; i++) {
                if("NORTH".equals(directionList.get(i)) && "SOUTH".equals(directionList.get(i+1))||
                    "SOUTH".equals(directionList.get(i)) && "NORTH".equals(directionList.get(i+1))||
                    "EAST".equals(directionList.get(i)) && "WEST".equals(directionList.get(i+1))||
                    "WEST".equals(directionList.get(i)) && "EAST".equals(directionList.get(i+1))) {
                    directionList.remove(i);
                    directionList.remove(i);
                    break;
                }   
            }
            if (lengthBeforeLoop == directionList.size()) {
                break;
            }
        }
        return directionList.stream().toArray(String[]::new);
    }
    public static void main(String[] args) {
        String[] test = new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};

        String[] result = reduce(test);
        System.out.println(Arrays.toString(result));
    }
}