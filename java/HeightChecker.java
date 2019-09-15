/*
Students are asked to stand in non-decreasing order of heights for an annual photo.
Print the minimum number of students not standing in the right positions.  
(This is the number of students that must move in order for all students to be standing in non-decreasing order of height.)
*/

import java.util.*;

class HeightChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] heightArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            heightArray[i] = scanner.nextInt();
        }
            
        int[] sortedArray = Arrays.copyOf(heightArray, arraySize);
        Arrays.sort(sortedArray);
        
        int count = 0; 
        for (int i = 0; i < arraySize; i++) {
            if (heightArray[i] != sortedArray[i]){
                count++;
            }
        }
        System.out.println(count);  
    }
}