package com.iss;

//Encapsulation example in Java

//Class representing a Person
class Person1 {
	
 // Private attributes to encapsulate the data
 private String name;
 private int age;

 // Constructor to initialize the Person object
 public Person1(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Getter method to access the name attribute
 public String getName() {
     return name;
 }

 // Setter method to modify the name attribute
 public void setName(String name) {
     this.name = name;
 }

 // Getter method to access the age attribute
 public int getAge() {
     return age;
 }

 // Setter method to modify the age attribute
 public void setAge(int age) {
     this.age = age;
 }
}

//Main class for testing encapsulation
public class Encapsulation {
 public static void main(String[] args) {
	 
     // Create a Person object
     Person1 person = new Person1("Shubham Ghuge", 20);

     // Accessing attributes through getter methods
     System.out.println("Name: " + person.getName());
     System.out.println("Age: " + person.getAge());

     // Modifying attributes through setter methods
     person.setName("Suresh Ghuge");
     person.setAge(46);

     System.out.println();
     
     // Displaying updated information
     System.out.println("Updated Name: " + person.getName());
     System.out.println("Updated Age: " + person.getAge());
 }
}
