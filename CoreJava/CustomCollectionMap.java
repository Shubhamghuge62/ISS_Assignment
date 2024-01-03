package com.iss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + '\'' + '}';
    }
}

// CustomEmployeeMapEntry class represents key-value pairs in the custom map
class CustomEmployeeMapEntry {
    private final Integer key;
    private Employee value;

    // Constructor to initialize key and value
    public CustomEmployeeMapEntry(Integer key, Employee value) {
        this.key = key;
        this.value = value;
    }

    // Getter method for key
    public Integer getKey() {
        return key;
    }

    // Getter method for value
    public Employee getValue() {
        return value;
    }

    // Setter method for value
    public void setValue(Employee value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CustomEmployeeMapEntry{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

// CustomEmployeeMap class for employees
class CustomEmployeeMap {
    private final List<CustomEmployeeMapEntry> entries;

    // Constructor to initialize the list of entries
    public CustomEmployeeMap() {
        this.entries = new ArrayList<>();
    }

    // Method to add or update a key-value pair in the map
    public void put(Integer key, Employee value) {
        // Checking if the key already exists
        for (CustomEmployeeMapEntry entry : entries) {
            if (entry.getKey().equals(key)) {
                // Update the value if the key exists
                entry.setValue(value);
                return;
            }
        }

        // Add a new entry if the key doesn't exist
        entries.add(new CustomEmployeeMapEntry(key, value));
    }

    // Method to get the value associated with a key
    public Employee get(Integer key) {
        for (CustomEmployeeMapEntry entry : entries) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        // Return null if the key is not found
        return null;
    }

    // Method to remove a key-value pair from the map
    public void remove(Integer key) {
        Iterator<CustomEmployeeMapEntry> iterator = entries.iterator();
        while (iterator.hasNext()) {
            CustomEmployeeMapEntry entry = iterator.next();
            if (entry.getKey().equals(key)) {
                iterator.remove();
                return;
            }
        }
    }

    // Method to check if the map contains a key
    public boolean containsKey(Integer key) {
        for (CustomEmployeeMapEntry entry : entries) {
            if (entry.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    // Method to get the size of the map
    public int size() {
        return entries.size();
    }

    // Method to check if the map is empty
    public boolean isEmpty() {
        return entries.isEmpty();
    }

    // Method to clear all entries from the map
    public void clear() {
        entries.clear();
    }

    // Method to get a string representation of the map
    @Override
    public String toString() {
        return "CustomEmployeeMap{" +
                "entries=" + entries +
                '}';
    }
}

public class CustomCollectionMap {
    public static void main(String[] args) {
        // Create a custom employee map
        CustomEmployeeMap customEmployeeMap = new CustomEmployeeMap();

        // Add key-value pairs to the map
        customEmployeeMap.put(101, new Employee(101, "John"));
        customEmployeeMap.put(103, new Employee(103, "Alice"));
        customEmployeeMap.put(102, new Employee(102, "Bob"));

        // Display the map
        System.out.println("Custom Employee Map: " + customEmployeeMap);

        System.out.println();
        // Get values based on keys
        System.out.println("Value for key 102: " + customEmployeeMap.get(102));
        System.out.println();
        
        System.out.println("Value for key 104: " + customEmployeeMap.get(104));

        // Remove a key-value pair
        customEmployeeMap.remove(102);
        System.out.println();
        System.out.println("Custom Employee Map after removing key 102: " + customEmployeeMap);

        // Check if the map contains a key
        System.out.println();
        System.out.println("Contains key 103: " + customEmployeeMap.containsKey(103));
        System.out.println();
        System.out.println("Contains key 104: " + customEmployeeMap.containsKey(104));

        System.out.println();
        // Get the size of the map
        System.out.println("Size of the Employee Map: " + customEmployeeMap.size());

        System.out.println();
        // Check if the map is empty
        System.out.println("Is Employee Map empty? " + customEmployeeMap.isEmpty());

        System.out.println();
        // Clear all entries from the map
        customEmployeeMap.clear();
        System.out.println(" Employee Map after clearing: " + customEmployeeMap);
    }
}

