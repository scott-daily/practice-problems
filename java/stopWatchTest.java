/*
Design a class named StopWatch. The class contains:
■ Private data fields startTime and endTime with getter methods.
■ A no-arg constructor that initializes startTime with the current time.
■ A method named start() that resets the startTime to the current time.
■ A method named stop() that sets the endTime to the current time.
■ A method named getElapsedTime() that returns the elapsed time for the
stopwatch in milliseconds.

Write a test
program that measures the execution time of sorting 100,000 numbers using
selection sort.
*/

import java.util.*;

public class stopWatchTest {
    public static void main(String args[]) {
        SelectionSort sortObj = new SelectionSort();
        int arr[] = new int[100000];

        for (int i = 0; i < 100000; i++) {
            Random rand = new Random();
            int randomNum = rand.nextInt();
            arr[i] = randomNum;
        }

        stopWatch clock = new stopWatch();

        clock.start();
        sortObj.sort(arr);
        clock.stop();
        System.out.println("The Selection Sort took " + clock.getElapsedTime() + " milliseconds");
    }
}

class stopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public stopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}

class SelectionSort {
    void sort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}