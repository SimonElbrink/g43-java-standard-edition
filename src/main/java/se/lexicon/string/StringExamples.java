package se.lexicon.string;

public class StringExamples {

    public static void main(String[] args) {

        //String syntax = ""
        String sentence = "Hello I'm a String.";
//        String s = new String("String Value");

        int i = 1000;
//        i. // Does not have methods.

        sentence.toLowerCase(); // Strings have methods


//        replaceExamples();



    }


    public static void ex1(){
        //             0123456
        String name = "Simon Elbrink";

        System.out.println(name.length());

        System.out.println(name.charAt(6));
    }

    public static void ex2(){

        String name = "Erik Svensson";


        System.out.println(name.indexOf("Sven"));
        System.out.println(name.indexOf("ik"));
        System.out.println("Names splits at index: " + name.indexOf(" "));

        System.out.println(name.indexOf("s")); // 9
        System.out.println(name.indexOf("s",10)); //10


        System.out.println(name.lastIndexOf("s")); // 10


        int index = name.indexOf("S");

        char c = name.charAt(index);

        System.out.println(c);

//        System.out.println(name.charAt(name.indexOf("S")));


    }

    public static void ex3(){
        // Substring
        String message = "I Love Programming in Java!";

        int indexOfP = message.indexOf("P");
        String messageShort = message.substring(indexOfP);
        System.out.println(messageShort);

        int indexOfL = message.indexOf("L");
        String messageLove = message.substring(indexOfL,indexOfL+4);
        System.out.println(messageLove);


        String[] messageArray = message.split(" ");


        System.out.println(messageArray[1]);
    }

    public static void equalsExamples(){

        String message1 = "I Love Programming in Java!";
        String message2 = "i LOVe PrOgraMMing in JAVA!";

        boolean isTheSame = message1.equals(message2);
        boolean isTheSameIgnoreCase = message1.equalsIgnoreCase(message2);

        boolean ownIgnoreCasing = message1.toLowerCase().equals(message2.toLowerCase());


    }


    public static void containsExamples(){

        String message = "I Love Programming in Java!";

        boolean endsWithJava = message.endsWith("Java!");
        boolean startsWithLove = message.startsWith("Love");

        boolean containsIn = message.contains("in");
        boolean containsM = message.contains("M");

    }


    public static void replaceExamples(){

        String message = "I Love Programming in Java!";

        message = message.replace("Love", "LOVE");

        System.out.println(message);

        System.out.println(message.replace(" in Java", ""));

    }


    public static void trimExample(){
        String message = "         \n I Love\t Programming in Java! \t \t \n ";

        System.out.print(message.trim()); // Removes whitespaces in beginning of end of the String


    }



}
