package com.IzaanSchool.DataType;

import java.util.Scanner;

public class Donation {
    public static void main(String[] args) {
        String donorName = " tamara";
        String donationDate = " 12/12/23 ";
        long donationAmount= 123456677 ;
        System.out.println("name : " + donorName+ "\n" +
                "date : " + donationDate + "\n" +
                "amount: " + donationAmount);
        Scanner sc = new Scanner(System.in);
        System.out.println( " Enter  donor's name :");
        String name1= sc.nextLine();

        System.out.println( " date :");
        String date1= sc.nextLine();

        System.out.println( "  donation :");
        String donation1= sc.nextLine();

        System.out.println("name : " + name1 + "\n" +
                "date : " + date1 + "\n" +
                "amount: " + donation1);
    }
    }

