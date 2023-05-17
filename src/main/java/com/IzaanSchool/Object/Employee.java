package com.IzaanSchool.Object;
// Employee - A class representing an employee with properties like name, designation, and salary.
// Declare the Class Name: Employee
// Declare Class properties:
// Declare Main Method
// Print
// Create an object instance of the class
// Access the object's properties

public class Employee {
    String name,designation;
    int salary;

    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.name= "Johny";
        employee.designation= "QA Engineer";
        employee.salary= 100000;
        System.out.println( employee.name+"\n" + employee.designation+"\n"+ employee.salary);
    }





}
