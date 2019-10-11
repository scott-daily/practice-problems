/*
You are given an array which consists of all even or odd integers, except for one.  
Return this single "outlier".
*/  

import java.util.*;

public class ParityOutlier{
    static int find(int[] integers){

        int odd = 0;
        int even = 0;
        boolean findEven = false;
        boolean findOdd = false;
        int result = 0;

        for (int i = 0; i <= 2; i++) {
            if (integers[i] % 2 == 0) {
                even += 1;
            }
            else {
                odd += 1;
            }
            if (odd == 2 || even == 2) {
                if (odd == 2) {
                    findEven = true;
                }
                else if (even == 2) {
                    findOdd = true;
                }
            }
        }

        if (findEven) {
            result = Arrays.stream(integers).filter(i -> i % 2 == 0).findFirst().getAsInt();
        }
        if (findOdd) {
            result = Arrays.stream(integers).filter(i -> i % 2 != 0).findFirst().getAsInt();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test = {1, 13, 4, 7, 19};

        System.out.println(find(test));
    }
}
