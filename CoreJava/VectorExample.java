package com.iss;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        // Create a Vector of integers
        Vector<Integer> integerVector = new Vector<>();

        // Add elements to the Vector
        addElements(integerVector);

        // Display elements in the Vector
        displayElements(integerVector);

        // Remove an element
        removeElement(integerVector, 30);

        // Check if an element exists
        checkElementExistence(integerVector, 40);

        // Display elements after modifications
        displayElements(integerVector);
    }

    private static void addElements(Vector<Integer> vector) {
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
    }

    private static void displayElements(Vector<Integer> vector) {
        System.out.println("Elements in the Vector:");

        // Using enhanced for loop for iteration
        for (Integer element : vector) {
            System.out.println(element);
        }

        System.out.println();
    }

    private static void removeElement(Vector<Integer> vector, int elementToRemove) {
        System.out.println("Removing element: " + elementToRemove +"\n");
        vector.removeElement(elementToRemove);
    }

    private static void checkElementExistence(Vector<Integer> vector, int elementToCheck) {
        System.out.println("Checking if " + elementToCheck + " exists: " + vector.contains(elementToCheck) +"\n");
    }
}

