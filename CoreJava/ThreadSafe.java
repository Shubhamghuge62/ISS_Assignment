package com.iss;

//thread safety with respect to instance variables is achieved using synchronization.

public class ThreadSafe {

    // Instance variables
    private int count;

    // Constructor
    public ThreadSafe() {
        this.count = 0;
    }

    // Method to increment the count in a thread-safe manner
    public synchronized void incrementCount() {
        // The synchronized keyword ensures that only one thread can execute this method at a time
        count++;
    }

    // Method to get the current count
    public synchronized int getCount() {
        return count;
    }

    public static void main(String[] args) {
        // Creating an instance of the thread-safe class
        ThreadSafe example = new ThreadSafe();

        // Creating multiple threads that increment the count
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.incrementCount();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.incrementCount();
            }
        });

        // Starting the threads
        thread1.start();
        thread2.start();

        // Waiting for the threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Printing the final count
        System.out.println("Final Count: " + example.getCount());
    }
}

