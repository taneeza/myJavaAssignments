package com.IzaanSchool.IfElse;

public class Coupon {
    public static void main(String[] args) {
        String code = "899";
        String discountAmount = " 30% ";
        String expirationDate = "12/3/4567";
        System.out.println("discount code : " + code + "\n" +
                "discount amount: " + discountAmount + "\n" +
                "Expiration date: " + expirationDate);

       if(code=="899"){
           System.out.println("this code is working");
       }
    }
}
