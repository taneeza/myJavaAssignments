package com.IzaanSchool.DataType;

import java.util.Scanner;

public class Event {
    public static void main(String[] args) {
        String name = " Birthday";
        String date = " 10/20/23 ";
        String location= "444 Saratoga Avenue" ;
        System.out.println("name : " + name+ "\n" +
                "date : " + date + "\n" +
                "location: " + location);
        Scanner sc = new Scanner(System.in);
        System.out.println( " Enter  Event's name :");
        String name1= sc.nextLine();

        System.out.println( " Location :");
        String location1= sc.nextLine();

        System.out.println( "  Date :");
        String date1= sc.nextLine();

        System.out.println("name : " + name1 + "\n" +
                "location: " + location1 + "\n" +
                "date: " + date1);
    }
}
