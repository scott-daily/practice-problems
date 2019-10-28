/*
You are given an array that contains the values after throwing a 6-sided dice five times.
Return a total score based on the following rules:
3 (1's) == 1000, 3 (6's) == 600, 3 (5's) == 500, 3 (4's) == 400
3 (3's) == 300, 3 (2's) == 200, 1 (1) == 100, 1 (5) == 50
*/
import java.util.*;
import java.util.stream.*;

public class DiceScore {
    public static int score(int[] dice){

        List<Integer> scoreList = Arrays.stream(dice).boxed().collect(Collectors.toList());
        int score = 0;
        for (int i = 0; i <= 4; i++) {
            if (scoreList.get(i) == 1) {
                int tempFreq = Collections.frequency(scoreList, scoreList.get(i));
                switch (tempFreq) { 
                case 1: 
                    score += 100;
                    Collections.replaceAll(scoreList, 1, 9);
                    break; 
                case 2: 
                    score += 200;
                    Collections.replaceAll(scoreList, 1, 9);
                    break; 
                case 3: 
                    score += 1000;
                    Collections.replaceAll(scoreList, 1, 9);
                    break; 
                case 4: 
                    score += 1100;
                    Collections.replaceAll(scoreList, 1, 9);
                    break; 
                case 5: 
                    score += 1200;
                    Collections.replaceAll(scoreList, 1, 9);
                    break; 
                }
            }
            else if (scoreList.get(i) == 2) {
                int tempFreq = Collections.frequency(scoreList, scoreList.get(i));
                switch (tempFreq) { 
                case 3: 
                    score += 200;
                    Collections.replaceAll(scoreList, 2, 9);
                    break; 
                case 4: 
                    score += 200;
                    Collections.replaceAll(scoreList, 2, 9);
                    break;
                case 5:
                    score += 200;
                    Collections.replaceAll(scoreList, 2, 9);
                    break;
                }
            }
            else if (scoreList.get(i) == 3) {
                int tempFreq = Collections.frequency(scoreList, scoreList.get(i));
                switch (tempFreq) { 
                case 3: 
                    score += 300;
                    Collections.replaceAll(scoreList, 3, 9);
                    break;
                case 4: 
                    score += 300;
                    Collections.replaceAll(scoreList, 3, 9);
                    break;
                case 5:
                    score += 300;
                    Collections.replaceAll(scoreList, 3, 9);
                    break; 
                }
            }
            else if (scoreList.get(i) == 4) {
                int tempFreq = Collections.frequency(scoreList, scoreList.get(i));
                switch (tempFreq) { 
                case 3: 
                    score += 400;
                    Collections.replaceAll(scoreList, 4, 9);
                    break;
                case 4: 
                    score += 400;
                    Collections.replaceAll(scoreList, 4, 9);
                    break;
                case 5:
                    score += 400;
                    Collections.replaceAll(scoreList, 4, 9);
                    break; 
                }
            }
             else if (scoreList.get(i) == 5) {
                int tempFreq = Collections.frequency(scoreList, scoreList.get(i));
                switch (tempFreq) { 
                case 1: 
                    score += 50;
                    Collections.replaceAll(scoreList, 5, 9);
                    break; 
                case 2: 
                    score += 100;
                    Collections.replaceAll(scoreList, 5, 9);
                    break; 
                case 3: 
                    score += 500;
                    Collections.replaceAll(scoreList, 5, 9);
                    break; 
                case 4: 
                    score += 550;
                    Collections.replaceAll(scoreList, 5, 9);
                    break; 
                case 5: 
                    score += 600;
                    Collections.replaceAll(scoreList, 6, 9);
                    break; 
                }
            }
            else if (scoreList.get(i) == 6) {
                int tempFreq = Collections.frequency(scoreList, scoreList.get(i));
                switch (tempFreq) { 
                case 3: 
                    score += 600;
                    Collections.replaceAll(scoreList, 6, 9);
                    break; 
                case 4: 
                    score += 600;
                    Collections.replaceAll(scoreList, 6, 9);
                    break;
                case 5: 
                    score += 600;
                    Collections.replaceAll(scoreList, 6, 9);
                    break;
                }
            }
        }
    return score;
    }
    public static void main(String[] args) {
        System.out.println(score(new int[]{4,4,4,1,4}));
    }
}