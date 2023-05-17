package com.IzaanSchool.Object;
// UserProfile - A class representing a user profile with properties like name, email, and password.
// Declare the Class Name: UserProfile
// Declare Class properties:

// Declare Main Method

// Print


// Create an object instance of the class

// Access the object's properties

public class UserProfile {
    String name, email, passWord;

    public static void main(String[] args) {
        UserProfile userProfile1= new UserProfile();

        userProfile1.name=" Allen";
        userProfile1.email="allent@123.com";
        userProfile1.passWord="777-777-7777";

        System.out.println( userProfile1.name+"\n" + userProfile1.email+"\n"+ userProfile1.passWord);
    }

}
