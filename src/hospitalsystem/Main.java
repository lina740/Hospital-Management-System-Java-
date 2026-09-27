/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author Asayel
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.FormatterClosedException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

    Scanner scanner = new Scanner(System.in);
    public static ArrayList<Person> personList = new ArrayList<Person>(); 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        Person p = null;
       
        Appointment as = null;
        int size = 0;

        ArrayList<Appointment> AppointmentList = new ArrayList<Appointment>();

        System.out.println(" ****   welcome To central City Hospital  ****");
        Person d1 = new Doctor("sara", 7145637, 24, "Female", "0534266767", 4, 2232, "Suger", 20000, "Brain and Nerv Surgeory");
        Person d2 = new Doctor("Ahmad", 1354675, 25, "male", "0579833543", 5, 2256, "Hearing and Balance", 15000, "Hearingand Balance");
        Person d3 = new Doctor("Omar", 2485990, 27, "male", "0534755543", 9, 2087, "Rays", 12000, "X-ray");
        Person d4 = new Doctor("Leena", 5829431, 24, "Female", "0544237891", 3, 2288, "Eye ", 15000, "Ophthalmologist");
        Person d5 = new Doctor("Asayel", 3825498, 24, "Female", "0578934557", 2, 2221, "Esotericism", 13000, "general and Esotericism ");
        Person d6 = new Doctor("Shahad", 1749365, 24, "Female", "0500678424", 1, 2390, "Children", 16000, "general");
        Person n1 = new Nurse("Nora", 6738291, 35, "Female", "0502333654", 5, 2234, "Emergency", 9000, 5);
        Person n2 = new Nurse("Loaloah", 4352133, 20, "Female", "0552223298", 7, 2166, "Emergency", 9000, 5);

        personList.add(d1);
        personList.add(d2);
        personList.add(d3);
        personList.add(d4);
        personList.add(d5);
        personList.add(d6);
        System.out.println();
        personList.add(n1);
        personList.add(n2);

        System.out.println("please choose one of the following options : ");
        int choice = 0;
        try {
            while (choice != 10) {
                System.out.println("""
                    1- Display Hospital Info
                    2- Fill Patient Information
                    3- Add Appointment
                    4- Chack Appointment
                    5- Cancel Appointment
                    6- Show staff info
                    7- For Salary this option for Staff only !!           
                    8- GUI
                    9- File
                    10- Exit """);
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("______ hopsital info _______");
                        HospitalInfo k = new HospitalInfo();
                        k.printSystem();
                        System.out.println();
                        break;
                    case 2:

                        System.out.println(" __enter information of Patient __");
                        System.out.println("Enter your name :");
                        String n = scanner.next();

                        System.out.println("Enter your ID :");
                        int i = scanner.nextInt();
                        if (i <= 0) {
                            System.out.println("invalid ID");
                        }
                        System.out.println("Entre your Age : ");
                        int x = scanner.nextInt();

                        System.out.println("Enter your gender : ");
                        String y = scanner.next();
                        System.out.println("Enter your phone Number : ");
                        String o = scanner.next();
                        System.out.println("Enter patient  file ID :");
                        int r = scanner.nextInt();
                        System.out.println("Enter your Disease :");
                        String m = scanner.next();
                        System.out.println("how many  appointment you whant ? ");
                        size = scanner.nextInt();
                        System.out.println();
                        p = new Patient(n, i, x, y, o, r, m, size); 

                        System.out.println("Patient has been created ");
                        personList.add(p); 
                       
                        System.out.println(p.toString());
                        System.out.println("--------------------------------");
                        System.out.println();
                        break;

                    case 3:
                        System.out.println("___ add appointment ___");
                        for (int j = 1; j <= size; j++) {

                            System.out.println("Appointment Number " + j);
                            System.out.println("enter the day ");
                            String s = scanner.next();
                            System.out.println("enter time ");
                            double t = scanner.nextDouble();
                            
                            System.out.println("enter appointment Number");
                            int mm = scanner.nextInt();
                            System.out.println(
                                    "choose the Doctors name :\n 1- Dr.Sara \n 2- Dr.Ahmad \n 3-Dr.Omar \n 4-Dr.Leena \n 5-Dr.Asayel \n 6-Dr.Shahd ");
                            System.out.println("enter  your doctor Name");
                            String d = scanner.next();
                            System.out.println("enter true if you finsh or false to cancel");
                            boolean uo = scanner.nextBoolean();
                            if (uo == true) {

                                System.out.println("your appointments has been  creted");
                            } else {
                                System.out.println("invalid appointment !");
                            }
                            as = new Appointment(s, t, mm, d, uo);
                            AppointmentList.add(as);

                        }
                        as.printSystem();

                        System.out.println();
                        break;
                    case 4:
                        System.out.println(" ___ chack Appointment ___");
                        for (Appointment q : AppointmentList) {
                            if (q instanceof Appointment) {
                                q.CheekApoointment();
                            }
                        }
                        
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("___ cancel appointment ___ ");
                        for (Appointment q : AppointmentList) {
                            if (q instanceof Appointment) {
                                q.cancelAppointment();
                            }
                        }
                        System.out.println();
                        break;

                    case 6:
                        System.out.println();
                        for (Person w : personList) {
                            if (w instanceof Staff) {
                                System.out.println(w.toString());

                               
                                System.out.println("__________________________________________________________________________________");
                            }
                        }

                       
                        System.out.println();
                        break;

                    case 7:
                        System.out.println("Staff Salary :");
                        for (Person q : personList) {
                            if (q instanceof Staff) {
                                System.out.println(q);

                                System.out.println("Calculate Salary: " + ((Staff) q).SalaryCalc());
                                System.out.println();
                            }
                        }

                        System.out.println();
                        break;

                    case 8:
                        // GUI

                        GUI.main(args);
                        
                        System.out.println();
                        break;

                    case 9:
                        int option = 0;
                        while (option != 3) {
                            System.out.println("Choose which option do you whant:\n"
                                    + "1- WriteForm File\n"
                                    + "2- Read From File\n"
                                    + "3- Exit From File ");
                            option = scanner.nextInt();
                            switch (option) {

                                case 1:
                                    Write e = new Write();
                                    e.openTextFile("Person.txt");
                                    for (Person j : personList) {
                                        e.writeToFile(j);
                                    }

                                    e.closeFile();
                                    System.out.println("Data has been saved to Petson.txt");
                                    break;

                                case 2:
                                    Read t = new Read();
                                    t.openTextFile("Person.txt");
                                    t.read_File();
                                    t.closeFile();

                                    break;
                                case 3:
                                    System.out.println("Thank you");
                                    System.out.println();
                                    break;

                                default:
                                    System.out.println("Invalid Option!");
                                    System.out.println();
                            }
                        }
                        // file 

                        System.out.println();
                        break;

                    case 10:

                        System.out.println("thank you for using our system , we hope you enjoyed it (: ");
                        System.out.println();
                        break;

                    default:
                        System.out.println(" invalid choice >_< ");
                        System.out.println(" please choose a number from the menu  : ");
                        System.out.println();
                        break;
                }
            }
        } catch (InputMismatchException ex) {
            scanner.next();
            System.err.println("Invalid input!");
        } catch (NullPointerException ex) {
            System.err.println("Invalid object!");
        } catch (ClassCastException ex) {
            System.err.println("Invalid downcasting!");
        }

    }
    
}  //main class

