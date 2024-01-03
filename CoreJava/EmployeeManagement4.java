package com.iss;

import java.util.Scanner;

public class EmployeeManagement4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of employees from the user
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an array to store employee information as strings
        String[] employeeInfoArray = new String[numEmployees];

        // Get employee information from the user and populate the array
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEnter information for Employee #" + (i + 1) + ":");
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter position: ");
            String position = scanner.nextLine();

            // Concatenate employee information as a string and add it to the array
            employeeInfoArray[i] = "Name: " + name + ", Position: " + position;
        }

        // Display all employees in the system
        System.out.println("\nEmployees in the System:");
        for (String employeeInfo : employeeInfoArray) {
            System.out.println(employeeInfo);
        }

        // Find an employee by name and display their information
        System.out.print("\nEnter the name to search for: ");
        String searchName = scanner.nextLine();

        boolean found = false;
        for (String employeeInfo : employeeInfoArray) {
            if (employeeInfo.contains("Name: " + searchName)) {
                System.out.println("\nFound Employee: " + employeeInfo);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nEmployee not found with name: " + searchName);
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
