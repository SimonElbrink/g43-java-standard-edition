package se.lexicon;

/*
    A Company want to have a calculator for doing
    Addition,Subtraction,Multiplication,Division
    between two numbers.
    This is the contract
 */

import java.util.Scanner;

//Making reality of this contract in code, using interface.
public interface Calculator {

    // All fields are public, static, final in an Interface
    String PLUS = "+";
    String MINUS = "-";
    String MULTIPLY = "*";
    String DIVIDE = "/";

    Scanner scanner = new Scanner(System.in);

    static String getStringFromUser(){
        return scanner.nextLine();
    }

    static double getDoubleFromUser(){
        boolean invalid = true;
        double number = 0;
        while(invalid){
            try{
                number = Double.parseDouble(getStringFromUser().replaceAll(",",".").trim());
                invalid = false;
            }catch (NumberFormatException ex){
                System.out.println("Not a valid decimal number");
            }
        }
        return number;
    }

    //All Methods in Interfaces are public-/default-access and abstract.
    //Abstract methods. = methods without implementation
    double addition(double number1, double number2);
    double subtraction(double number1, double number2);
    double multiplication(double number1, double number2);
    double division(double number1, double number2);

     default double calculate(double num1, double num2, String operator){

         double result = 0;

         switch (operator){
             case PLUS:
                 result = addition(num1,num2);
                 break;
             case MINUS:
                 result = subtraction(num1,num2);
                 break;
             case MULTIPLY:
                 result = multiplication(num1,num2);
                 break;
             case DIVIDE:
                 result = division(num1,num2);
                 break;
             default:
                 throw new IllegalArgumentException("Invalid Operator: " + operator);
         }

        return result;
    }






}
