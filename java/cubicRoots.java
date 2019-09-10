/* 
The roots of a cubic equation

Given the numbers a,b,c,d a, b, c, d a,b,c,d. Output in ascending order all the integers between 0 and 1000 which are the roots of the equation ax^3+bx^2+cx+d=0.

If the specified interval does not contain the roots of the equation, do not output anything.

Sample Input 1:

-1
1
-1
1

Sample Output 1:

1
*/

import java.util.*;

class cubicRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for (int i = 1; i < 1000; i++){
            if (((a * Math.pow(i, 3)) + (b * Math.pow(i, 2)) + (c * i) + d) == 0){
                System.out.println(i);
            }
        }
    }
}