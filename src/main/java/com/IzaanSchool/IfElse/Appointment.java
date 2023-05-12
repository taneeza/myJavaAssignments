package com.IzaanSchool.IfElse;

public class Appointment {
    public static void main(String[] args) {
        String date = "07/01/2023";
        String time = "3:45 pm";
        String doctorName = "John";
        String location = " Sutter health, Mountain View";
        System.out.println("Appointment Date : " + date + "\n" +
                "Appointment Time : " + time + "\n" +
                "Appointment Location : " + location);
        if (doctorName == "John") {
            System.out.println("My doctor's name is John");
        } else {
            System.out.println("My doctor's name is " + doctorName);
        }

    }
}
