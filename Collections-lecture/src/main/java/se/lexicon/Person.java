package se.lexicon;

import java.time.LocalDate;
import java.util.Objects;

public class Person {


    private String ssn;
    private String name;
    private String email;
    private LocalDate birthdate;

    public Person(String ssn, String name, String email, LocalDate birthdate) {
        this.ssn = ssn;
        this.name = name;
        this.email = email;
        this.birthdate = birthdate;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(ssn, person.ssn) && Objects.equals(name, person.name) && Objects.equals(email, person.email) && Objects.equals(birthdate, person.birthdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssn, name, email, birthdate);
    }

    @Override
    public String toString() {
        return "Person{" +
                "ssn='" + ssn + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
