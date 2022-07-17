package com.sofka;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class tickets {


    public static void createTicketsTxt(){
        try {
            File myObj = new File("Tickets.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void createTicketsHistory(){
        try {
            File myObj = new File("TicketsHistory.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void writeTicketHistory(ArrayList ticket){
        try {
            FileWriter myWriter = new FileWriter("TicketsHistory.txt");
            myWriter.write(String.valueOf(ticket));
            myWriter.close();
            System.out.println("Successfully wrote to the DataBase.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void writeTicket(ArrayList ticket){
        try {
            FileWriter myWriter = new FileWriter("Tickets.txt");
            myWriter.write(String.valueOf(ticket));
            myWriter.close();
            System.out.println("Successfully wrote to the DataBase.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
