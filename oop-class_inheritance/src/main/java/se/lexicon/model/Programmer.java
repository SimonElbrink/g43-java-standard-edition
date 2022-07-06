package se.lexicon.model;

import java.time.LocalDate;
import java.util.Arrays;

//Programmer class can not be extended. this Final. So no specialized programmers...
public final class Programmer extends Employee{

    public static final double LANGUAGE_BONUS = 1_500;
    public static final double CERTIFICATE_BONUS = 3_000;

    private String[] languages;
    private String[] certificates;

    public Programmer(String name, LocalDate birthDate, LocalDate hiredDate, String[] languages, String[] certificates) {
        super(name, birthDate, hiredDate);
        this.languages = languages;
        this.certificates = certificates;
        calcSalary();
    }

    @Override // Optional - shows your intention of overriding. If violated you will get a compile error.
    public void printDescription(){
        System.out.println("Prints Programmer information: " + getName() + " has salary of " + getSalary() +
                ". Also has certificates: " + Arrays.toString(certificates));
    }

    @Override
    public void calcSalary() {
        double programmerSalary = BASE_SALARY;

        double languageBonus = languages.length * LANGUAGE_BONUS;

        double certificateBonus = certificates.length * CERTIFICATE_BONUS;

        programmerSalary += languageBonus;
        programmerSalary += certificateBonus;

        setSalary(programmerSalary);
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
