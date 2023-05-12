package com.IzaanSchool.DataType;// Appointment - A class representing an appointment with properties like date, time, and location.

// Declare the Class Name: Appointment
// Declare Main Method
// Declare variables with appropriate data type for each property mentioned above and also initialize them
// Print all variables declared above
// Declare  boolean variables completed, rescheduled and initializing it with a value
// print the boolean variable
// Using a String concatenation to print the boolean variable
public class Appointment {
    public static void main(String[] args) {
        String date= "07/01/2023";
        String time="3:45 pm";
        String doctorName="john";
        String location=" Sutter health, Mountain View";
        System.out.println("Appointment Date : "+ date + "\n"+
                            "Appointment Time : "+ time +"\n"+
                            "Appointment Location : "+ location);

        boolean completed= true;
        boolean rescheduled= false;
        System.out.println( "Appoinment is completed :" +completed +"\n"
                            +"Appointment is rescheduled :" + rescheduled);

    }
}