package com.sofka;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.sofka.Menus.scannerText;
import static com.sofka.Registration.getDNI;
import static com.sofka.Registration.getName;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class Bycicles {

    private static List<ArrayList<String>> mountain = new ArrayList<>();
    private static List<ArrayList<String>> road = new ArrayList<>();
    static ArrayList<String> tickets = new ArrayList<>();
    private static Integer ticket = 0;
    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    static LocalDateTime now = LocalDateTime.now();

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
        String mor;
        if(Registration.checkDebt()){
            System.out.println("You have an active debt please cancel it and" +
                    "try again");
        }
        if(!Registration.checkDebt()){
            System.out.println("Choose the Type of your bycicle Mountain " +
                    "or Road (M/R)");
            mor = scannerText();
            switch (mor){
                case "M":
                    mountainTicket();
                    break;
            }

        }

    }

    private static void mountainTicket(){
        System.out.println("Bycicle Selected!");
        System.out.println("Code: " + mountain.get(1).get(1));
        System.out.println("Type: " + mountain.get(1).get(2));
        System.out.println("Color: " + mountain.get(1).get(3));
        System.out.println("A ticket was generated!");
        ticket += 1;
        tickets.add(String.valueOf(ticket));
        tickets.add("Bycicle: " + mountain.get(1).get(1));
        tickets.add("User: " + getDNI());
        tickets.add("Name: " + getName());
        tickets.add("Date: " + dtf.format(now));
        tickets.add("Have helmet: True");
        tickets.add("Good condition: True");
        tickets.add("Status: Active");
        com.sofka.tickets.writeTicket(tickets);
    }

    private static void roadTicket(){
        System.out.println("Bycicle Selected!");
        System.out.println("Code: " + road.get(1).get(1));
        System.out.println("Type: " + road.get(1).get(2));
        System.out.println("Color: " + road.get(1).get(3));
        System.out.println("A ticket was generated!");
        ticket += 1;
        tickets.add(String.valueOf(ticket));
        tickets.add("Bycicle: " + road.get(1).get(1));
        tickets.add("User: " + getDNI());
        tickets.add("Name: " + getName());
        tickets.add("Date: " + dtf.format(now));
        tickets.add("Have helmet: True");
        tickets.add("Good condition: True");
        tickets.add("Status: Active");
        com.sofka.tickets.writeTicket(tickets);
        
    }



}
