package se.lexicon;

// A Class can implement many interfaces but only extend one class.
// Implementing methods from Calculator interface is Mandatory. -- You need to fulfil the contract.
public class BasicCalculator implements Calculator{

    @Override
    public double addition(double number1, double number2) {
        return number1 + number2;
    }

    @Override
    public double subtraction(double number1, double number2) {
        return number1 - number2;
    }

    @Override
    public double multiplication(double number1, double number2) {
        return number1 * number2;
    }

    @Override
    public double division(double number1, double number2) {
        return number1 / number2;
    }



}
