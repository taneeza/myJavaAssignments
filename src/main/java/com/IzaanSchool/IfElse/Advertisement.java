package com.IzaanSchool.IfElse;

public class Advertisement {
    public static void main(String[] args) {

        String title="Izaan School";
        String description= " Izaan school offers QA course.";
        String targetAudience= "Student";
        System.out.println(title + "\n" +description+ "\n"+ targetAudience);


        if(targetAudience=="Student"){
            System.out.println( "Students are the  targeted audience for this Advertisement");
        }

        else{
            System.out.println("Students are not the  targeted audience for this Advertisement");
        }
    }
}
