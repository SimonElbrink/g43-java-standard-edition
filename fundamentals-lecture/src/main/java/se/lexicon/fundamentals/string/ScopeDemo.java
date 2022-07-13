package se.lexicon.fundamentals.string;

public class ScopeDemo {

    //Instance Field
    int number = 900;

    //static field
    static int staticNumber = 9000;

    public static String name = "Simon Elbrink";


    //Special Main Method
    public static void main(String[] args) {
        //Variable
        int staticNumber = 40;

//        System.out.println(intInFoo);

        System.out.println(staticNumber); // Is the closest staticNumber variable

        System.out.println(ScopeDemo.staticNumber); // Target staticNumber in class ScopeDemo

        ScopeDemo sd = new ScopeDemo();
        sd.noStatic();
    }

    public void noStatic(){

        int number = 1_000_000;

        System.out.println(number); // 1000000
        System.out.println(this.number); // 900
    }

    // Custom Method - We have the full control
    public static void foo(){
        //Variable
        int staticNumber = 80;

        //Variable
        int intInFoo = 0;

        System.out.println(intInFoo);

        System.out.println(staticNumber);
    }

    public static void bar(){ //Start of bar scope

        int result = 100;

        for (int i = 0; i < 10; i++){ // start of for scope
            System.out.println(i);
            System.out.println(result);
        } // end of for scope

        System.out.println(result);

//        System.out.println(i); inside for scope

    } // end of Bar Scope


}
