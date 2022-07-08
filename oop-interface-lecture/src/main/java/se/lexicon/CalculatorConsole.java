package se.lexicon;

public class CalculatorConsole {

    private BasicCalculator calculator;

    public CalculatorConsole(BasicCalculator calculator) {
        this.calculator = calculator;
    }

    public void running(){


        boolean running = true;

        while (running){

            System.out.print("Please enter a number: ");
            double number1 = Calculator.getDoubleFromUser();

            System.out.print("Please enter another number: ");
            double number2 = Calculator.getDoubleFromUser();

            System.out.print("Please enter a operator (+ , - , / , *): ");
            String operator = Calculator.getStringFromUser();

            double result =  calculator.calculate(number1, number2, operator);
            System.out.println(number1 + " " + operator + " " + number2 + " = " + result);


            System.out.println("Do you wan to make a calculation again? (y/n) ");
            String choice = Calculator.getStringFromUser();
            if (choice.equalsIgnoreCase("n")){
                running = false;
            }
        }
    }
}
