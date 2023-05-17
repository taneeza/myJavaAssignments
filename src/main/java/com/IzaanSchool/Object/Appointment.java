package com.IzaanSchool.Object;
// Appointment - A class representing an appointment with properties like date, time, and location.

// Declare the Class Name: Appointment
// Declare Class properties:

// Declare Main Method

// Print


// Create an object instance of the class

// Access the object's properties

public class Appointment {
     private String date,time,location;

    public static void main(String[] args) {

        System.out.println("Hello");

        Appointment appointment1=new Appointment();
        appointment1.date="31/12/1979";
        appointment1.time="12:00pm";
        appointment1.location= "San jose";

        System.out.println( appointment1.date+"\n" +appointment1.time+"\n"+ appointment1.location);
    }
}
