package se.lexicon.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Student extends Person{

    private ArrayList<String> courses;
    private String schoolName;


    public Student(String name, LocalDate birthDate, ArrayList<String> courses, String schoolName) {
        super(name, birthDate);
        this.courses = courses;
        this.schoolName = schoolName;
    }

    public Student(String name, LocalDate birthDate, String schoolName) {
        super(name, birthDate);
        this.schoolName = schoolName;
        this.courses = new ArrayList<>();
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public void printDescription() {

        System.out.println(
                "Student " +
                        getName() + " studies " + getCourses().toString() +
                        " at " + getSchoolName()
        );

    }
}
