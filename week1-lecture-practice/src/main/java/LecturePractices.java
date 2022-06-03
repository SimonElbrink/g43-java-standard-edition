import java.util.Scanner;

public class LecturePractices {

    private static final String WELCOME_MESSAGE =
            "\nHi and welcome to our practices From Java Fundamentals Lecture\n" +
            "Do you want to continue type (Y)";


    public static void main(String[] args) {

        while(true){

            String answer = UserInputUtil.getStringFromUser(WELCOME_MESSAGE);

            if (answer.equalsIgnoreCase("Y")){


            int practiceNumber = UserInputUtil.getIntFromUser("What practice do you want to run? (1-6)");

            switch (practiceNumber){
                case 1:
                    practice1();
                    break;
                case 2:
                    practice2();
                    break;
                case 3:
                    practice3();
                    break;
                case 4:
                    practice4();
                    break;
                case 5:
                    practice5();
                    break;
                case 6:
                    practice6();
                    break;
                default:
                    System.out.println("hmm, can't find that one.");
            }

            } else {
                break;
            }

        }

        System.out.println("Thanks, and see you around");
    }

    private static boolean validateContinue(String toValidate){
        if (toValidate.toLowerCase() == "y" ){
            return true;
        }else
            return false;
    }

    /**
     * Create a String with your first name as content.
     * Print out the String object to the console.
     */
    public static void practice1 (){
        String firstName = "Simon";

        System.out.println(firstName);
    }

    /**
     * Create two Strings.
     * One with your first name and the other with your last name.
     * Print out both Strings to the console with a ” ” separating them.
     */
    public static void practice2(){

        String firstName = "Simon";
        String lastName = "Elbrink";

        System.out.println(firstName + " " + lastName);
    }

    /**
     * Create two variables with decimal values.
     * Create a third decimal variable called result.
     * Assign the sum of the two first variables to result.
     */
    public static void practice3(){
        double number1 = 50.66;
        double number2 = 25.96;
        double result;

        result = number1 + number2;

        System.out.println(result);
    }


    /**
     * Create a class called Car. The class should contain the following information.
     * Car brand, registration number, max speed, owner name and one more attribute of your choice.
     * Instantiate an Object of the class and assign values to the object.
     */
    public static void practice4(){
        //Car.java file is associated with this practice

        /*
         * ObjectType objectName = new ObjectType(); - Syntax ("new" is a keyword for instantiating)
         */

        Car v70 = new Car();

        v70.brand = "Volvo";
        v70.model = "v70";
        v70.productionYear = 2006;
        v70.regNumber = "ABC123";
        v70.color = "Red";
        v70.gearbox = "Automatic";
        v70.ownerName = "Simon Elbrink";

//        System.out.println(v70.color);

        System.out.println(v70.getInformation());
        v70.printOwner();



        Car e30 = new Car();

        e30.brand = "bmw";
        e30.model = "e30";
        e30.productionYear = 1994;
        e30.regNumber = "CBA321";
        e30.color = "Silver";
        e30.gearbox = "Manual";

        System.out.println(e30.brand);
        System.out.println(e30.gearbox);
        System.out.println(e30.getInformation());



        //Question can we print all on separate line using \n? - Yes
        System.out.println(v70.brand + "\n" + v70.model + "\n" + v70.productionYear);

        //Question - Cant we use toString()?
        System.out.println(v70.toString()); // Prints Object hash value by default. for now..


        //Question can we store multi types in an array, NO but store One Object with many values.
        Car[] cars = new Car[] {v70, e30};

        System.out.println("----  CAR ARRAY -----");
        System.out.println(cars[0].getInformation());
        System.out.println(cars[1].getInformation());

    }

    /**
     * Make an integer called score and assign a value to it.
     * Create an if-statement that should print out ”Hurray, You passed!”
     * if the score is above or equals to 65.
     * If the score is Equal or between 55 and 64 it should print ”You are almost there.”.
     * If score is below 55 it should print ”Sorry, You did not pass.”.
     */
    private static void practice5() {
        //        if(BooleanExpression){}

        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("Enter a Score to check if you passed the test");
            System.out.print("score: ");
            int score = scanner.nextInt();

            if (score >= 65) {
                System.out.println("Hurray, you passed!");
                break;
            } else if (score >= 55) {
                System.out.println("You are almost there.");
            } else {
                System.out.println("sorry you did not pass.");
            }

        }
    }

    /**
     * Being a developer you need to learn how to search for information on the Internet.
     * Open up a web browser and search for ”java input from user”.
     * Use your new knowledge to take a String as input from the user and store it in a String object.
     *
     */
    private static void practice6() {

        //Don't forget to import Scanner Class
        // import java.util.Scanner;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello what do you want to write?");
        System.out.print("Enter message here: ");
        String message = scanner.nextLine();

        System.out.println(message);
    }
}
