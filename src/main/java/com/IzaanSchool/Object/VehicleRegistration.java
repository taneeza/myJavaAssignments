package com.IzaanSchool.Object;

public class VehicleRegistration {
    String owner, vehicleDetails, expdate;

    public static void main(String[] args) {
        VehicleRegistration vehicleRegistration1=new VehicleRegistration();
        vehicleRegistration1.owner="salam";
        vehicleRegistration1.vehicleDetails= "Toyota tacoma Truck";
        vehicleRegistration1.expdate ="12/31/2024";

        System.out.println( vehicleRegistration1.owner+"\n" + vehicleRegistration1.vehicleDetails+
                "\n"+ vehicleRegistration1.expdate);


    }
}
