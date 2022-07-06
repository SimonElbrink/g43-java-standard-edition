package se.lexicon;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

//        //MONDAY
//        System.out.println(WeekDay.MONDAY);

        for (Planet p : Planet.values()) {
            System.out.println(p);
        }

        Planet planetMars = Planet.valueOf("mars".toUpperCase());

        System.out.println("planetMars = " + planetMars);

//        Planet pluto = Planet.PLUTO; // COMPILE ERROR
        Planet mars = Planet.MARS;

//        new Planet(1233,1234); // Can't initialize

        Planet.EARTH.printOutMass();

        LocalDate.of(2022, Month.JULY,6);


    }
}