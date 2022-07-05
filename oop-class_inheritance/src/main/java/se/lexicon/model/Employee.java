package se.lexicon.model;

import java.time.LocalDate;

// Person is a Super class of Employee
public class Employee extends Person {

    private double salary;
    private LocalDate hiredDate;

    public Employee(String name, LocalDate birthDate, double salary, LocalDate hiredDate) {
        super(name, birthDate);
        this.salary = salary;
        this.hiredDate = hiredDate;
    }

    public final double getSalary() {
        return salary;
    }

    public final void setSalary(double salary) {
        this.salary = salary;
    }

    public final LocalDate getHiredDate() {
        return hiredDate;
    }

    public final void setHiredDate(LocalDate hiredDate) {
        this.hiredDate = hiredDate;
    }
}
