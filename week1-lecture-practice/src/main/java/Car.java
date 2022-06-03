/**
 * Car class (BluePrint)
 * Instructions on fields and attributes for a car.
 */

public class Car {

    //fields
    String brand;
    String model;
    int productionYear;
    String regNumber;
    String color;
    String gearbox;
    String ownerName;

    public void printOwner(){
        System.out.println("Owner of the car " + brand + " is " + ownerName);
    }

    //function | method
    public String getInformation(){
        return "Car {" + "Brand: " + brand +" Model: "+ model +" ProductionYear: " + productionYear +
                "  RegNumber: " + regNumber +" Color: " + color + " GearBox " + gearbox + "}";
    }

}
