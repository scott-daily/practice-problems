/*
Given a list of items and a number k as the interval,
write a method that returns a list containing the order of objects selected in a list using the Josephine Permutation, including the last one.
https://en.wikipedia.org/wiki/Josephus_problem.
*/

import java.util.*;

public class JosPerm {
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {

        List<T> resultList = new ArrayList<T>();
        int itemsLeft = items.size();
        int currentItem = 0;
        int interval = k-1;

        while (itemsLeft > 0) {
            currentItem = (currentItem + interval) % itemsLeft;
            resultList.add(items.get(currentItem));
            items.remove(currentItem);
            itemsLeft--;
        }

        return resultList;
    }

    public static void main(String[] args) {

        List<Object> test = new ArrayList<Object>(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println(josephusPermutation(test,4));
    }
}