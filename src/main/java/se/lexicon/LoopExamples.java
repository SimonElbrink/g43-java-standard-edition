package se.lexicon;


import java.util.Scanner;

public class LoopExamples {

    public static void main(String[] args) {





//        forLoopExamples();
//        doWhileLoopExample();
//        whileLoopExample();
//        whileLoopBreakExample();

    }

    private static void forLoopExamples() {
        System.out.println("Increment");
        for (int i=0; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println("Decrement");
        for (int i = 100; i > 0; i--){
            System.out.println(i);
        }

        System.out.println("Odd or Even?");
        for (int i = 1; i <= 6; i++){
            if (i % 2 == 0){
                System.out.println("Number " + i + " is a Even Number!");
            }else {
                System.out.println("Number " + i + " is a odd Number!");
            }
        }

        //------------------------------------------------------------

        System.out.println("Print out numbers!");
        // LENGTH COUNT   1   2   3    4   5   6   7  8  9
        // INDEX          0   1   2    3   4   5   6  7  8
        int[] numbers = {100,101,150,1000,500,400,300,1,40};

        //Option 1 For-loop
//        // numbers.length in this case has the value of 9
//        for (int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }

        //Option 2  For-Each loop
        for (int number : numbers){
            System.out.println(number);
        }

        //------------------------------------------------------------

        for (int i = 0; i <= 10; i++){
            if (i == 6){
                continue;
            }
            System.out.println(i);
        }



    }




    private static void doWhileLoopExample() {
        int number = 5;

        do{
            number++;
        }
        while(number != 0 && number <5);

        System.out.println(number);
    }



    private static void whileLoopExample() {
        Scanner sc = new Scanner(System.in); // For input from user
        boolean isAdult = true;  // To Validate the Loop. if we should continue of not.

        while (isAdult) {

            System.out.println("Whats your age?");
            int age = sc.nextInt();

            if (age >= 18) {
                System.out.println("Your an adult!");
            } else {
                System.out.println("Your a child!");
                isAdult = false;
            }
        }
    }



    private static void whileLoopBreakExample() {
        Scanner sc = new Scanner(System.in); // For input from user

        System.out.println("Start of while Example");

        // Creates an infinite loop
        while (true) {

            System.out.println("Whats your age?");
            int age = sc.nextInt();

            if (age >= 18) {
                System.out.println("Your an adult!");
            } else {
                System.out.println("Your a child!");
                break;
            }
        }

        System.out.println("End of while example");
    }
}
