/*
Given two arrays of strings, create a method that returns a sorted array of the strings in array1, which are substrings of strings in array2.
*/

import java.util.*;

public class SubStringArrays { 
	public static String[] inArray(String[] array1, String[] array2) {
        List<String> list1 = Arrays.asList(array1);
        String stringArray2 = Arrays.toString(array2);
        List<String> resultList = new ArrayList<String>();
        
        for (String word : list1) {
            if (stringArray2.contains(word)) {
                resultList.add(word);
            }
        }
        
        Collections.sort(resultList);
		return resultList.toArray(new String[0]);
    }
}