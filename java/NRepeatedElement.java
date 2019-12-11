/*
In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
Return the element repeated N times.
*/
import java.util.HashMap;
import java.util.Map;

public class NRepeatedElement {
    public static int repeatedNTimes(int[] A) {
        
        Map<Integer,Integer> freqMap = new HashMap<Integer,Integer>();

        for (int i = 0; i < A.length; i++) {
            int count = freqMap.containsKey(A[i]) ? freqMap.get(A[i]) : 0;
            if (count == 1) {
                return A[i];
            }
            freqMap.put(A[i], count + 1);
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] testA = new int[]{2,3,5,7,9,3};

        System.out.println(repeatedNTimes(testA));
    }
}