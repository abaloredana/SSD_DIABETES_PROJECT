/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diabetes.project;

/**
 *
 * @author loredana
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DiabetesInterface {

    public static Set<Patient> patients = new HashSet<>();
    private static Scanner scanner = new Scanner(System.in);
public static Set<Patient> menu(){
        
        while (true) {
            System.out.println("\nDiabetes Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. List Patients and Treatments");
            System.out.println("3. Continue to evaluation.");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addNewPatient(scanner);
                    break;
                case 2:
                    listPatients();
                    break;
                case 3:
                    System.out.println("Continuing to evaluation...");
                    //System.exit(0);
                    return patients;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
}
    

private static Set<Patient> addNewPatient(Scanner scanner) {
    System.out.println("Adding a new patient...");

    System.out.println("Enter patient name:");
    String name = scanner.nextLine();

    int typeOfDiabetes;
    do {
        System.out.println("Enter type of diabetes (1 for Type 1, 2 for Type 2):");
        typeOfDiabetes = scanner.nextInt();
        if (typeOfDiabetes < 1 || typeOfDiabetes > 2) {
            System.out.println("Invalid input. Please enter 1 for Type 1 or 2 for Type 2 diabetes.");
        }
    } while (typeOfDiabetes < 1 || typeOfDiabetes > 2);

    System.out.println("Enter BMI:");
    double bmi = scanner.nextDouble();

    System.out.println("Enter age:");
    int age = scanner.nextInt();

    int insulinProd;
    do {
        System.out.println("Enter insulin production (1=NO PROD, 2=HYPO, 3=NORMAL, 4=HYPER):");
        insulinProd = scanner.nextInt();
        if (insulinProd < 1 || insulinProd > 4) {
            System.out.println("Invalid input. Please enter a number between 1 and 4.");
        }
    } while (insulinProd < 1 || insulinProd > 4);

    scanner.nextLine(); // consume newline after reading number

    boolean insulinRes = promptYesNo("Is insulin resistant? (y/n):");
    boolean hypotension = promptYesNo("Has hypotension? (y/n):");
    boolean dyslipidemia = promptYesNo("Has dyslipidemia? (y/n):");
    boolean pad = promptYesNo("Has peripheral artery disease (PAD)? (y/n):");
    boolean nafld = promptYesNo("Has non-alcoholic fatty liver disease (NAFLD)? (y/n):");
    boolean osteoporosis = promptYesNo("Has osteoporosis? (y/n):");

    // Creating the patient object
    Patient patient = new Patient(name, typeOfDiabetes, bmi, age, insulinProd, insulinRes, hypotension, dyslipidemia, pad, nafld, osteoporosis);
    patients.add(patient);

    System.out.println("Patient added successfully.");
return patients;   
}

private static boolean promptYesNo(String message) {
    String input;
    do {
        System.out.print(message);
        input = scanner.nextLine().trim().toLowerCase();
        if (!input.equals("y") && !input.equals("n")) {
            System.out.println("Invalid input. Please enter 'y' for yes or 'n' for no.");
        }
    } while (!input.equals("y") && !input.equals("n"));
    return input.equals("y");
}


    private static void addTreatmentToPatient(Scanner scanner) {
        System.out.print("Enter patient's name to add treatment: ");
        String name = scanner.nextLine();
        for (Patient patient : patients) {
            if (patient.getName().equalsIgnoreCase(name)) {
                System.out.print("Enter treatment name: ");
                String treatmentName = scanner.nextLine();
                System.out.print("Should the treatment be applied? (true/false): ");
                boolean shouldBeApplied = scanner.nextBoolean();
                System.out.print("Enter treatment priority: ");
                double priority = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                Treatment treatment = new Treatment(treatmentName, shouldBeApplied, priority);
                patient.addTreatment(treatment);
                System.out.println("Treatment added successfully to " + name);
                return;
            }
        }
        System.out.println("Patient not found.");
    }

    private static void listPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients in the system.");
            return;
        }
        for (Patient patient : patients) {
            System.out.println("\nPatient: " + patient.getName());
            if (patient.treatments.isEmpty()) {
                System.out.println("No treatments assigned.");
                continue;
            }
            for ( Treatment treatment : patient.treatments) {
                System.out.println(treatment);
            }
        }
    }

}

