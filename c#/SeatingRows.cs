/*
The function SeatingStudents(arr) read the array of integers stored in arr which will be in the 
following format: [K, r1, r2, r3, ...] where K represents the number of desks in a classroom, 
and the rest of the integers in the array will be in sorted order and will represent the desks
that are already occupied. All of the desks will be arranged in 2 columns, 
where desk #1 is at the top left, desk #2 is at the top right, desk #3 is below #1, desk #4 is below #2, etc. 
Your program should return the number of ways 2 students can be seated next to each other. 
This means 1 student is on the left and 1 student on the right, or 1 student is directly above or below the other student.
 */
using System;
using System.Collections.Generic;

class MainClass {

  public static int SeatingStudents(int[] arr) {
    // code goes here
    int totalDesks = arr[0];
    int numRows = totalDesks / 2;

    HashSet<int> occupiedSeats = new HashSet<int>();
    bool[,] seatingArrangement = new bool[numRows,2];

    for (int i = 1; i < arr.Length; i++) {
      occupiedSeats.Add(arr[i]);
    }

    int currentSeatCount = 0;
    for (int i = 0; i < seatingArrangement.GetLength(0); i++) {
      for (int j = 0; j < seatingArrangement.GetLength(1); j++) {
        if (occupiedSeats.Contains(currentSeatCount)) {
          seatingArrangement[i,j] = true;
        }
        currentSeatCount += 1;
      }
    }

    int numWays = 0;

    for (int i = 0; i < numRows - 1; i += 2) {
        if (seatingArrangement[i,0] == false && seatingArrangement[i,1] == false) {
          numWays += 1;
        }

        if (seatingArrangement[i,0] == false && seatingArrangement[i+1,0] == false) {
          numWays += 1;
        }

        if (seatingArrangement[i, 1] == false && seatingArrangement[i+1,1] == false) {
          numWays += 1;
        }

        if (i != numRows - 1) {
          if (seatingArrangement[i+1,0] == false && seatingArrangement[i+1,1] == false) {
            numWays +=1;
          }
        }
    }
    return numWays;
  }

  static void Main() {  
    // keep this function call here
    Console.WriteLine(SeatingStudents(Console.ReadLine()));
  } 
}