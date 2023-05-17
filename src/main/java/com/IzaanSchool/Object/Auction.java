package com.IzaanSchool.Object;

public class Auction {
    String item,startTime,endTime;

    public static void main(String[] args) {
        System.out.println("Hello");

        Auction auction1=new Auction();
        auction1.item="ANTIQUE WATCH";
        auction1.startTime="12:00pm";
        auction1.endTime= "12:20 PM";

        System.out.println( auction1.item+"\n" +auction1.startTime+"\n"+ auction1.endTime);
    }

}
