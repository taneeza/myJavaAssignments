package com.IzaanSchool.DataType;

import java.util.Scanner;
public class Contact {
    public static void main(String[] args) {
        String name = "Ben";
        String email = " 123@gmail.com ";
        String phoneNumber = "1234567";
        System.out.println("name : " + name + "\n" +
                "Author : " + email + "\n" +
                "Content: " + phoneNumber);
        Scanner sc = new Scanner(System.in);
        System.out.println( " Enter name :");
        String name1= sc.nextLine();

        System.out.println( " Enter email :");
        String email1= sc.nextLine();

        System.out.println( "  Enter Phone Number :");
        String phoneNumber1= sc.nextLine();

        System.out.println("name : " + name1 + "\n" +
                "email : " + email1 + "\n" +
                "phone number: " + phoneNumber1);

    }
}
