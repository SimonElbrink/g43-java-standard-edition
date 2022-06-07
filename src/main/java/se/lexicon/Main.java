package se.lexicon;

import se.lexicon.methods.MethodExamples;

public class Main { //Start of Class
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


        MethodExamples.guessProcess(30, 40);


//        MethodExamples.addition(10, 50); // Private prtected

//        MethodExamples.greetings("Java group!"); //Package Protected.


        String string = MethodExamples.getStringFromUser("Enter a String: ");

        System.out.println("You Entered: " + string);


        String antherString = MethodExamples.getStringFromUser("Enter AntherOne: ");

        System.out.println(antherString);


    }


} // End of Class
