/*
A right rotation is an operation which shifts each element of the array to the right.

For example, if a right rotation is 1 and array is {1,2,3,4,5}, the new array will be {5,1,2,3,4}.

Another example, if a right rotation is 2 and array {1,2,3,4,5}, the new array will be {4,5,1,2,3}, because  

{1,2,3,4,5} ->  {5,1,2,3,4} ->  {4,5,1,2,3}.

Sample Input 1:

1 2 3 4 5
1

Sample Output 1:

5 1 2 3 4
*/

import java.util.*;

public class CircleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();

        String[] splitNumbers = numbers.split(" ");

        int[] array = new int[splitNumbers.length];

        for (int i = 0; i < splitNumbers.length; i++){
            array[i] = Integer.parseInt(splitNumbers[i]);
        }

        int len = array.length;
        int rotations = scanner.nextInt();
        rotations = rotations%len;
        int count = 0;

        while (count < rotations){
            int temp = array[len-1];
            for(int i = len-1; i>0; i--)
                {
                    array[i]=array[i-1];
                }
                array[0]=temp;
                count++;
        }   

    	for(int i=0; i < len; i++){
       	    System.out.print(array[i] + " ");
        }
    }
}
