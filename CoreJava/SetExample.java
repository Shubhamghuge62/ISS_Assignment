//HashSet is an unordered set that does not guarantee the order of elements.
//LinkedHashSet maintains the order of insertion.
//TreeSet sorts elements in natural order or using a custom comparator.



package com.iss;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class SetExample {

    public static void main(String[] args) {
        // Example of HashSet
        hashSetOperations();

        // Example of LinkedHashSet
        linkedHashSetOperations();

        // Example of TreeSet
        treeSetOperations();
    }

    private static void hashSetOperations() {
        // Create a HashSet of integers
        HashSet<Integer> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);

        // Display elements in the HashSet
        System.out.println("HashSet elements: " + hashSet);

        // Remove an element
        hashSet.remove(20);

        // Check if an element exists
        System.out.println("Does 30 exist? " + hashSet.contains(30));

        // Display elements after modifications
        System.out.println("HashSet elements after removal: " + hashSet);
        System.out.println();
    }

    private static void linkedHashSetOperations() {
        // Create a LinkedHashSet of characters
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        linkedHashSet.add('A');
        linkedHashSet.add('B');
        linkedHashSet.add('C');
        linkedHashSet.add('D');

        // Display elements in the LinkedHashSet
        System.out.println("LinkedHashSet elements: " + linkedHashSet);

        // Remove an element
        linkedHashSet.remove('B');

        // Check if an element exists
        System.out.println("Does 'C' exist? " + linkedHashSet.contains('C'));

        // Display elements after modifications
        System.out.println("LinkedHashSet elements after removal: " + linkedHashSet);
        System.out.println();
    }

    private static void treeSetOperations() {
        // Create a TreeSet of strings
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("Java");
        treeSet.add("Python");
        treeSet.add("C++");
        treeSet.add("JavaScript");

        // Display elements in the TreeSet
        System.out.println("TreeSet elements: " + treeSet);

        // Remove an element
        treeSet.remove("Python");

        // Check if an element exists
        System.out.println("Does 'Java' exist? " + treeSet.contains("Java"));

        // Display elements after modifications
        System.out.println("TreeSet elements after removal: " + treeSet);

        // Using Iterator for traversal
        System.out.println("Iterating over TreeSet elements:");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
