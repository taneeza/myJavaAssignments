package com.IzaanSchool.DataType;

import java.util.Scanner;
public class Comment {
    public static void main(String[] args) {
        String author = "Michelle Obama, Melania Trump";
        String content = " Who has better hair style? Obama or Trump? ";
        String date = "12/12/23";
        System.out.println("Date : " + date + "\n" +
                "Author : " + author + "\n" +
                "Content: " + content);

        Scanner sc= new Scanner(System.in);
        System.out.println( "Author");
        String author1= sc.nextLine();

        System.out.println( "content");
        String content1= sc.nextLine();

        System.out.println( "date");
        String date1= sc.nextLine();

        System.out.println("Date : " + date1 + "\n" +
                "Author : " + author1 + "\n" +
                "Content: " + content1);


    }

}
