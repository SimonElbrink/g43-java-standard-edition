package se.lexicon.fundamentals.array;

import java.util.Arrays;

public class ArrayExamples {

    public static void main(String[] args) {

//        initializing();

//        accessingArray();

//        iteratingArray();

//        multidimensionalArray();

        TwoDStringArray();
    }

    public static void initializing() {

        int[] integers; //Created, but non-initialized.

        double doubles[];  //Alternative way to create an Array variable.

        char[] chars = new char[5];
        //Length of 5  INDEX - 0,1,2,3,4
        //Arrays are INDEX based. Starts at ZERO
        //      0        1        2        3        4
        // ['\u0000','\u0000','\u0000','\u0000','\u0000']

        char[] javaWord = new char[]{'J', 'A', 'V', 'A'}; // Prints "JAVA"

        //                0    1   2    3      4    5
        int[] numbers = {100, 200, 50, 9001, 10000, 1};

    }

    public static void accessingArray() {

        //                0    1   2    3      4     5
        int[] numbers = {100, 200, 50, 9001, 10_000, 6500};

        //Changing a Value
        numbers[2] = 5_000_000;

        System.out.println(numbers.length); // length = 6

        //First Index
        System.out.println(numbers[0]); //100

        //Last Index
        System.out.println(numbers[5]); //6500
        System.out.println(numbers[numbers.length - 1]); //6500

        //Access any index
        System.out.println("Array index of 3: " + numbers[3]);
        System.out.println("Array index of 2: " + numbers[2]);

    }

    public static void iteratingArray() {

        //Fill array with values of 1 to 10.
        int[] numbers = new int[10]; // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


//        for (int i = 0; i < numbers.length; i++){ // Access Value AND INDEX
//            System.out.println("Numbers Array of index " + i + " With Value "+ numbers[i]);
//        }

        //print out the array.
        for (int numberInArray : numbers) {

//            if (numberInArray % 2 == 0){
//                System.out.print(numberInArray + " "); // Only access Value NO Index
//            }
//            if (numberInArray % 2 != 0){
//                System.out.print(numberInArray + " "); // Only access Value NO Index
//            }

//            if (numberInArray == 6){
//                System.out.print(numberInArray + " "); // Only access Value NO Index
//            }

            System.out.print(numberInArray + " "); // Only access Value NO Index
        }

        //Print out the Array
//        System.out.println(Arrays.toString(numbers));

    }

    public static void multidimensionalArray() {

//        int[][] numbers = new int[3][3];
//
//        numbers[0][0] = 1;
//        numbers[0][1] = 10;
//        numbers[0][2] = 100;
//
//        numbers[1][0] = 2;
//        numbers[1][1] = 20;
//        numbers[1][2] = 200;
//        //numbers[1][3] = 2000; - RunTime Error
//
//        numbers[2][0] = 3;
//        numbers[2][1] = 30;
//        numbers[2][2] = 300;

        int[][] numbers = {
                {1,10,100},
                {2,20,200,2000},
                {3,30,300,3000,30_000}
        };


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }

            System.out.println(" ");
        }

    }
    public static void TwoDStringArray() {
        String[] [] strArr = new String[2][2];
        // [null,null]
        // [null,null]

        strArr[0][0] = "France";
        strArr[0][1] ="Paris";
        // [France, Paris]
        // [null, null]

        strArr[1][0] = "Norway";
        strArr[1][1] ="Oslo";
        // [France, Paris]
        // [Norway, Oslo]

        //print out 2d Array
        for (int i=0; i < strArr.length; i++){
            for(int j=0; j < strArr[i].length; j++){
                System.out.print(strArr[i][j]);

            }
            System.out.println();
        }

        System.out.println(strArr[0][0] + " " + strArr[0][1]);
        System.out.println(strArr[1][0] + " " + strArr[1][1]);

        System.out.println(Arrays.deepToString(strArr));
    }
}
