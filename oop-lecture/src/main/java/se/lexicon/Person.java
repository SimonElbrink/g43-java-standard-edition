package se.lexicon;

public class Person {

    //Instance fields
    private String name; //default value = null
    private int age; // default value = 0
    private String gender; // default value = null
    private boolean sleeping; // default value = false
    private Address address; // A Relationship

    public Person(String name, int age, String gender, boolean sleeping){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.sleeping = sleeping;
    }

    public Person(String name, int age){
        this(); // Chaining and looking for a constructor with matching parameters.
        this.name = name;
        this.age = age;

    }

    //custom default values
    public Person(){
        this.name = "UNKNOWN_NAME";
        this.age = 0;
        setGender("NOT_SPECIFIED");
        this.sleeping = false;
    }

    public String getInformation(){
        return "name: " + name + " age: " + age + " gender: "+ gender + " isSleeping: " + sleeping;
    }



    //Getter & Setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    /**
     * Null gender is not allowed.
     * @param gender
     */

    public void setGender(String gender) {

        if (gender != null){
            this.gender = gender;
        }else {
            System.out.println("Gender: "+ gender + " Not Allowed");
        }

        if(this.gender == null){
            this.gender = "NOT_SPECIFIED";
        }

    }

    public boolean isSleeping() {
        return sleeping;
    }

    public void setSleeping(boolean sleeping) {
        this.sleeping = sleeping;
    }

    public Address getAddress(){
        return address;
    }

    public void setAddress(Address address){
        this.address = address;
    }








}
