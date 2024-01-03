package com.iss;

//Define the Pet interface
interface Pet {
	
 // Abstract method for the pet to make a sound
 void makeSound();

 // Abstract method for the pet to play
 void play();
}

//Implementing the Pet interface for a Dog
class Dog implements Pet {
 // Implementing makeSound method for Dog
 @Override
 public void makeSound() {
     System.out.println("Dog barks: Woof, woof!");
 }

 // Implementing play method for Dog
 @Override
 public void play() {
     System.out.println("Dog is playing fetch.");
 }
}

//Implementing the Pet interface for a Cat
class Cat implements Pet {
 // Implementing makeSound method for Cat
 @Override
 public void makeSound() {
     System.out.println("Cat meows: Meow, meow!");
 }

 // Implementing play method for Cat
 @Override
 public void play() {
     System.out.println("Cat is chasing a toy mouse.");
 }
}

//Main class to test the Pet interface and its implementations
public class Interface {
 public static void main(String[] args) {
	 
     // Creating instances of Dog and Cat
     Dog myDog = new Dog();
     Cat myCat = new Cat();

     // Interacting with the pets
     System.out.println("My Dog:");
     myDog.makeSound();
     myDog.play();

     System.out.println(); 

     System.out.println("My Cat:");
     myCat.makeSound();
     myCat.play();
 }
}

