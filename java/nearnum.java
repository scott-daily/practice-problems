/*
Given a sequence of integers, and a number N, find out the closest integer from the array to the N.
If you find several integers with the same distance to the N, you should output all of them in the ascending order.

Sample Input 1:

1 2 4 5
3

Sample Output 1:

2 4
*/

import java.util.*;
import java.util.stream.Collectors;

public class nearnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numList = readArrayList(scanner);
        Integer n = scanner.nextInt();

        ArrayList<Integer> outputList = new ArrayList<>();
        int closest = Integer.MAX_VALUE;

        for (Integer item : numList){
            if (item > n){
                int diff = item - n;
                if (diff < closest){
                    closest = diff;
                }
            } else if (n > item){
                int diff = n - item;
                if (diff < closest){
                    closest = diff;
                }
            }
            else if (n == item){
                closest = 0;
            }
        }

        for (Integer item : numList){
            if (item >= n){
                int diff = item - n;
                if (diff == closest){
                    outputList.add(item);
                }
            } else if (n >= item){
                int diff = n - item;
                if (diff == closest){
                    outputList.add(item);
                }
            }
        }
        Collections.sort(outputList);
        for (Integer item : outputList){
            System.out.print(item + " ");
        }
    }


    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}