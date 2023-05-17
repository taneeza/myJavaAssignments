package com.IzaanSchool.Object;
// Magazine - A class representing a magazine with properties like title, editor, and articles.
// Declare the Class Name: Magazine
// Declare Class properties:
// Declare Main Method
// Print
// Create an object instance of the class
// Access the object's properties
public class Magazine {
    String name, editor,article;
    public static void main(String[] args) {
        Magazine magazine1= new Magazine();

        magazine1.name=" book review";
        magazine1.editor=" jack dulson";
        magazine1.article=" titanic";

        System.out.println( magazine1.name+"\n" + magazine1.editor+"\n"+ magazine1.article);
    }
}
