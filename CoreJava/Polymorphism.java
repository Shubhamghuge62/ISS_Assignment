package com.iss;

//Shape class is the base class
class Shape {
 // Method to calculate area for generic shapes
 double calculateArea() {
     return 0.0;
 }
}

//Circle class, a subclass of Shape
class Circle extends Shape {
 double radius;

 // Constructor for Circle
 Circle(double radius) {
     this.radius = radius;
 }

 // Method overloading to calculate area for a circle
 @Override
 double calculateArea() {
     return Math.PI * radius * radius;
 }
}

//Rectangle class, another subclass of Shape
class Rectangle extends Shape {
 double length;
 double width;

 // Constructor for Rectangle
 Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Method overloading to calculate area for a rectangle
 @Override
 double calculateArea() {
     return length * width;
 }
}

//Main class to demonstrate polymorphism
public class Polymorphism {
 public static void main(String[] args) {
     // Creating objects of different shapes
     Shape shape1 = new Circle(5.0);
     Shape shape2 = new Rectangle(4.0, 6.0);

     // Calculating and displaying areas using polymorphism
     System.out.println("Area of Circle: " + shape1.calculateArea());
     System.out.println("Area of Rectangle: " + shape2.calculateArea());
 }
}

