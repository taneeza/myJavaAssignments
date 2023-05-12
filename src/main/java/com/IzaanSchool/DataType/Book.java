package com.IzaanSchool.DataType;

import java.util.Scanner;
public class Book {
    public static void main(String[] args) {
        String title = "Barak Obama vs Donald Trump";
        String author = "Michelle Obama, Melania Trump";
        String ISBN = " 978-3-16-148 ";
        System.out.println("Title : " + title + "\n" +
                "Author : " + author + "\n" +
                "ISBN: " + ISBN);
        Scanner myObj= new Scanner(System.in);

        System.out.println(" Book Title :");
        String bookTitle= myObj.next();

        System.out.println("Author's name: ");
        String authorName=myObj.next();

        System.out.println("ISBN");
        int bookISBN= myObj.nextInt();

        myObj.close();

        System.out.println("BOOK:" + "\n"+ bookTitle +"\n" + authorName +"\n"+ bookISBN);


    }

}
