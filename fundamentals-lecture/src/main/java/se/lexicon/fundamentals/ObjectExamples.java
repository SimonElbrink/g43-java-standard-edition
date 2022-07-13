package se.lexicon.fundamentals;

class Person {

    String firstName;
    String lastName;
    int birthYear;

    public String getInformation(){
        return firstName + " " + lastName + " Age: " + (2022 - birthYear);
    }

}

public class ObjectExamples {

    public static void main(String[] args) {

        Person simon = new Person();
        simon.firstName = "Simon";
        simon.lastName = "Elbrink";
        simon.birthYear = 1997;

        Person erik = new Person();
        erik.firstName = "Erik";
        erik.lastName = "Svensson";
        erik.birthYear = 1976;

        Person ulf = new Person();
        ulf.birthYear = 1988;


//        getInformation();


//        System.out.println(simon.getInformation());
//        System.out.println(simon.firstName + " " + simon.lastName + " Age: " + (2022 - simon.birthYear));
//
//        System.out.println(erik.getInformation());

        System.out.println(erik);




    }
}
