/*  
Write a program simulating a stack that can effectively return the current max element. 
    Your program should read a sequence of commands of different types from the standard input.

There are three types of commands:

    push v - add an element (v) to a top of the stack;
    pop - remove the top element of the stack;
    max - return the current max in the stack.

The time complexity of these operations should not depend on the stack size (constant time, O(1)).


Input data format:

The first line contains the number of commands. Next lines contain one of the following commands: push v, pop, max.

Output data format:

The program must output the current max for each command max.

Sample Input 1:

5
push 2
push 1
max
pop
max

Sample Output 1:

2
2
*/

import java.util.*;

class doublestack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> mainStack = new Stack<Integer>();
        Stack<Integer> maxStack = new Stack<Integer>();


        for (int i = 0; i <= n; i++) {
            String nextAction = scanner.nextLine();
            if (nextAction.contains("push")) {
                int beginIndex = nextAction.indexOf(" ");
                String strToPush = nextAction.substring(beginIndex + 1);
                int numToPush = Integer.parseInt(strToPush);

                if (maxStack.size() == 0){
                    maxStack.push(numToPush);
                    mainStack.push(numToPush);
                }
                else {
                    if (maxStack.peek() < numToPush) {
                        maxStack.push(numToPush);
                        mainStack.push(numToPush);
                    }
                    else {
                        mainStack.push(numToPush);
                        maxStack.push(maxStack.peek());
                    }
                }
            }
            else if (nextAction.contains("pop")){
                mainStack.pop();
                maxStack.pop();
            }
            else if (nextAction.contains("max")){
                System.out.println(maxStack.peek());
            }
        }
    }
}