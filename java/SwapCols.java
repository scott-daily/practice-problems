/*
Given a two-dimensional array (matrix) and the two numbers: i and j. Swap the columns with indexes i and j within the matrix.

Input contains matrix dimensions n and m, not exceeding 100, then the elements of the matrix, then the indexes i and j.

Sample Input 1:

3 4
11 12 13 14
21 22 23 24
31 32 33 34
0 1

Sample Output 1:

12 11 13 14
22 21 23 24
32 31 33 34
*/

import java.util.*;

class SwapCols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] myArray = new int[rows][cols];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                myArray[i][j] = scanner.nextInt();
            }
        }

        int colSwap1 = scanner.nextInt();
        int colSwap2 = scanner.nextInt();
        int temp = 0;

        for(int i = 0; i < rows; i++) {
            temp = myArray[i][colSwap1];
            myArray[i][colSwap1] = myArray[i][colSwap2];
            myArray[i][colSwap2] = temp;
        }

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
