

// 2. Basic Datatypes, variable types, Modifier types, Final keyword, Constructors


package com.iss;

//Employee class definition
public class Employee2 {
	
 // Instance variables with private data types
 private int employeeId;
 private String employeeName;
 private double salary;

 // Modifier types: private variables with public getter and setter methods
 public int getEmployeeId() {
     return employeeId;
 }

 public void setEmployeeId(int employeeId) {
     this.employeeId = employeeId;
 }

 public String getEmployeeName() {
     return employeeName;
 }

 public void setEmployeeName(String employeeName) {
     this.employeeName = employeeName;
 }

 public double getSalary() {
     return salary;
 }

 public void setSalary(double salary) {
     this.salary = salary;
 }

 // Final keyword: constant variable for bonus percentage
 private static final double BONUS_PERCENTAGE = 0.1;

 // Constructors
 // Default constructor
 public Employee2() {
     System.out.println("Default Constructor");
 }

 // Parameterized constructor
 public Employee2(int employeeId, String employeeName, double salary) {
     this.employeeId = employeeId;
     this.employeeName = employeeName;
     this.salary = salary;
 }

 // Method to calculate bonus using the final keyword
 public double calculateBonus() {
     return salary * BONUS_PERCENTAGE;
 }

 // Main method 
 public static void main(String[] args) {
	 
     // Creating an employee object with no arguments 
	 Employee2 employee1 = new Employee2();
	 System.out.println("\n-------------------\n");
	 
     // Creating an employee object using the parameterized constructor
     Employee2 employee2 = new Employee2(1, "John Doe", 50000.0);

     
     // Displaying employee details
     System.out.println("Employee ID: " + employee2.getEmployeeId());
     System.out.println("Employee Name: " + employee2.getEmployeeName());
     System.out.println("Salary: " + employee2.getSalary());
     System.out.println("Bonus: " + employee2.calculateBonus());

 }
}

