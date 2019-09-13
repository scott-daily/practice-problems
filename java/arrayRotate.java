/*
Given a rectangle array n×m in size. Rotate it by 90 degrees clockwise, by recording the result into the new array m×n in size.

Input data format

Input the two numbers n and m, not exceeding 100, and then an array n×m in size.

Output data format

Output the resulting array. Separate numbers by a single space in the output.

Sample Input 1:

3 4
11 12 13 14
21 22 23 24
31 32 33 34

Sample Output 1:

31 21 11 
32 22 12 
33 23 13 
34 24 14

*/

import java.util.*;

class ArrayRotate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowSize = scanner.nextInt();
        int columnSize = scanner.nextInt();
        int[][] inputArray = new int[rowSize][columnSize];

        int count = 0;
        while (count < rowSize) {
            for (int i = 0; i < rowSize; i++) { 
                for (int j = 0; j < columnSize; j++) {
                    inputArray[i][j] = Integer.parseInt(scanner.next());
                    count++;
                }
            }
        }

        int[][] newArray = new int[columnSize][rowSize];

        for(int i=0; i<inputArray[0].length; i++){
            for(int j=inputArray.length-1; j>=0; j--){
                newArray[i][j] = inputArray[j][i];
            }
        }

        for (int i = 0; i < newArray.length; i++){
            for (int j = newArray[0].length-1; j >= 0; j--){
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}