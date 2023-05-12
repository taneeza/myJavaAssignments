package com.IzaanSchool.IfElse;

public class Auction {
    public static void main(String[] args) {
        String item = "Laptop";
        String startTime = "3:45 pm";
        String endTime = " 4:45 pm";
        System.out.println("item name : " + item + "\n" +
                "start Time : " + startTime + "\n" +
                "end time : " + endTime);

        if(item=="Laptop"){
            System.out.println("Yes, this is laptop");
        }
        else{
            System.out.println("yes, this is "+ item);
        }

    }
}
