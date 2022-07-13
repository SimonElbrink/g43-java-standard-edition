package se.lexicon;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * 1. Map is using Key and Value Pairs.
 * 2. you can easily access the value by only specifying the key.
 */
public class HashMapExample {


    public static void main(String[] args) {

        Person simon_elbrink = new Person(
                "1956-12-12-1234",
                "Simon Elbrink",
                "simon@lexicon.se",
                LocalDate.parse("1956-12-12"));
        Person erik = new Person(
                "1976-09-11-4321",
                "Erik Svensson",
                "erik@lexicon.se",
                LocalDate.parse("1976-09-11"));

        HashMap<String, Person> personMap = new HashMap<>();

        personMap.put(simon_elbrink.getSsn(),simon_elbrink);
        personMap.put(erik.getSsn(), erik);


        System.out.println("personMap.size() = " + personMap.size());

        System.out.println(personMap.get("1956-12-12-1234"));

        System.out.println(personMap);
//
//        System.out.println(personMap.get("1956-12-12-1234"));
//        System.out.println(personMap.get("1976-09-11-4321"));



        //Print only the Keys
        for (String key : personMap.keySet()){
            System.out.println("Key: " + key);
        }

        //Print only the Values
        for (Person p: personMap.values()){
            System.out.println("Value: " + p);
        }

        //Print Keys and the values
        for ( Map.Entry<String,Person> e : personMap.entrySet()) {
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
        }







    }




}
