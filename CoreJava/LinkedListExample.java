package com.iss;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        // Add elements to the LinkedList
        addElements(integerLinkedList);

        // Display elements in the LinkedList
        displayElements(integerLinkedList);

        // Add an element at a specific position
        addElementAtPosition(integerLinkedList, 2, 99);

        // Remove an element at a specific position
        removeElementAtPosition(integerLinkedList, 1);

        // Display elements after modifications
        displayElements(integerLinkedList);
    }

    //method to add elements in linkedlist 
    private static void addElements(LinkedList<Integer> linkedList) {
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
    }

    //method to display linkedlist elements 
    private static void displayElements(LinkedList<Integer> linkedList) {
        System.out.println("Elements in the LinkedList:");

        // Using ListIterator for traversal
        ListIterator<Integer> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();
    }

    
    private static void addElementAtPosition(LinkedList<Integer> linkedList, int position, int value) {
        System.out.println("Adding " + value + " at position " + position+"\n");
        linkedList.add(position, value);
    }

    //method to remove element from linkedlist
    private static void removeElementAtPosition(LinkedList<Integer> linkedList, int position) {
        System.out.println("Removing element at position " + position +"\n");
        linkedList.remove(position);
    }
}

