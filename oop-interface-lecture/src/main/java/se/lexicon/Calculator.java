package se.lexicon;

/*
    A Company want to have a calculator for doing
    Addition,Subtraction,Multiplication,Division
    between two numbers.
    This is the contract
 */

//Making reality of this contract in code, using interface.
public interface Calculator {

    // All fields are public, static, final in an Interface
    String PLUS = "+";
    String MINUS = "-";
    String MULTIPLY = "*";
    String DIVIDE = "/";


    //All Methods in Interfaces are public-/default-access and abstract.
    //Abstract methods. = methods without implementation
    double addition(double number1, double number2);
    double subtraction(double number1, double number2);
    double multiplication(double number1, double number2);
    double division(double number1, double number2);



}
