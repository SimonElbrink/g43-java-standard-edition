package se.lexicon;

public class Main {

    // 1.Static is always running first in the program
    // 2. instance
    // 3. constructors "Instantiation"

    //Fields
    public static int number1 = 10;


    public static void main(String[] args)
    {

//        method1();
        Main.method1(); // Access in a static way.


//        instanceMethod();// compile error.

        Main main = new Main();// Instantiating an Object.
        main.instanceMethod();

        System.out.println(number1);// print out 10
        System.out.println(Main.number1);// print out 10


        System.out.println(VolvoCar.brand); // prints static field = Volvo.

        VolvoCar v70 = new VolvoCar(); // Instance of a Car saved in a variable names v70.
        v70.model = "v70";
        v70.regNumber ="ABC123";

        System.out.println(v70.getInformation());

        VolvoCar xc90 = new VolvoCar();
        xc90.model = "xc90";
        xc90.regNumber = "CBA123";

        System.out.println(xc90.getInformation());

        VolvoCar.brand = "VOLVO CARS";  // Changes the value in all instances of a VolvoCar.
        System.out.println("Changes the brand name.");

        System.out.println(v70.getInformation());
        System.out.println(xc90.getInformation());

    }

    public static void method1(){
        System.out.println("Static method");

//        instanceMethod(); // Can not call instance method
    }

    public void instanceMethod(){
        System.out.println("Instance Method");

        method1(); // Inside a instance method you can call a static method
    }
}