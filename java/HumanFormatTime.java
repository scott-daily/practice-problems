/*
Write a function that takes an integer which represents seconds as input and returns the current time in a human friendly format HH:MM:SS.
*/

public class HumanFormatTime {
    public static String makeFormat(int seconds) {
        double secondsDouble = seconds;
        int hour = (int) Math.floor(secondsDouble/3600);
        int minute = (int) Math.floor((secondsDouble - (hour*3600))/60);
        int second = seconds - ((hour*3600)+(minute*60));

        String hourString = "";
        String minuteString= "";
        String secondString = "";

        if (hour >= 10) {
            hourString = String.valueOf(hour);
        }
        else if (hour < 10) {
            hourString = "0" + String.valueOf(hour);
        }

        if (minute >= 10) {
            minuteString = String.valueOf(minute);
        }
        else if (minute < 10) {
            minuteString = "0" + String.valueOf(minute);
        }

        if (second >= 10) {
            secondString = String.valueOf(second);
        }
        else if (second < 10) {
            secondString = "0" + String.valueOf(second);
        }

        return "(" + hourString + ":" + minuteString + ":" + secondString + ")";
    }

    public static void main(String[] args) {
        int testTime = 359999;

        System.out.println(makeFormat(testTime));
    }
}