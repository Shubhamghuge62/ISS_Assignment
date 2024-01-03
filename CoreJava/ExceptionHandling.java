package com.iss;

import java.util.Scanner;

//Main class to demonstrate exception handling
public class ExceptionHandling {

 public static void main(String[] args) {
	 
     // Created a Scanner object for user input
     Scanner scanner = new Scanner(System.in);

     try {
         // Prompt the user to enter a number
         System.out.print("Enter a number: ");
         int num = scanner.nextInt();
         
         // Validate the entered number
         validateNumber(num);

         // Display a message if the number is valid
         System.out.println("Entered number is valid.");
     } catch (InputValidationException e) {
    	 
         // Catch and handle the custom InputValidationException
         System.out.println("Exception caught: " + e.getMessage());
     } catch (Exception e) {
    	 
         // Catch and handle other unexpected exceptions
         System.out.println("An unexpected error occurred: " + e.getMessage());
     } finally {
    	 
         // Execute this block regardless of whether an exception occurred or not
         System.out.println("Inside Finally block ");
         
         // Close the scanner to prevent resource leaks
         scanner.close();
     }
 }

 // Method to validate the entered number
 static void validateNumber(int num) throws InputValidationException {
     // Check if the number is negative, and throw an exception if it is
     if (num < 0) {
         throw new InputValidationException("Number cannot be negative.");
     }
 }
}

//Custom exception class for input validation errors
class InputValidationException extends Exception {
 public InputValidationException(String message) {
     super(message);
 }
}
