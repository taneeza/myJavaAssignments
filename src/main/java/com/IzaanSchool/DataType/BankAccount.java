package com.IzaanSchool.DataType;

public class BankAccount {
    public static void main(String[] args) {
        long accNumber=1234567890;
        long accBalance= 500000000;
        String owner=" Brad Pitt";
        System.out.println("Account Number : "+ accNumber + "\n"+
                "Account Balance : "+ accBalance +"\n"+
                "Name of Ownner : "+ owner);

        boolean isActive= true;
        boolean isClosed= false;
        System.out.println( "Account is active :" +isActive +"\n"
                +"Account is closed:" + isClosed);

    }

}
