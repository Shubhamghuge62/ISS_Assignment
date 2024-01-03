package com.iss;

//Abstract class representing a shape
abstract class Shape1 {
 // Abstract method to calculate area (which is to be implemented by subclasses)
 abstract double calculateArea();

 // Abstract method to display information about the shape (which is to be implemented by subclasses)
 abstract void displayInfo();
 
}

//subclass Circle extending the abstract class Shape
class Circle1 extends Shape1 {
 // Radius of the circle
 private double radius;

 // Constructor to initialize the radius
 public Circle1(double radius) {
     this.radius = radius;
 }

 // Implementation of the abstract method to calculate area for a circle
 @Override
 double calculateArea() {
     return Math.PI * radius * radius;
 }

 // Implementation of the abstract method to display information for a circle
 @Override
 void displayInfo() {
     System.out.println("Circle - Radius: " + radius + ", Area: " + calculateArea());
 }
}

//subclass Rectangle extending the abstract class Shape
class Rectangle1 extends Shape1 {
 // Dimensions of the rectangle
 private double length;
 private double width;

 // Constructor to initialize the length and width
 public Rectangle1(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Implementation of the abstract method to calculate area for a rectangle
 @Override
 double calculateArea() {
     return length * width;
 }

 // Implementation of the abstract method to display information for a rectangle
 @Override
 void displayInfo() {
     System.out.println("Rectangle - Length: " + length + ", Width: " + width + ", Area: " + calculateArea());
 }
}

//Main class to test the abstraction
public class Abstraction {
 public static void main(String[] args) {
     // Creating instances of subclasses
     Circle1 circle = new Circle1(5.0);
     Rectangle1 rectangle = new Rectangle1(4.0, 6.0);

     // Calling methods on abstract types (Shape)
     displayShapeInfo(circle);
     System.out.println();
     displayShapeInfo(rectangle);
 }

 // A method that accepts objects of type Shape and calls their abstract methods
 private static void displayShapeInfo(Shape1 shape) {
     shape.displayInfo(); // Calls the overridden displayInfo method
 }
}

