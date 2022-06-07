package se.lexicon;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LoopExamples {

    public static void main(String[] args) {


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


        System.out.println("print out a lot of numbers!");

        int[] numbers = {100,101,150,1000,500,400,300,1,40};

//        // length is 9
//        for (int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }

        for (int number : numbers){
            System.out.println(number);
        }
















//        doWhileLoopExample();
//        whileLoopExample();
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
}
