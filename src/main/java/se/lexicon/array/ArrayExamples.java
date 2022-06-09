package se.lexicon.array;

public class ArrayExamples {

    public static void main(String[] args) {

        initializing();

    }

    public static void initializing(){

        int[] integers; //Created, but non-initialized.

        double doubles[];  //Alternative way to create an Array variable.

        char[] chars = new char[5];
        //Length of 5  INDEX - 0,1,2,3,4
        //Arrays are INDEX based. Starts at ZERO
        //      0        1        2        3        4
        // ['\u0000','\u0000','\u0000','\u0000','\u0000']

        char[] javaWord = new char[] {'J', 'A', 'V', 'A'}; // Prints "JAVA"

        //                0    1   2    3      4    5
        int[] numbers = {100, 200, 50, 9001, 10000, 1};
        System.out.println(numbers);

    }

}
