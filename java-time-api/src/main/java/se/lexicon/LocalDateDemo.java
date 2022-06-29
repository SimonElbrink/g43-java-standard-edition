package se.lexicon;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate today_plus_4Days = today.plusDays(4);
        LocalDate _30yearsAgo = today.minus(30, ChronoUnit.YEARS);

        System.out.println(today);
        System.out.println("today_plus_4Days = " + today_plus_4Days);
        System.out.println("_30yearsAgo = " + _30yearsAgo);

        LocalDate christmasEve = LocalDate.of(2020,12,24);

        LocalDate nextBirthDate = LocalDate.parse("2023-03-18");

        System.out.println(nextBirthDate.isLeapYear());
        System.out.println(christmasEve.isLeapYear());

        System.out.println("nextBirthDate.getDayOfWeek() = " + nextBirthDate.getDayOfWeek());
        System.out.println("nextBirthDate.getDayOfYear() = " + nextBirthDate.getDayOfYear());


        Period period = timeToChristmas(today);

        System.out.println(period.getYears() + " " + period.getMonths() + " " +period.getDays());

    }


    public static Period timeToChristmas(LocalDate today){
        LocalDate christmasEve = LocalDate.of(
                today.getYear(),
                12,
                24);

        return Period.between(today,christmasEve);

    }

}