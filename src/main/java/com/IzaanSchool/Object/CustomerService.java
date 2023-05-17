package com.IzaanSchool.Object;
// CustomerService - A class representing customer service with properties like name, phone
// number, and email.
// Declare the Class Name: CustomerService
// Declare Class properties:
// Declare Main Method
// Print
// Create an object instance of the class
// Access the object's properties

public class CustomerService {

    String name, phoneNumber, email;

    public static void main(String[] args) {
        CustomerService customerService1= new CustomerService();

        customerService1.name=" Allen";
        customerService1.email="allent@123.com";
        customerService1.phoneNumber="777-777-7777";

        System.out.println( customerService1.name+"\n" + customerService1.email+"\n"+ customerService1.phoneNumber);
    }



}
