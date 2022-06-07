package se.lexicon.methods;

import java.util.Scanner;

public class MethodExamples {


    public static void guessProcess(int myGuess, int numberToGuess){
        if (myGuess > numberToGuess){
            System.out.println("number to High guess a Lower number");
        }else if (myGuess < numberToGuess){
            System.out.println("Number is to Low try a higher number!");
        } else {
            System.out.println("you Have Guessed the Right Number!");
        }
    }


    private static double addition(double num1, double num2){
        return num1 + num2;
    }


    static void greetings(String groupName){
        System.out.println("Greetings " + groupName);
    }

    public static String getStringFromUser(String prompt){
        Scanner sc = new Scanner(System.in);

        System.out.print(prompt);
        return sc.nextLine();
    }


}
