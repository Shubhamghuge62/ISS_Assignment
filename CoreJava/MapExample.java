package com.iss;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {
        // Example of HashMap
        hashMapOperations();

        // Example of TreeMap
        treeMapOperations();

        // Example of LinkedHashMap
        linkedHashMapOperations();
    }

    private static void hashMapOperations() {
        // Create a HashMap with String keys and Integer values
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);

        // Display key-value pairs in the HashMap
        System.out.println("HashMap entries: " + hashMap);

        // Remove an entry
        hashMap.remove("Two");

        // Check if a key exists
        System.out.println("Does key 'Three' exist? " + hashMap.containsKey("Three"));

        // Display entries after modifications
        System.out.println("HashMap entries after removal: " + hashMap);
        System.out.println();
    }

    private static void treeMapOperations() {
        // Create a TreeMap with String keys and Integer values
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        treeMap.put("Banana", 3);
        treeMap.put("Apple", 1);
        treeMap.put("Orange", 2);
        treeMap.put("Grapes", 4);

        // Display key-value pairs in the TreeMap (Note: TreeMap is sorted by keys)
        System.out.println("TreeMap entries: " + treeMap);

        // Remove an entry
        treeMap.remove("Apple");

        // Check if a key exists
        System.out.println("Does key 'Orange' exist? " + treeMap.containsKey("Orange"));

        // Display entries after modifications
        System.out.println("TreeMap entries after removal: " + treeMap);
        System.out.println();
    }

    private static void linkedHashMapOperations() {
        // Create a LinkedHashMap with String keys and Integer values
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Add key-value pairs to the LinkedHashMap
        linkedHashMap.put("Red", 1);
        linkedHashMap.put("Green", 2);
        linkedHashMap.put("Blue", 3);
        linkedHashMap.put("Yellow", 4);

        // Display key-value pairs in the LinkedHashMap (Note: LinkedHashMap maintains insertion order)
        System.out.println("LinkedHashMap entries: " + linkedHashMap);

        // Remove an entry
        linkedHashMap.remove("Green");

        // Check if a key exists
        System.out.println("Does key 'Blue' exist? " + linkedHashMap.containsKey("Blue"));

        // Display entries after modifications
        System.out.println("LinkedHashMap entries after removal: " + linkedHashMap);

        // Using Iterator for traversal
        System.out.println("Iterating over LinkedHashMap entries:");
        Set<Map.Entry<String, Integer>> entrySet = linkedHashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
