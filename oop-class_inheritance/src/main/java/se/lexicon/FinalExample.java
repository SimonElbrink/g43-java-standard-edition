package se.lexicon;

public class FinalExample {

    public static void main(String[] args) {

        final int FINAL_NUMBER = 10;

//        FINAL_NUMBER = 100;

        final String[] names;

        names = new String[10]; // Can't change reference after first initialization.
//        names = new String[20];// only allowed to set ones.

        names[0] = "Simon";

        names[0] = "Marcus";



    }
}
