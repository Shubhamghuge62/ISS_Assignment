// Inheritance - mechanism in object-oriented programming where a class (subclass/derived class) 
//can inherit properties and behaviors (fields and methods) from another class (superclass/base class), 
//promoting code reuse and hierarchy

//Overriding - method overriding occurs when a subclass provides a specific implementation 
//for a method that is already defined in its superclass

package com.iss;

// Animal class represents the base class for all animals in the zoo
class Animal {
    // Common properties for all animals
    String name;
    int age;

    // Constructor to initialize name and age
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to make the animal make a sound
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    // Method to display information about the animal
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
    }
}

// Lion class represents a specific type of animal (inherits from Animal)
class Lion extends Animal {
    // Additional property specific to lions
    int maneLength;

    // Constructor to initialize lion-specific properties
    public Lion(String name, int age, int maneLength) {
        // Call the constructor of the base class (Animal)
        super(name, age);
        this.maneLength = maneLength;
    }

    // Override the makeSound method to provide a specific sound for lions
    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }

    // Override the displayInfo method to include lion-specific information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of the base class
        System.out.println("Mane Length: " + maneLength + " inches");
    }
}

// Main class to demonstrate the use of inheritance
public class Inheritance {
    public static void main(String[] args) {
        // Create an instance of the base class (Animal)
        Animal animal = new Animal("Animal", 5);

        // Create an instance of the derived class (Lion)
        Lion lion = new Lion("Simba", 3, 12);

        // Call methods on the base class instance
        System.out.println("Animal:");
        animal.makeSound();
        animal.displayInfo();
        System.out.println();

        // Call methods on the derived class instance
        System.out.println("Lion:");
        lion.makeSound();
        lion.displayInfo();
    }
}
