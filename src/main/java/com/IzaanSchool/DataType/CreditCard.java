package com.IzaanSchool.DataType;

import java.util.Date;
import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {


        String cardNumber = "12345";
        String cardHolderName = " Badam";
        Date expdate = new Date();
        System.out.println( "card Number"+ cardNumber+"\n"+"card holder : " + cardHolderName+"\n"+"date:"+expdate);

        Scanner sc = new Scanner(System.in);
        System.out.println( " Enter card number :");
        String number1= sc.nextLine();

        System.out.println( " card holder :");
        String cardHolder1= sc.nextLine();

        System.out.println( "  Date :");
        String date1= sc.nextLine();

        System.out.println( "card Number"+number1+"\n"+"card holder : " + cardHolder1+"\n"+"date:"+date1);


}

}
