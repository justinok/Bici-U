package com.sofka;
import com.sun.jdi.IntegerValue;

import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.sofka.Menus.scannerInt;

/**
 * creo que lo mas optimo es hacerlo por ahora con solo arraylist esta parte,
 * solo ahcer el txt para los recibos y eso
 *
 */
public class Registration {

    private static String DNI;
    private static boolean isRegistered = false;
    private static String name;
    private static String surname;
    private static Integer age;
    static int subMenu;
    private static String status = "No tickets";
    private static List<ArrayList<String>> students = new ArrayList<>();
    private static List<ArrayList<String>> teachers = new ArrayList<>();
    static Scanner userData = new Scanner(System.in);
    static ArrayList<String> user = new ArrayList<>();
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
        System.out.println("Please enter your DNI");
        DNI = userData.next();
        for (int i = 0; i < teachers.size(); i++) {
            if((teachers.get(i).get(1) == DNI)){
                isRegistered = true;
            }
        }
        if (isRegistered == false) {
            System.out.println("Please enter your age");
            age = scannerInt();
            if (age > 18) {
                System.out.println("Please enter your name");
                name = userData.next();
                System.out.println("Please enter now your surname");
                surname = userData.next();
                user.add(DNI);
                user.add(name);
                user.add(surname);
                user.add(String.valueOf(age));
                user.add(status);
                System.out.println("Welcome " + name);
                System.out.println("ID: "+ "P-"+ DNI);
                System.out.println("Age: " + age);
                try {
                    FileWriter myWriter = new FileWriter("TeachersUsers.txt");
                    myWriter.write(String.valueOf(user));
                    myWriter.close();
                    System.out.println("Successfully wrote to the DataBase.");
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            } else if (age < 18) {
                System.out.println("Your age is not allowed for this service");

                System.out.println("Are you sure that you are a techer??");

            }



        }
        if (isRegistered == true) {
            System.out.println("You are already registered!");
            wasAlreadyRegistered();

        }
        isRegistered = false;
        teachers.add(user);
        Menus.biciU();
    }
    public static void addStudent () {
        System.out.println("Please enter your DNI");
        DNI = userData.next();
        for (int i = 0; i < students.size(); i++) {
            if((students.get(i).get(1) == DNI)){
                isRegistered = true;
            }
        }
        if (isRegistered == false) {
            System.out.println("Please enter your age");
            age = scannerInt();
            if (age > 18) {
                System.out.println("Please enter your name");
                name = userData.next();
                System.out.println("Please enter now your surname");
                surname = userData.next();
                user.add(DNI);
                user.add(name);
                user.add(surname);
                user.add(String.valueOf(age));
                user.add(status);
                System.out.println("Welcome " + name);
                System.out.println("ID: "+ "S-"+ DNI);
                System.out.println("Age: " + age);

                try {
                    FileWriter myWriter = new FileWriter("StudentsUsers.txt");
                    myWriter.write(String.valueOf(user));
                    myWriter.close();
                    System.out.println("Successfully wrote to the DataBase.");
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            } else if (age < 18) {
                System.out.println("Your age is not allowed for this service");

            }



        }
        if (isRegistered == true) {
            System.out.println("You are already registered!");
            wasAlreadyRegistered();

        }
        isRegistered = false;
        students.add(user);
        Menus.biciU();
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

    public static void askInfo(){
        subMenu = scannerInt();
        switch (subMenu){
            case 1:
                createStudentsUsers();
                addStudent();
                break;
            case 2:
                createTeachersUsers();
                addTeacher();
                break;
        }
    }
}
