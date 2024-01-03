package com.iss;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        // Create a Stack of integers
        Stack<Integer> integerStack = new Stack<>();

        // Push elements onto the Stack
        pushElements(integerStack);

        // Display elements in the Stack
        displayElements(integerStack);

        // Pop an element from the Stack
        popElement(integerStack);

        // Display elements after pop operation
        displayElements(integerStack);
    }

    //Pushes elements onto the given Stack.
    
    private static void pushElements(Stack<Integer> stack) {
        // Pushing elements onto the Stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
    }

    //Displays elements in the given Stack.
     
    private static void displayElements(Stack<Integer> stack) {
        System.out.println("Elements in the Stack:");

        // Using enhanced for loop for iteration
        for (Integer element : stack) {
            System.out.println(element);
        }

        System.out.println();
    }

    //Pops an element from the given Stack.
     
    private static void popElement(Stack<Integer> stack) {
        // Popping an element from the Stack
        Integer poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement +"\n");
    }
}

