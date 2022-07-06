package se.lexicon.model;

import java.time.LocalDate;

//Person Is a Class, subclass of Object.
public abstract class Person extends Object{ // extends Object is Redundant, already there.

    private String name;
    private LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        super(); //Optional not needed.
        this.name = name;
        this.birthDate = birthDate;
    }

    public abstract void printDescription();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
