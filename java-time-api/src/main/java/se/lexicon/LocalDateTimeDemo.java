package se.lexicon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeDemo {
    public static void main(String[] args) {

        LocalDateTime timestamp = LocalDateTime.now();
        LocalDateTime nextWorkshop = LocalDateTime.parse("2022-07-01T09:00");
        LocalDateTime endOfWorkWeek = LocalDateTime.of(2022,7, 1,17,0);

        System.out.println("timestamp = " + timestamp);
        System.out.println("nextWorkshop = " + nextWorkshop);
        System.out.println("endOfWorkWeek = " + endOfWorkWeek);

        //4 July 9:00
//        LocalDateTime firstMeetingOfTheWeek =
//                endOfWorkWeek
//                        .plusDays(3)
//                        .minusHours(8);
        LocalDateTime firstMeetingOfTheWeek =
                endOfWorkWeek
                        .plusSeconds(230400);

        System.out.println("firstMeetingOfTheWeek = " + firstMeetingOfTheWeek);


        System.out.println("timestamp = " + timestamp.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("timestamp = " + timestamp.format(DateTimeFormatter.ISO_WEEK_DATE));
        System.out.println("timestamp = " + timestamp.format(DateTimeFormatter.ofPattern("eeee dd MM y 'T' hh:mm:ss")));




    }
}
