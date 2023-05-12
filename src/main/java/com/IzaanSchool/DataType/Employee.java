package com.IzaanSchool.DataType;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        String name = " tamara";
        String designation = " tech lead ";
        long salary= 500000 ;
        System.out.println("name : " +name + "\n" +
                "designation : " + designation + "\n" +
                "salary: " + salary);
        Scanner sc = new Scanner(System.in);
        System.out.println( " name :");
        String name1= sc.nextLine();

        System.out.println( " designation :");
        String designation1= sc.nextLine();

        System.out.println( "  salary :");
        String salary1= sc.nextLine();

        System.out.println("name : " + name1 + "\n" +
                "designation : " + designation1 + "\n" +
                "salary: " + salary1);
    }
}
