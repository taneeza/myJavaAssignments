package com.IzaanSchool.IfElse;

public class Address {
    public static void main(String[] args) {

        int streetNumber= 1000;
        String streetName= "saratoga avenue";
        String city ="CA";
        boolean hasStreetName = true;
        String country= "USA";
        int zipCode= 95050;
        System.out.println("Address:"+"\n" + streetNumber+ "  "+streetName+ "\n" +zipCode +"\n" +country);


        if(city=="NY"){
            System.out.println("NY is the city name");
        }
        if(city.equals("CA")){
            System.out.println("CA is the city name");
        }
        if(hasStreetName==true){
            System.out.println("the address has street name");
        }
    }
}
