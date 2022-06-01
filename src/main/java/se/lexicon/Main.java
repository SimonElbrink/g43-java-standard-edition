package se.lexicon; // Package always at line 1


// Single-Line Comment - Text that java Compiler will never look at.

/*
    Multi-line comment
 */

/**
 * Multi-Line Comment, used when documenting you code.
 */

public class Main { // Start of a class
    public static void main(String[] args) { //Start of a method

        //Variable
        short shortNumber1 = 11111;
        int number1 = 1_000_000_000;
        long longNumber = 1_000_000_000_000_000_000L;


        double decimalNumber = 100.00;
        float floatDecimal = 300.01F;
        // int decimals = 100.95; // This is a Decimal number can not be saved in type int!

        boolean valid = false; //0
        boolean check = true; //1


        char anALetter = 'a';
        char character = '\u0044'; //D


        //Create a variable
        int speed;

        // Assigned a value to "speed" variable
        speed = 80;

        //Print out Value of "speed".
        //System.out.println(speed);


        int myNumber1 = 1, myNumber2 = 10, myNumber3;

        System.out.println(myNumber1);
        System.out.println(myNumber2);
        //System.out.println(myNumber3);
    } // End of Method

} //End of the class