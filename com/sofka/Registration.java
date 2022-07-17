package com.sofka;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * creo que lo mas optimo es hacerlo por ahora con solo arraylist esta parte,
 * solo ahcer el txt para los recibos y eso
 *
 */
public class Registration {

    private static String DNI;
    private static boolean isRegistered = false;
    private String name;
    private String surname;
    static String firstLevelOptions;
    private static List<ArrayList<String>> students = new ArrayList<>();
    private static List<ArrayList<String>> teachers = new ArrayList<>();
    static Scanner userData = new Scanner(System.in);
    public static void createStudentsUsers(){
        try {
            File myObj = new File("StudentsUsers.txt");
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

    

    public static void addTeacher () {
        DNI = userData.next();
        for (int i = 0; i < teachers.size(); i++) {
            if((teachers.get(i).get(1) == DNI)){
                isRegistered = true;
            }
        }
        if (isRegistered == false) {
            System.out.println("You are already registered!");
            wasAlreadyRegistered();
            //----------------------------------
            //go back to the main menu
            //---------------------------------

        }
        if (isRegistered == true) {
            System.out.println("You are already registered!");
            wasAlreadyRegistered();
            //----------------------------------
            //go back to the main menu
            //---------------------------------

        }
        //verificar que no existe el registro previamente
        //si no existe  recopilar toda la info y guardarlo en array list y la hoja de texto,
        //
    }

    public static void wasAlreadyRegistered(){
        isRegistered = false;

    }

    public static void createTeachersUsers(){
        try {
            File myObj = new File("TeachersUsers.txt");
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

    public static void registrationMenu() {
        System.out.println("===============================================" +
                "============");
        System.out.println("|              Select your corresponding option " +
                "          |");
        System.out.println("| 1. If you are a Student                       " +
                "          |");
        System.out.println("| 2. If your are a Profesor                     " +
                "          |");
        System.out.println("===============================================" +
                "============");
    }
    //if student save if techer save T
    public static void askInfo(){
        System.out.println("please enter your DNI");
        //user input

    }
}
