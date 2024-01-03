//Java Task 1 : Basics of Java: Concept of Class, Object, State(Instance Variables), and Methods


// class - A class is a blueprint from which individual objects are created.

// object - an object is an instance of a class

// method - A Java method is a collection of statements that are grouped together to perform an operation. 

// Instance variables - Instance variables − Instance variables are variables within a class
//but outside any method. These variables are initialized when the class is instantiated. Instance 
//variables can be accessed from inside any method, constructor or blocks of that particular class.


package com.iss;

//Class definition
class Employee3 {
	
 // State (instance variable)
 String name;
 int age;
 int salary;

 // Method to display Employee information
 void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Salary: " + salary);
 }
}

//Creating objects and using methods
public class Basics1{
 public static void main(String[] args) {
	 
     // Creating objects of the Employee class
     Employee3 employee1 = new Employee3();
     Employee3 employee2 = new Employee3();

     // Setting state (instance variable)
     employee1.name = "Shubham";
     employee1.age = 20;
     employee1.salary = 30000;

     employee2.name = "Arun";
     employee2.age = 21;
     employee2.salary = 40000;

     // Calling method to display information
     employee1.displayInfo();
     System.out.println("-----------------");
     employee2.displayInfo();
 }
}
