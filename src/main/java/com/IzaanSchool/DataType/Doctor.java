package com.IzaanSchool.DataType;

import java.util.Scanner;

public class Doctor {
    public static void main(String[] args) {
        String name = " tamara";
        String specialization = " ENT ";
        String contactInformation = "phn number: 123-345-3745";
        System.out.println("name : " + name + "\n" +
                "specialization : " + specialization + "\n" +
                "Contact Information: " + contactInformation);
        Scanner sc = new Scanner(System.in);
        System.out.println( " Enter  doctor's name :");
        String doctorName1= sc.nextLine();

        System.out.println( " specialization :");
        String specialization1= sc.nextLine();

        System.out.println( "  contact information :");
        String contact1= sc.nextLine();

        System.out.println("name : " + doctorName1 + "\n" +
                "specialization : " + specialization1 + "\n" +
                "Contact Information: " + contact1);
    }
}

