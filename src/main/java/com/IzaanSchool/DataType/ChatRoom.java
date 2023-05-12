package com.IzaanSchool.DataType;

import java.util.Scanner;
public class ChatRoom {
    public static void main(String[] args) {
        String name= "discussion";
        String participants= "Ben, Julie, Ema,John";
        String messages= "Hello there!";

        System.out.println("name: "+name+ "\n"+ "Participants :"+participants +"\n"+
                            "meassage :"+messages);

    Scanner sc= new Scanner(System.in);
        System.out.println("Name Of Chatroom :");
        String nameOFChatRoom= sc.nextLine();

        System.out.println( "Name of Participant no 1: ");
        String participant_1= sc.nextLine();

        System.out.println( "Name of Participant no 2: ");
        String participant_2= sc.nextLine();

        System.out.println( "Name of Participant no 3: ");
        String participant_3= sc.nextLine();

        System.out.println( "messages to everybody: ");
        String mssgs= sc.nextLine();

        sc.close();


        System.out.println( nameOFChatRoom +"\n"
                            + participant_1 +","+participant_2+","+participant_3+"\n"+ mssgs);




    }

}
