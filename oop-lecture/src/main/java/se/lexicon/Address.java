package se.lexicon;

public class Address {
    private String streetName;
    private String zipcode; //Not doing any calculations with it so String is okey.
    private String city;
    private String country;

    public Address(String streetName, String zipcode, String city, String country){
        this.streetName = streetName;
        this.zipcode = zipcode;
        this.city = city;
        this.country = country;
    }


}
