package com.IzaanSchool.Object;

public class Charity {
    String name,mission,donation;

    public static void main(String[] args) {
        System.out.println("Hello");

        Charity charity1= new Charity();
        charity1.name= "child care";
        charity1.mission="provide health care for all children";
        charity1.donation= "100K";

        System.out.println( charity1.name+"\n" + charity1.mission+"\n"+ charity1.donation);
    }
}
