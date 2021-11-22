package cli;

import database.PatientDatabaseCloud;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Scanner;

public class AddPatient extends Simulation {

    public static void main(String[] args) throws SQLException, InvocationTargetException, IllegalAccessException {
        home();
    }

    public static void Add_Patient(){
        PatientDatabaseCloud database = new PatientDatabaseCloud();
        final String Name, Address, Sex, symptom_1, symptom_2, symptom_3;
        final int age, health;
        final boolean insurance;
        Scanner option = new Scanner(System.in);
        System.out.println("Enter Name:");
        Name = option.nextLine();
        System.out.println("Enter Address:");
        Address = option.nextLine();
        System.out.println("Enter Sex:");
        Sex = option.nextLine();
        System.out.println("Enter Age:");
        age = option.nextInt();
        System.out.println("Enter Health:");
        health = option.nextInt();
        System.out.println("Does the Patient have Insurance(y/n):");
        String select = option.next();
        insurance = select.equals("y");
        System.out.println("Enter Symptom 1:");
        symptom_1 = option.nextLine();
        System.out.println("Enter Symptom 2:");
        symptom_2 = option.nextLine();
        System.out.println("Enter Symptom 3:");
        symptom_3 = option.nextLine();
        database.writeData(Name, Address, Sex, age, health, insurance, symptom_1, symptom_2, symptom_3);

    }
}
