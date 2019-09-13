/*
Given three natural numbers A, B, C. Determine if a triangle with these side lengths can exist.
If the triangle exists - output the string "YES", otherwise - output "NO".

Sample Input 1:

3
4
5

Sample Output 1:

YES
*/

import java.util.Scanner;

class TriangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();
        boolean isTriangle = false;

        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA){
            isTriangle = true;
        }
        if (isTriangle){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}