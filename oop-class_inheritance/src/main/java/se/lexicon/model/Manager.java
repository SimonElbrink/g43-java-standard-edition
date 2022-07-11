package se.lexicon.model;

import java.time.LocalDate;

public class Manager extends Employee{

    public final double BASE_MANAGER_BONUS = 5000;
    private double bonus;

    public Manager(String name, LocalDate birthDate, LocalDate hiredDate, int bonus) {
        super(name, birthDate, hiredDate);
        this.bonus = bonus;
    }

    public Manager(String name, LocalDate birthDate, LocalDate hiredDate) {
        super(name, birthDate, hiredDate);
        setBonus(BASE_MANAGER_BONUS);
    }

    @Override
    public void calcSalary() {
        setSalary(BASE_SALARY + bonus);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printDescription() {

        System.out.println(
                 "Manager " +
                        getName() + " has the salary " + getSalary() +
                         " was hired year " + getHiredDate().getYear()
        );
    }


}
