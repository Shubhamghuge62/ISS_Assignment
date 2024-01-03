package com.iss;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

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
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + '\'' + '}';
    }
}

public class CustomCollectionList {
    public static void main(String[] args) {
        // List
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Shubham"));
        employeeList.add(new Employee(103, "Alice"));
        employeeList.add(new Employee(102, "Bob"));

        // Display List
        System.out.println("List of Employees: " + employeeList);

        System.out.println();
        // Adding a new employee to the list
        Employee newEmployee = new Employee(104, "Jemie");
        employeeList.add(newEmployee);

        System.out.println();

        // Display updated List
        System.out.println("Updated List of Employees: " + employeeList);

        // Removing an employee with ID 101
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == 101) {
                iterator.remove();
            }
        }

        System.out.println();
        // Display updated List
        System.out.println("List after removing Employee with ID 101: " + employeeList);

        // Updating an employee's name in the list
        for (Employee employee : employeeList) {
            if (employee.getId() == 102) {
                employee.setName("UpdatedBob");
                break;
            }
        }

        System.out.println();

        // Display updated List
        System.out.println("List after updating name for Employee with ID 102: " + employeeList);

        // Accessing elements by index
        int indexToAccess = 1;
        Employee accessedEmployee = employeeList.get(indexToAccess);
        System.out.println();
        System.out.println("Employee at index " + indexToAccess + ": " + accessedEmployee);

        System.out.println();

        // Iterating through the list
        System.out.println("Iterating through the List:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        System.out.println();

        // Using LinkedList as a Queue
        Queue<Employee> employeeQueue = new LinkedList<>(employeeList);
        System.out.println("Queue of Employees: " + employeeQueue);

        System.out.println();

        // Polling an employee from the queue
        Employee polledEmployee = employeeQueue.poll();
        System.out.println("Polled Employee from Queue: " + polledEmployee);
    }
}
