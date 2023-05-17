package com.IzaanSchool.Object;

public class FundRaiser {
    String cause, goal, donation;

    public static void main(String[] args) {
        FundRaiser fundRaiser=new FundRaiser();
        fundRaiser.cause=" foold victim ";
        fundRaiser.goal="200K";
        fundRaiser.donation="1k";
        System.out.println( fundRaiser.cause+ fundRaiser.donation+ fundRaiser.goal);
    }
}
