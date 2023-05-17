package com.IzaanSchool.Object;
// Advertisement - A class representing an advertisement with properties like title, description, and target audience.
// Declare the Class Name: Advertisement
// Declare Class properties:
// Declare Main Method
// Print
// Create an object instance of the class
// Access the object's properties
public class Advertisement {
    private String title;
    private String description;

    public static void main(String[] args) {
        System.out.println("Hello from advertisement Class");
        Advertisement advertisement1= new Advertisement();

        advertisement1.title= "Steak House";
        advertisement1.description= "T-bone steak from black angus cow";

        System.out.println( "title :"+advertisement1.title + "\n"+
                            "description :"+ advertisement1.description);
    }

}
