package se.lexicon;

public class StringExamples {

    public static void main(String[] args) {

/*        String aWord = "Hi";
        String sentence = "Hello Java Group 43";
        String aName = "Simon";
        aName = aName.concat(" Elbrink");
        System.out.println(aName);
*/


        String firstName = "Simon";
        String lastName = "Elbrink";
        int birthYear = 1997;

        System.out.println(birthYear);

        String personInfo = firstName + " " + lastName + " Age: " + (2022 - birthYear);

        System.out.println("" + personInfo);

    }
}
