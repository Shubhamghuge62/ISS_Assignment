package com.iss;
//Import necessary packages
import com.calculator.Calculator;

//Main class that serves as the entry point of the program
public class Package {

 // Main method where the program execution starts
 public static void main(String[] args) {
     // Create an instance of the Calculator class
     Calculator calculator = new Calculator();

     // Perform some calculations using the Calculator class
     int sumResult = calculator.add(5, 7);
     int productResult = calculator.multiply(3, 4);

     // Display the results of the calculations
     System.out.println("Sum is : " + sumResult);
     System.out.println("Product is: " + productResult);
 }
}