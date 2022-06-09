package se.lexicon.array;

public class ArrayExamples {

    public static void main(String[] args) {

//        initializing();

//        accessingArray();

//        iteratingArray();

        multidimensionalArray();
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
        int[] numbers = new int[10];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

//        for (int i = 0; i < numbers.length; i++){ // Access Value AND INDEX
//            System.out.println("Numbers Array of index " + i + " With Value "+ numbers[i]);
//        }

        for (int numberInArray : numbers) {
            System.out.println(numberInArray); // Only access Value NO Index
        }

    }

    public static void multidimensionalArray() {

        int[][] numbers = new int[3][3];

        numbers[0][0] = 1;
        numbers[0][1] = 10;
        numbers[0][2] = 100;

        numbers[1][0] = 2;
        numbers[1][1] = 20;
        numbers[1][2] = 200;

        numbers[2][0] = 3;
        numbers[2][1] = 30;
        numbers[2][2] = 300;


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }

            System.out.println(" ");
        }

    }
}
