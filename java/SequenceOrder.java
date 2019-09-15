/*
Write a program that reads a sequence of integer numbers and outputs true if the sequence is ordered (in ascending or descending order), otherwise, false. 
Keep in mind, if a number has the same value as the following number, it does not break the order.
The sequence ends with 0. Do not consider this number as a part of the sequence. The sequence always has at least one number (excluding 0).

Sample Input 1:
9 8 7 6 5 4 3 2 1 0

Sample Output 1:
true
*/


import java.util.Scanner;
import java.util.ArrayList;

class SequenceOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sequenceArray = new ArrayList<Integer>();

        while(scanner.hasNextInt()){
                sequenceArray.add(scanner.nextInt());
            }

        boolean ascend = true;
        boolean descend = true;

        for (int i=1; i<sequenceArray.size()-1 && (ascend || descend); i++) {
            ascend = ascend && sequenceArray.get(i) >= sequenceArray.get(i-1);
            descend = descend && sequenceArray.get(i) <= sequenceArray.get(i-1);
        }

        while (ascend || descend) {
            System.out.println("true");
            break;
            }
        while (!ascend && !descend) {
            System.out.println("false");
            break;
        }
    }
}