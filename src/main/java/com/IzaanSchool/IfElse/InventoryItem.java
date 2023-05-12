package com.IzaanSchool.IfElse;

public class InventoryItem {
    public static void main(String[] args) {
        String name = "plant";
        int quantity = 5;
        String location = "nursery";

        if (quantity < 10) {
            System.out.println("Inventory Items  has to be less  than 10!");
        }
        else {
            System.out.println("Inventory Items are now : " + quantity);
        }
    }
}