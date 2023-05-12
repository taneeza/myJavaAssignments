package com.IzaanSchool.DataType;
// Declare Main Method

// Print Address


// Declaring  boolean variables hasStreetName, hasApartment and initializing it with a value


// print the boolean variable


// Using a String concatenation to print the boolean variable
// System.out.println("Has Apartment:  " + hasApartment);

public class Address {
    public static void main(String[] args) {
        int streetNumber= 1000;
        String streetName= "saratoga avenue";
        String cityName= "London";
        String country= "USA";
        int zipCode= 95050;
        System.out.println("Address:"+"\n" + streetNumber+ "  "+streetName+ "\n" +zipCode +"\n" +country);


        boolean hasStreetName= true;
        boolean hasApartment=false;
        System.out.println("Has Street Name:"+ hasStreetName +"\n"+ "Has Apartment:" +hasApartment);



    }
}
