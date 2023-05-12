package com.IzaanSchool.DataType;// Declare Main Method
// Declare variables with appropriate data type for each property mentioned above and also initilize them
// String title = "IzaanSchool";
// Print all variables declared above
// Declare  boolean variables isSponsored, isFeatured and initializing it with a value
// print the boolean variable
// Using a String concatenation to print the boolean variable
// Advertisement - A class representing an advertisement with properties like title, description, and target audience.


public class Advertisement {
    public static void main(String[] args) {
        String title="Izaan School";
        String description= " Izaan school offers QA course.";
        String targetAudience= "Student";

        boolean isSponsored= false;
        boolean isFeatured= true;
        System.out.println(title + "\n" +description+ "\n"+ targetAudience);
        System.out.println(isSponsored);
        System.out.println(isFeatured);
        System.out.println("title: "+ title+ "\n"+"is it sponsored? "+ isSponsored +"\n"+" is it featured  "+ isFeatured);


    }
}
