package com.IzaanSchool.IfElse;

public class BankAccount {
    public static void main(String[] args) {
        long accNumber = 2345;
        long accBalance = 500000000;
        String owner = " Brad Pitt";
        System.out.println("Account Number : " + accNumber + "\n" +
                "Account Balance : " + accBalance + "\n" +
                "Name of Ownner : " + owner);

        if (accNumber == 234) {
            System.out.println("Account is active");
        } else {
            System.out.println("Account is not active");
        }
    }
}
