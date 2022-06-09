package se.lexicon.methods;

import java.util.Scanner;

/**
 * Method Syntax: [access modifier] static [return type] [method name] ([params]) {}
 */
public class MethodExamples {

    //Public Access
    public static void guessProcess(int myGuess, int numberToGuess){
        if (myGuess > numberToGuess){
            System.out.println("number to High guess a Lower number");
        }else if (myGuess < numberToGuess){
            System.out.println("Number is to Low try a higher number!");
        } else {
            System.out.println("you Have Guessed the Right Number!");
        }
    }

    //Private Access
    private static double addition(double num1, double num2){
        return num1 + num2;
    }

    //Package Access
    static void greetings(String groupName){
        System.out.println("Greetings " + groupName);
    }

    //Public Access
    public static String getStringFromUser(String prompt){
        Scanner sc = new Scanner(System.in);

        System.out.print(prompt);
        return sc.nextLine();
    }

    public static void main(String[] args) {

//        greetings("JavaGroup43");

//        double number1 = 10;
//        double number2 = 15;
//
//        double result = 0;
//
//        result = addition(number1, number2);
//
//        System.out.println(result);


        MethodExamples.guessProcess(30, 40); // Public Access modifier - Can be accessed from any class.

        MethodExamples.addition(10, 50); // Private protected - Only accessible in this class (MethodExamples)

        MethodExamples.greetings("Java group!"); //Package Protected - Accessible in same package (se.lexicon.methods)


        String string = MethodExamples.getStringFromUser("Enter a String: ");

        System.out.println("You Entered: " + string);


        String antherString = MethodExamples.getStringFromUser("Enter AntherOne: ");

        System.out.println(antherString);


    }
}
