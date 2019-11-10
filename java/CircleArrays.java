/*
Given an N x N array, return the elements arranged from outermost elements to the middle element, traversing clockwise.

Example Input:
[[1,2,3],
[4,5,6],
[7,8,9]]

Example Output:
[1,2,3,6,9,8,7,4,5]
*/
import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.stream.*;

public class CircleArrays {
    public static int[] snail(int[][] array) {

        if (array[0].length < 1) {
            int[] emptyArray= {};
            return emptyArray;
        }
    
        int n = array.length;
        int minCol = 0;
        int maxCol = n-1;
        int minRow = 0;
        int maxRow = n-1;

        List<Integer> result = new LinkedList<Integer>();
        int count = 1;

        while (count <= n * n) {
            for (int i = minCol; i <= maxCol; i++) {
                result.add(array[minRow][i]);
                count++;
            }
            for (int i = minRow+1; i <= maxRow; i++) { 
                result.add(array[i][maxCol]);
                count++; 
            } 
            for (int i = maxCol-1; i >= minCol; i--) {
                result.add(array[maxRow][i]);          
                count++;
            }
            for (int i = maxRow-1; i >= minRow+1; i--) {
                result.add(array[i][minCol]);
                count++;
            }
            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }
        return result.stream().mapToInt(i->i).toArray();
   }
   public static void main(String[] args) {
    int[][] testArray = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

    System.out.println(Arrays.toString(snail(testArray)));
   } 
}