package com.iss;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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

public class CustomCollectionSet {
    public static void main(String[] args) {
        // Set
        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(new Employee(101, "Shubham"));
        employeeSet.add(new Employee(103, "Alice"));
        employeeSet.add(new Employee(102, "Bob"));

        // Display Set
        System.out.println("Set of Employees: " + employeeSet);

        // Adding a new employee to the set
        Employee newEmployee = new Employee(104, "Eva");
        employeeSet.add(newEmployee);

        System.out.println();
        // Display updated Set
        System.out.println("Updated Set of Employees: " + employeeSet);

        System.out.println();
        // Iterating through the set
        System.out.println("Iterating through the Set:");
        for (Employee employee : employeeSet) {
            System.out.println(employee);
        }

        System.out.println();
        // Using an iterator to iterate through the set
        System.out.println("Using Iterator to iterate through the Set:");
        Iterator<Employee> iterator = employeeSet.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee);
        }

        System.out.println();
        // Clearing the set
        employeeSet.clear();
        System.out.println("Set after clearing: " + employeeSet);
    }
}
