package com.IzaanSchool.Object;
// BankAccount - A class representing a bank account with properties like account number, balance, and owner.
// Declare the Class Name: BankAccount
// Declare Class properties:
// Declare Main Method// Print
// Create an object instance of the class // Access the object's properties
public class BankAccount {
    String accountNumber,ownerName;
    int balance;

    public static void main(String[] args) {
        BankAccount bankAccount1=new BankAccount();
        bankAccount1.accountNumber= "12345BXY";
        bankAccount1.ownerName= "taneeza";
        bankAccount1.balance= 100;

        System.out.println(bankAccount1.accountNumber + "  "+ bankAccount1.ownerName + "  " +bankAccount1.balance);

    }


}
