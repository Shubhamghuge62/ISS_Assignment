package com.iss;
import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        // Create a List of Strings using ArrayList
        List<String> stringList = new ArrayList<>();

        // Add elements to the List
        addElements(stringList);

        // Display elements in the List
        displayElements(stringList);
    }

    //Adds elements to the given List.
    private static void addElements(List<String> list) {
        // Adding elements to the List
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
    }

    //Displays elements in the given List.
    private static void displayElements(List<String> list) {
        System.out.println("Elements in the List:");

        // Iterating through the List and displaying elements
        for (String element : list) {
            System.out.println(element);
        }
    }
}
