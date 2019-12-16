/*
Given a table of integer numbers. You should rotate rows of the table by the specified distance.
Input data format:
The first line contains two numbers: a number of rows and a number of columns of the table.
The following lines describe rows of the table. In each row, all elements are separated by spaces.
The last line consists of one number - the distance for rotating.
Sample Input:
3 3
1 1 1
2 2 2
3 3 3
1
Sample Output:
3 3 3
1 1 1
2 2 2
*/
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class RotatingTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();
        int numCols = scanner.nextInt();
        scanner.nextLine();

        List<String> inputTable = new ArrayList<String>();

        for (int i = 0; i < numRows; i++) {
            inputTable.add(scanner.nextLine());
        }

        int rotations = (0 + scanner.nextInt()) % numRows;
        Collections.rotate(inputTable,rotations);
    
        for (int i = 0; i < numRows; i++) {
            System.out.print(inputTable.get(i) + " ");
            System.out.println();
        }
    }
}