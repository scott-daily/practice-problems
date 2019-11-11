/*
Write a function which formats a quantity of time, given as a number of seconds, in a readable way.
The result will be a string composed of years, days, hours, minutes and seconds.
Only include the unit of time if it is not equal to 0.  
If it is equal to 1 unit, then it does not have a suffix of 's' & vice versa (1 minute or 2 minutes).

Example Input: 
347834783

Example Output:
11 years, 10 days, 20 hours, 46 minutes and 23 seconds
*/
public class TimeFormatter {
    public static String formatDuration(long seconds) {

        long secondsLeft = seconds;
        long years = 0;
        long days = 0;
        long hours = 0;
        long minutes = 0;

        StringBuilder formattedTime = new StringBuilder();
        int unitsCount = 0;

        if (seconds == 0) {
            formattedTime.append("now");
            return formattedTime.toString();
        }
        
        if (secondsLeft >= 31536000) {
            years = seconds / 31536000;
            secondsLeft -= (years * 31536000);
            unitsCount++;
        }
        if (secondsLeft >= 86400) {
            days = secondsLeft / 86400;
            secondsLeft -= (days * 86400);
            unitsCount++;
        }
        if (secondsLeft >= 3600) {
            hours = secondsLeft / 3600;
            secondsLeft -= (hours * 3600);
            unitsCount++;
        }
        if (secondsLeft >= 60) {
            minutes = secondsLeft / 60;
            secondsLeft -= (minutes * 60);
            unitsCount++;
        }
        if (secondsLeft >= 1) {
            unitsCount++;
        }

        String[] timeArray = new String[5];

        if (years > 1) {
            timeArray[0] = years + " years";
        }
        else {
            timeArray[0] = years + " year";
        }
        if (days > 1) {
            timeArray[1] = days + " days";
        }
        else {
            timeArray[1] = days + " day";
        }
        if (hours > 1) {
            timeArray[2] = hours + " hours";
        }
        else {
            timeArray[2] = hours + " hour";
        }
        if (minutes > 1) {
            timeArray[3] = minutes + " minutes";
        }
        else {
            timeArray[3] = minutes + " minute";
        }
        if (secondsLeft > 1) {
            timeArray[4] = secondsLeft + " seconds";
        }
        else {
            timeArray[4] = secondsLeft + " second";
        }

        for (int i = 0; i < timeArray.length; i++) {
            if (Character.getNumericValue(timeArray[i].charAt(0)) >= 1) {
                if (unitsCount > 2) {
                    formattedTime.append(timeArray[i] + ", ");
                }
                if (unitsCount == 2) {
                    formattedTime.append(timeArray[i] + " and ");
                }
                if (unitsCount == 1) { 
                    formattedTime.append(timeArray[i]);
                }
                unitsCount--;
            }
        }
        return formattedTime.toString();
    }
    public static void main(String[] args) {
        Long testDuration = 4878934343403748937L;
        System.out.println(formatDuration(testDuration));
    }
}