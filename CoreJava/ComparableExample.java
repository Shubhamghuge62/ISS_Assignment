package com.iss;

import java.util.Arrays;

import Person;

//Define a Person class implementing Comparable interface
class Person implements Comparable<Person> {
 private String name;
 private int age;

 // Constructor
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Implement the compareTo method from Comparable interface
 @Override
 public int compareTo(Person otherPerson) {
     // Compare persons based on their age
     return Integer.compare(this.age, otherPerson.age);
 }

 // toString method to print person details
 @Override
 public String toString() {
     return "Person{" +"name='" + name + '\'' +", age=" + age +'}';
 }
}

public class ComparableExample {
 public static void main(String[] args) {
     // Create an array of Person objects
     Person[] people = {
             new Person("John", 30),
             new Person("Jane", 25),
             new Person("Bob", 35)
     };

     // Display the original array
     System.out.println("Original array:");
     displayPeople(people);

     // Sort the array using Arrays.sort() which uses Comparable
     Arrays.sort(people);

     // Display the sorted array
     System.out.println("\nSorted array based on age:");
     displayPeople(people);
 }

 // Helper method to display an array of people
 private static void displayPeople(Person[] people) {
     for (Person person : people) {
         System.out.println(person);
     }
 }
}

