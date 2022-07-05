package se.lexicon.model;

import java.time.LocalDate;
import java.util.Arrays;

//Programmer class can not be extended. this Final. So no specialized programmers...
public final class Programmer extends Employee{

    private String[] languages;
    private String[] certificates;

    public Programmer(String name, LocalDate birthDate, double salary, LocalDate hiredDate, String[] languages, String[] certificates) {
        super(name, birthDate, salary, hiredDate);
        this.languages = languages;
        this.certificates = certificates;
    }

    @Override // Optional - shows your intention of overriding. If violated you will get a compile error.
    public void printDescription(){
        System.out.println("Prints Programmer information: " + getName() + " has salary of " + getSalary() +
                ". Also has certificates: " + Arrays.toString(certificates));
    }



    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    //Can't Override a final method
//    public double getSalary(){
//        return 10.8;
//    }

    @Override
    public String toString() {
        return "Programmer{" +
                "languages=" + Arrays.toString(languages) +
                ", certificates=" + Arrays.toString(certificates) +
                '}';
    }
}
