/*
Write a program that implements a simple load balancer.
The program must read tasks from the standard input and distribute them between two queues. Tasks will be processed by a system (in future). 
Each task has a unique identifier and a number indicating the load on the system.
The balancer should distribute tasks between queues by the following rule - the task is added to the lower-load queue (by the total load). 
If both queues have the same total load indicator, the task must be added to the first queue.

Input data format:
The first line contains the number of tasks. Other lines consist of task descriptions - an identifier and a load indicator (separated by a space).

Output data form:
The first line should contain identifiers of tasks in the first queue, the second line - in the second queue.

Sample Input 1:

6
1 1
2 1
3 1
4 3
5 1
6 1

Sample Output 1:

1 3 5 6
2 4
*/

import java.util.*;

class GreedyLoadBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTasks = scanner.nextInt();
        scanner.nextLine();

        Deque<Integer> stack1 = new ArrayDeque<Integer>();
        Deque<Integer> stack2 = new ArrayDeque<Integer>();

        int stack1Load = 0;
        int stack2Load = 0;

        for (int i = 0; i < numTasks; i++) {
            String[] tempArray = scanner.nextLine().split(" ");

            if (stack1Load == stack2Load) {
                stack1.push(Integer.parseInt(tempArray[0]));
                stack1Load += Integer.parseInt(tempArray[1]);
            }
            else if (stack1Load > stack2Load) {
                stack2.push(Integer.parseInt(tempArray[0]));
                stack2Load += Integer.parseInt(tempArray[1]);
            }
            else if (stack1Load < stack2Load) {
                stack1.push(Integer.parseInt(tempArray[0]));
                stack1Load += Integer.parseInt(tempArray[1]);
            }
        }

        Iterator<Integer> iter1 = stack1.descendingIterator();
        Iterator<Integer> iter2 = stack2.descendingIterator();

        while (iter1.hasNext()) {
			System.out.print(iter1.next() + " ");
        }

        System.out.println();

        while (iter2.hasNext()) {
			System.out.print(iter2.next() + " ");
		}
    }
}