package com.sofka;

import java.util.ArrayList;
import java.util.List;

public class Bycicles {

    private static List<ArrayList<String>> mountain = new ArrayList<>();
    private static List<ArrayList<String>> road = new ArrayList<>();

    public static void creationOfInventory(){
        ArrayList<String> mbic1 = new ArrayList<>();
        ArrayList<String> mbic2 = new ArrayList<>();
        ArrayList<String> mbic3 = new ArrayList<>();
        ArrayList<String> rbic1 = new ArrayList<>();
        ArrayList<String> rbic2 = new ArrayList<>();
        ArrayList<String> rbic3 = new ArrayList<>();

        mbic1.add("BIC-01");
        mbic1.add("Mountain");
        mbic1.add("Green");
        mbic1.add("Aviable");

        mbic2.add("BIC-02");
        mbic2.add("Mountain");
        mbic2.add("Red");
        mbic2.add("Aviable");

        mbic3.add("BIC-03");
        mbic3.add("Mountain");
        mbic3.add("Black");
        mbic2.add("Aviable");

        rbic1.add("BIC-01");
        rbic1.add("Mountain");
        rbic1.add("Green");
        rbic1.add("Aviable");

        rbic2.add("BIC-02");
        rbic2.add("Mountain");
        rbic2.add("Red");
        rbic2.add("Aviable");

        rbic3.add("BIC-03");
        rbic3.add("Mountain");
        rbic3.add("Black");
        rbic3.add("Aviable");

        mountain.add(mbic1);
        mountain.add(mbic2);
        mountain.add(mbic3);
        road.add(rbic1);
        road.add(rbic2);
        road.add(rbic3);
    }

    public static void borrowBycicle(){
        if(Registration.checkDebt()){
            System.out.println("You have an active debt please cancel it and" +
                    "try again");
        }
        if(!Registration.checkDebt()){
            System.out.println("You are fine");
        }

    }



}
