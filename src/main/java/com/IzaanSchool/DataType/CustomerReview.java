package com.IzaanSchool.DataType;

import java.util.Scanner;

public class CustomerReview {
    public static void main(String[] args) {
        String product = "watch";
        String rating = " 5 stars ";
        String comments = "very good quality";
        System.out.println("product : " + product + "\n" +
                "rating : " + rating + "\n" +
                "Comments: " + comments);
        Scanner sc = new Scanner(System.in);
        System.out.println( " Enter  product name :");
        String productName1= sc.nextLine();

        System.out.println( " Enter rating :");
        String rating1= sc.nextLine();

        System.out.println( "  Enter comments :");
        String comment1= sc.nextLine();

        System.out.println("product name : " + productName1 + "\n" +
                "rating : " + rating1 + "\n" +
                "comments : " + comment1);

    }
}

