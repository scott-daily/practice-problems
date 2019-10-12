/*
A format for expressing an ordered list of integers is to use a comma separated list of either individual integers
or a range of integers denoted by the starting integer separated from the end integer in the range by a dash, '-'. 
The range includes all integers in the interval including both endpoints. 
It is not considered a range unless it spans at least 3 numbers. For example ("12, 13, 15-17")

Complete the solution so that it takes a list of integers in increasing order and returns a correctly formatted string in the range format.

Example:

Ranges.rangeExtraction(new int[] {-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20})
Should return "-6,-3-1,3-5,7-11,14,15,17-20"
*/
import java.util.*;

public class Ranges {
    public static String rangeExtraction(int[] arr) {
        List<String> resultList = new ArrayList<String>();

        String temp = "";
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                temp = String.valueOf(arr[i]);
            }
            if (i == arr.length - 1) {
                if (count == 0) {
                    resultList.add(String.valueOf(arr[i]));
                    break;
                }
                if (count == 1) {
                    resultList.add(temp);
                    resultList.add(String.valueOf(arr[i]));
                    break;
                }
                if (count >= 2) {
                    resultList.add(temp + "-" + String.valueOf(arr[i]));
                    break;
                }
            }
            if (Math.abs(arr[i]-arr[i+1]) == 1) {
                count += 1;
            }
            else {
                if (count >= 2) {
                    resultList.add(temp + "-" + String.valueOf(arr[i]));
                    count = 0;
                }
                else {
                    if (count == 1) {
                        resultList.add(temp);
                        resultList.add(String.valueOf(arr[i]));
                        count = 0;
                    }
                    else {
                        resultList.add(String.valueOf(arr[i]));
                        count = 0;
                    }
                }
            }
        }
        String listString = "";

        for (int i = 0; i < resultList.size(); i++) {
            if (i < resultList.size()-1) {
                listString += resultList.get(i) + ",";
            }
            else {
                listString += resultList.get(i);
            }
        }
        return listString;
    }
    
    public static void main(String[] args) {
        int[] test = new int[] {-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};

        System.out.println(rangeExtraction(test));
    }
}