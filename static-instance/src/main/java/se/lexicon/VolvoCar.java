package se.lexicon;

public class VolvoCar {
    //Static field can be accessed using the class Name ex VolvoCar.Brand
    //Instance Field can be accessed for a specific object ex this.model

    public static String brand = "Volvo"; // Static field
    public String model; // Instance Field
    public String regNumber; // Instance Field

    public String getInformation(){
        return "Brand: " + VolvoCar.brand + " Model: " + this.model + " RegistrationNumber: " + this.regNumber;
    }

}
