package se.lexicon.fundamentals;


//Orange = Keyword
//Yellow = in use  = Methods
//White = in use = variable
//Grey = not in use
//Purple = used fields
//"italic" = Static
//"Highlight" = Warning / IntelliJ Suggestion.
//"Red squiggly Line" = Compile / Runtime Error
//Green = Characters


public class MethodOverloading {



    public static void main(String[] args) {
        int i = 1000;

        add(i,10003.23);

    }


    public static int add(int number1, int number2){
       return number1 + number2;
    }

    public static double add(double number1, double number2){
        return number1 + number2;
    }



}
