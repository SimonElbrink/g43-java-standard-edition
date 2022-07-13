package se.lexicon;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
/**
 * 1. Set only have methods from Collection Interface.
 * 2. Set can only contain unique elements. - "There can only be one!"
 * 3. Set using a mechanism called hashing when storing.
 * 4. Set does not allow you to access the elements of a Set in any guaranteed order.
 * 5. A SortedSet Like TreeSet orders the elements.)
 *
 */
public class HashSetExample {
    public static void main(String[] args) {

//        ex1();
        ex2();


    }

    private static void ex2() {
        String simon = "Simon"; // = 79888598
        System.out.println("simon.hashCode() = " + simon.hashCode());

        String simon1 = "Simon"; // = 79888598
        System.out.println("simon1.hashCode() = " + simon1.hashCode());

        Person simon_elbrink = new Person(
                "1956-12-12-1234",
                "Simon Elbrink",
                "simon@lexicon.se",
                LocalDate.parse("1956-12-12"));

        Person simon_elbrink1 = new Person(
                "1956-12-12-1234",
                "Simon Elbrink",
                "simon@lexicon.se",
                LocalDate.parse("1956-12-12"));


        System.out.println("simon_elbrink.equals(simon_elbrink1) = " + simon_elbrink.equals(simon_elbrink1));

        System.out.println("simon_elbrink.hashCode() = " + simon_elbrink.hashCode());
        System.out.println("simon_elbrink1.hashCode() = " + simon_elbrink1.hashCode());

        System.out.println(simon_elbrink);
        System.out.println(simon_elbrink1);


        Set<Person> personSet = new HashSet<>();

        personSet.add(simon_elbrink);
        personSet.add(simon_elbrink1);

        System.out.println(personSet); // If equals and hashCodes are implemented only one of the objects will be stored.


    }

    private static void ex1() {
        HashSet<String> lexiconOfficeVXO = new HashSet<>();

        String simon = "Simon";

        lexiconOfficeVXO.add(simon);
        lexiconOfficeVXO.add("Åsa");
        lexiconOfficeVXO.add("Mehrdad");

        System.out.println(lexiconOfficeVXO);

        HashSet<String> lexiconOfficeJKP = new HashSet<>();
        lexiconOfficeJKP.add("Kent");
        lexiconOfficeJKP.add("Marcus");
        lexiconOfficeJKP.add("Martina");
        lexiconOfficeJKP.add("Elisabeth");
        lexiconOfficeJKP.add("Jonas");

        System.out.println(lexiconOfficeJKP);


        HashSet<String> lexiconOfficeVXOHistory = new HashSet<>();
        lexiconOfficeVXOHistory.add("Ulf");
        lexiconOfficeVXOHistory.add("Erik L");
        lexiconOfficeVXOHistory.add("Erik S");
        lexiconOfficeVXOHistory.add("Ali");


        //TreeSet Class is always sorted.
        Collection<String> lexiconOffice = new TreeSet<>();
        lexiconOffice.addAll(lexiconOfficeVXO);
        lexiconOffice.addAll(lexiconOfficeJKP);
        lexiconOffice.addAll(lexiconOfficeVXOHistory);

        lexiconOffice.add(simon); // No Duplicates allowed
        System.out.println(lexiconOffice);


        lexiconOffice.removeAll(lexiconOfficeVXOHistory);
        System.out.println(lexiconOffice);
    }
}
