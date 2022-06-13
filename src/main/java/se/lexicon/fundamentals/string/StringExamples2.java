package se.lexicon.fundamentals.string;

public class StringExamples2 {

    public static void main(String[] args) {


//        introString();
//        length_CharAt();
//        indexOf();
//        subString();
//        equals();
//        contains_startsWith_endsWith();
//        replace();
//        trim();
    }


    private static void introString() {
        //String syntax -> ""
        //Type -> String (Capital "S")

     String aWord = "Hi";
    String sentence = "Hello Java Group 43";
    String aName = "Simon";
    aName = aName.concat(" Elbrink");
    System.out.println(aName);

//        String s = new String("String Value");

        int i = 1000;
//        i. // Does not have methods.

        sentence.toLowerCase(); // String is an Object and have methods.


        String firstName = "Simon";
        String lastName = "Elbrink";
        int birthYear = 1997;

        System.out.println(birthYear);

        String personInfo = firstName + " " + lastName + " Age: " + (2022 - birthYear);

        System.out.println("" + personInfo);
    }


    public static void length_CharAt(){

        String name = "Simon Elbrink";

        System.out.println(name.length()); // 13

        System.out.println(name.charAt(6)); // E
    }

    public static void indexOf(){

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

    public static void subString(){
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

    public static void equals(){

        String message1 = "I Love Programming in Java!";
        String message2 = "i LOVe PrOgraMMing in JAVA!";

        boolean isTheSame = message1.equals(message2);
        boolean isTheSameIgnoreCase = message1.equalsIgnoreCase(message2);

        boolean ownIgnoreCasing = message1.toLowerCase().equals(message2.toLowerCase());

    }

    public static void contains_startsWith_endsWith(){

        String message = "I Love Programming in Java!";

        boolean endsWithJava = message.endsWith("Java!");
        boolean startsWithLove = message.startsWith("Love");

        boolean containsIn = message.contains("in");
        boolean containsM = message.contains("M");

    }

    public static void replace(){

        String message = "I Love Programming in Java!";

        message = message.replace("Love", "LOVE");

        System.out.println(message);

        System.out.println(message.replace(" in Java", ""));

    }

    public static void trim(){
        String message = "         \n I Love\t Programming in Java! \t \t \n ";

        System.out.print(message.trim()); // Removes whitespaces in beginning of end of the String
    }

}
