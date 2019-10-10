/*
There is an array with at least three numbers. All the numbers are equal except for one. Try to find it!
Note: The array size can be huge and some solutions may not be fast enough.
*/

import java.util.*;

 public class UniqueNumberHugeArray {
    public static double findUnique(double arr[]) {

        double key = 0;
        double temp1 = 0;
        double temp2 = 0;
        boolean found = false;
        
        for (int i = 0; i <= 2 && !found; i++) {
            if (i == 0) {
                temp1 = arr[i];
            }
            else if (i == 1) {
                if (temp1 == arr[i]) {
                    key = arr[i];
                    found = true;
                }
                else {
                    temp2 = arr[i];
                }
            }
            else if (i == 2) {
                if (arr[i] == temp1) {
                    key = arr[i];
                    found = true;
                    break;
                }
                else if (arr[i] == temp2) {
                    key = arr[i];
                    found = true;
                    break;
                }
            }
        }
        
        final double finalKey = new Double(key);
        double[] result = Arrays.stream(arr).filter(val -> val != finalKey).toArray(); 
      
        return result[0];
    }
    public static void main(String[] args) {
        double[] testArray = {1, 1, 1, 2, 1, 1};

        System.out.println(findUnique(testArray));
    }
}