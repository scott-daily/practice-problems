import java.util.Scanner;
import java.util.Arrays;

public class RotatingTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();
        int numCols = scanner.nextInt();

        int[][] table = new int[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                table[i][j] = Integer.parseInt(scanner.next());
            }
        }
        System.out.println(Arrays.deepToString(table));
    }
}