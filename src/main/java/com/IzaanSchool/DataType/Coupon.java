package com.IzaanSchool.DataType;

import java.util.Scanner;

public class Coupon {
    public static void main(String[] args) {
            String code = "899";
            String discountAmount = " 30% ";
            String expirationDate = "12/3/4567";
            System.out.println("discount code : " + code + "\n" +
                    "discount amount: " + discountAmount + "\n" +
                    "Expiration date: " + expirationDate);

            Scanner sc = new Scanner(System.in);
            System.out.println( " discount code :");
            String code1= sc.nextLine();

            System.out.println( " discount amount :");
            String discountAmount1= sc.nextLine();

            System.out.println( "  Expiration date :");
            String expirationDate1= sc.nextLine();

            System.out.println("code : " +  "\n" +
                    "amount : " + discountAmount1 + "\n" +
                    "date: " + expirationDate1);

        }
}
