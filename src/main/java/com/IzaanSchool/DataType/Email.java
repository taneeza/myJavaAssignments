package com.IzaanSchool.DataType;
import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        String sender="Ben";
        String recipient="Holy";
        String subject="Greetings";
        String body="Hi Holy, come to visit us in elf's kingdom.";
        System.out.println("name : " + sender+ "\n" +
                "Recipients : " + recipient + "\n" +
                "Subject: " + subject +"\n"+ "body :"+body);

        Scanner sc=new Scanner(System.in);

        System.out.println("sender");
        String sender1= sc.nextLine();

        System.out.println("recipients");
        String recipient1= sc.nextLine();

        System.out.println("subject");
        String subject1= sc.nextLine();

        System.out.println("Body");
        String body1= sc.nextLine();

        System.out.println("name : " + sender1+ "\n" +
                "Recipients : " + recipient1 + "\n" +
                "Subject: " + subject1 +"\n"+"body:"+body1);




    }
}
