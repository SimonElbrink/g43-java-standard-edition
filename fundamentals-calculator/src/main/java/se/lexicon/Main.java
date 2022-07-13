package se.lexicon;


import java.util.Scanner;

/**
 * TODO - Menu to run the program,
 *         Ask for input - operator, 2 numbers
 *         Selection of operator
 *         Looping for Recalculating - Errors?
 */
public class Main {
    public static void main(String[] args) {

        boolean run = true;

        while(run){
            displayMenu();

            String operator = getStringFromUser("Choose Operator: ");

            double number1 = getDoubleFromUser("Enter First number: ");
            double number2 = getDoubleFromUser("Enter second number: ");

            System.out.println("Operator: " + operator);
            System.out.println("Number1: " + number1);
            System.out.println("Number2: " + number2);


//        if (operator == "+"){
//            System.out.println(Calculator.addition(number1,number2));
//        }

            double result = 0;


            switch (operator){
                case "+":
                    result = Calculator.addition(number1,number2);
                    break;
                case "-":
                    result = Calculator.subtraction(number1,number2);
                    break;
                case "*":
                    result = Calculator.multiplication(number1,number2);
                    break;
                case "/":
                    result = Calculator.division(number1, number2);
                    break;
            }

            System.out.println(result);

            String redoCalc = getStringFromUser("Do You Want to Calculate?  Y=(Yes), N=(No)");
            run = validateReDo(redoCalc);

        }
    }


    private static void displayMenu(){

        System.out.println("### Welcome to this simple calculator! ###");
        System.out.println(" + : Addition");
        System.out.println(" - : Subtraction");
        System.out.println(" * : Multiplication");
        System.out.println(" / : Division");
    }

    private static boolean validateReDo(String redoValidate){
        if (redoValidate.equals("Y")){
            return true;
        }else {
            return false;
        }
    }

    public static String getStringFromUser(String prompt){
        Scanner sc = new Scanner(System.in);

        System.out.print(prompt);
        return sc.nextLine();
    }

    public static double getDoubleFromUser(String prompt){
        Scanner sc = new Scanner(System.in);

        System.out.print(prompt);
        return sc.nextDouble();
    }

}