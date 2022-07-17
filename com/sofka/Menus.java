package com.sofka;

import java.util.Scanner;

public class Menus {
    public static String scannerText(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int scannerInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static void welcomeMsg() {
        System.out.println("===============================================" +
                "============");
        System.out.println("|              Welcome to Bici - U            " +
                "            |");
        System.out.println("===============================================" +
                "============");

    }

    public static void mainMenu() {

        System.out.println("| 1. Register User                             " +
                "           |");
        System.out.println("| 2. Borrow Bicycle                             " +
                "          |");
        System.out.println("| 3. Return Bicycle                             " +
                "          |");
        System.out.println("| 4. Pay Tickets                             " +
                "             |");
        System.out.println("| 5. Tickets History                             " +
                "         |");
        System.out.println("| 6. Exit                             " +
                "                    |");
        System.out.println("===============================================" +
                "============");
    }

    public static void biciU(){
        int menuChoice = 0;

        do{
            Menus.welcomeMsg();
            Menus.mainMenu();
            menuChoice = scannerInt();
            switch (menuChoice) {
                case 1:
                    Registration.registrationMenu();
                    Registration.askInfo();
                    break;
                case 2:
                    Bycicles.borrowBycicle();

                    break;
                case 3:
                    System.out.println("Option3");
                    break;
                case 4:
                    System.out.println("Option4");
                    break;
                case 5:
                    System.out.println("You can check now the tickets history" +
                            "file created on this directory.");
                    break;
            }


        }while(menuChoice != 6);

    }









}
