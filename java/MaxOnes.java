// Given a binary array, find the maximum number of consecutive 1s in this array.
public class MaxOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0;
        int maxCount = 0;
        
        for (int number : nums) {
            if (number == 1) {
                count++;
                if (count > maxCount) {
                    maxCount++;
                }
            }
            else {
                count = 0;
            }
        }
        return maxCount;
    }
}