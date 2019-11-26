/*
Given an array A of non-negative integers, 
return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.
*/
import java.util.List;
import java.util.Arrays;
import java.util.stream.*;
import java.util.stream.Collectors;

public class ArrayParity {
    public static int[] sortArrayByParity(int[] A) {
        
        int[] evenArray = IntStream.of(A).filter(i -> (i & 1) == 0).toArray();
        int[] oddArray = IntStream.of(A).filter(i -> (i & 1) != 0).toArray();

        List<Integer> evenList = Arrays.stream(evenArray).boxed().collect(Collectors.toList());
        List<Integer> oddList = Arrays.stream(oddArray).boxed().collect(Collectors.toList());

        evenList.addAll(oddList);

        return evenList.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) {
        int[] test = new int[]{2,3,7,5,4,2,8,17,4,8,3};

        System.out.println(Arrays.toString(sortArrayByParity(test)));
    }
}