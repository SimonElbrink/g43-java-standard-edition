package se.lexicon;

public class Calculator {


    /**
     *  TODO - Add, Sub, Multi, Div
     *
     */

    // Help structure code,
    //Syntax for Method: [Access Modifier] static [return Type] [Method Name] ([Params]) {}
    public static double addition(double number1, double number2){
        double result = 0;

        result = number1 + number2;

        return result;
    }

    public static double subtraction(double number1, double number2){
        return number1 - number2;
    }

    public static double multiplication(double number1, double number2){
        return number1 * number2;
    }

    public static double division(double number1, double number2){
        return number1 / number2;
    }



}
