package com.iss;

import java.util.*;

// class definition
public class ControlStatements3 {

    public static void main(String[] args) {
    	
    	
    	Scanner sc = new Scanner(System.in);

        // Loop Control Statements

        // 1. While Loop
        System.out.println("While Loop:");
        int i = 0;
        while (i < 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");

        // 2. Do-While Loop
        System.out.println("Do-While Loop:");
        int k = 0;
        do {
            System.out.print(k + " ");
            k++;
        } while (k < 5);
        System.out.println("\n");

        // 3. For Loop
        System.out.println("For Loop:");
        for (int j = 0; j < 5; j++) {
            System.out.print(j + " ");
        }
        System.out.println("\n");

        // 4. Nested Loop
        System.out.println("Nested Loop:");
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 2; y++) {
                System.out.print("(" + x + ", " + y + ") ");
            }
        }
        System.out.println("\n");

        // Decision Control Statements

        // 5. If-Else Statement
        System.out.println("If-Else Statement:");
        int num;
        System.out.println("Enter a number to check if it is positive, negaive or zero:");
        num = sc.nextInt();
        
        if (num > 0) {
            System.out.println("Positive number");
        } else if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative number");
        }
        System.out.println("\n");

        // 6. Switch Case
        System.out.println("Switch Case:");
        int choice;
        System.out.println("Enter your choice(1 or 2 or 3):");
        choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("You chose option 1");
                break;
            case 2:
                System.out.println("You chose option 2");
                break;
            case 3:
                System.out.println("You chose option 3");
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("\n");

        // 7. Ternary Operator
        System.out.println("Using Ternary Operator to check which numbeer is greater");
        int a, b;
        
        System.out.println("Enter value of a:");
        a = sc.nextInt();
        
        System.out.println("Enter value of b:");
        b = sc.nextInt();
        
        int maxNum = (a > b) ? a : b;
        System.out.println("The maximum number is: " + maxNum);
        System.out.println("\n");

        // 8. Break and Continue Statements
        System.out.println("Break and Continue Statements:");
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                System.out.println("Breaking the loop at m = " + m);
                break;
            } else if (m % 2 == 0) {
                System.out.println("Skipping even number at m = " + m);
                continue;
            }
            System.out.print(m + " ");
        }

        // Close the scanner
        sc.close();

    }
}
