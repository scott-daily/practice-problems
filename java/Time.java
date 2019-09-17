/*
Design a class named Time.
Write a test program that creates two Time objects (using new Time() and new
Time(555550000)) and displays their hour, minute, and second in the format
hour:minute:second.
*/

import java.util.*;
import java.time.*;

class Time {
    private long hour;
    private long minute;
    private long second;

    public Time() {
        ZonedDateTime currentTime = ZonedDateTime.now();
        this.hour = currentTime.getHour();
        this.minute = currentTime.getMinute();
        this.second = currentTime.getSecond();
    }

    public Time(long time) {
        Calendar theTime = Calendar.getInstance();
        theTime.setTimeInMillis(time);
        this.hour = theTime.get(Calendar.HOUR_OF_DAY);
        this.minute = theTime.get(Calendar.MINUTE);
        this.second = theTime.get(Calendar.SECOND);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getCurrentHour() {
        return this.hour;
    }

    public long getCurrentMinute() {
        return this.minute;
    }

    public long getCurrentSecond() {
        return this.second;
    }

    public void setTime(long elapseTime) {
        this.hour = (long) ((elapseTime / (1000*60*60)) % 24);
        this.minute = (long) ((elapseTime / (1000*60)) % 60);
        this.second = (long) (elapseTime / 1000) % 60 ;
    }
}

class TestTime {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);

        System.out.println(time1.getCurrentHour() + ":" + time1.getCurrentMinute() + ":" + time1.getCurrentSecond());
        System.out.println(time2.getCurrentHour() + ":" + time2.getCurrentMinute() + ":" + time2.getCurrentSecond());
    }
}