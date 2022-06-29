package se.lexicon;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {

    public static void main(String[] args) {

        LocalTime timeNow = LocalTime.now();

        LocalTime startOfLecture = LocalTime.of(9,0);
        LocalTime endOfLecture = LocalTime.parse("12:00");

        System.out.println("startOfLecture = " + startOfLecture);
        System.out.println("endOfLecture = " + endOfLecture);

        System.out.println("timeNow = " + timeNow);
        System.out.println(timeNow.truncatedTo(ChronoUnit.SECONDS));
        System.out.println(timeNow.truncatedTo(ChronoUnit.MINUTES));
        System.out.println(timeNow.truncatedTo(ChronoUnit.HOURS));


        LocalTime plus_10_hours_plus_5_minutes = timeNow.plusHours(10).plusMinutes(5);
        System.out.println("plus_10_hours_plus_5_minutes = " + plus_10_hours_plus_5_minutes);


        LocalTime lunchTime = LocalTime.NOON; // 12:00
        LocalTime min = LocalTime.MIN; // 00:00
        LocalTime max = LocalTime.MAX; // 23:59:999999999

        System.out.println("max = " + max);

        //How many minutes / Seconds to end of the day?


        Duration duration = Duration.between(timeNow, max) ; // in Seconds.

        System.out.println("Seconds left of this day: "+ duration.getSeconds());
        System.out.println("Minutes left of this day: "+ (duration.getSeconds() / 60) + " Seconds: " + (duration.getSeconds() % 60));



        //Calculating
        long hours = duration.getSeconds() / 3600;
        long minutes =  (duration.getSeconds() % 3600) / 60;
        long seconds = duration.getSeconds() % 60;

        //Printout
        System.out.println("Hours left of this day: "+ hours + " Minutes: " + minutes + " Seconds: " + seconds);





    }
}
