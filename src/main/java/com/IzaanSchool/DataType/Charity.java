package com.IzaanSchool.DataType;

import java.util.Scanner;
public class Charity {
    public static void main(String[] args) {
        String name = "Women's Health";
        String mission = "Taking care of physical and mental health of expecting mothers and new mothers.";
        int donation = 10000;
        System.out.println("Name : " + name + "\n" +
                "Mission : " + mission + "\n" +
                "Donation Amount: " + donation);

        Scanner myCharity=new Scanner(System.in);
        System.out.println("Name");
        String charityName= myCharity.next();

        System.out.println("Mission:");
        String charityMission= myCharity.next();

        System.out.println("donation Amount");
        int myDonation= myCharity.nextInt();

        System.out.println(" Charity Name : " + charityName + "\n" +
                "charity Mission : " + charityMission + "\n" +
                "Donation Amount: " + myDonation);
    }

}
