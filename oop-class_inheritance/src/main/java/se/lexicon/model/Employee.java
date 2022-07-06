package se.lexicon.model;

import java.time.LocalDate;

// Person is a Super class of Employee
public abstract class Employee extends Person {

    public static final double BASE_SALARY = 25_000;
    private double salary;
    private LocalDate hiredDate;

    public Employee(String name, LocalDate birthDate, LocalDate hiredDate) {
        super(name, birthDate);
        this.hiredDate = hiredDate;
    }

    public abstract void calcSalary();


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

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", hiredDate=" + hiredDate +
                '}';
    }
}
