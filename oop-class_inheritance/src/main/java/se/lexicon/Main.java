package se.lexicon;


import se.lexicon.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Person p1 = new Person("Test", LocalDate.MIN); // Person is now abstract can't be initialized

//        p1.toString(); // Inherited method


//        Employee e1 = new Employee("Lucky", LocalDate.MAX, 20_000, LocalDate.MIN);
        //If class is abstract you CAN NOT Be instantiated.
//        e1.getName();


        //Programmer is an Employee and a Person
        Programmer tomTheHacker = new Programmer(
                "Tom the White Hat",LocalDate.of(1976,2,29),
                LocalDate.parse("1997-05-01"),
                new String[]{"c++", "ruby", "java", "assembly",
                        "fortran", "python", "lua", "ada"},
                new String[]{"OCA", "OCP", "OCE", "OCM"}
                );
        tomTheHacker.calcSalary();
        System.out.println(Arrays.toString(tomTheHacker.getCertificates()));

        Employee employeeTom = new Programmer(
                "Tom the White Hat",LocalDate.of(1976,2,29),
                LocalDate.parse("1997-05-01"),
                new String[]{"c++", "ruby", "java", "assembly",
                        "fortran", "python", "lua", "ada"},
                new String[]{"OCA", "OCP", "OCE", "OCM"}
        );;

        //Casting - Promoting to a programmer.
        Programmer backToNormal = (Programmer) employeeTom;

        System.out.println(employeeTom.getName());

//        p1.printDescription();
        tomTheHacker.printDescription();
        employeeTom.printDescription();


        Student maxTheStudent = new Student("Max", LocalDate.parse("2000-07-05"), new ArrayList<>(Arrays.asList("Java", "System Design")), "Lexicon Småland - Växjö");

        maxTheStudent.printDescription();

        Manager mikeTheManager = new Manager("Mike",LocalDate.parse("1990-03-15"),LocalDate.parse("2000-01-10"));
        mikeTheManager.calcSalary();

        mikeTheManager.printDescription();
    }
}