package se.lexicon.array;

public class ArrayExamples {

    public static void main(String[] args) {

//        initializing();

        accessingArray();
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

    }

    public static void accessingArray(){

        //                0    1   2    3      4     5
        int[] numbers = {100, 200, 50, 9001, 10_000, 6500};

        //Changing a Value
        numbers[2] = 5_000_000;

        System.out.println(numbers.length); // length = 6

        //First Index
        System.out.println(numbers[0]); //100

        //Last Index
        System.out.println(numbers[5]); //6500
        System.out.println(numbers[numbers.length -1]); //6500

        //Access any index
        System.out.println("Array index of 3: " + numbers[3] );
        System.out.println("Array index of 2: " + numbers[2] );

    }

}
