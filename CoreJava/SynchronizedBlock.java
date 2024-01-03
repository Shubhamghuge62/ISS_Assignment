package com.iss;

public class SynchronizedBlock {

    // Shared resource
    private int sharedVariable;

    // Constructor
    public SynchronizedBlock() {
        this.sharedVariable = 0;
    }

    // Method to modify the shared variable
    public void modifySharedVariable(int value) {
        // Non-critical section code

        synchronized (this) {
            // Synchronized block: Only one thread can enter this block at a time for a given instance

            System.out.println("Thread " + Thread.currentThread().getId() + " entering modifySharedVariable");

            // Critical section: Modify the shared variable
            this.sharedVariable += value;

            System.out.println("Thread " + Thread.currentThread().getId() + " updated the value of sharedVariable to:" 
                    + sharedVariable);
            
            System.out.println("Thread " + Thread.currentThread().getId() + " exiting modifySharedVariable");
        }

        // Non-critical section code
    }

    // Method to get the current value of the shared variable
    public int getSharedVariable() {
        // Non-critical section code

        int value;

        synchronized (this) {
            // Synchronized block: Only one thread can enter this block at a time for a given instance

            System.out.println("Thread " + Thread.currentThread().getId() + " entering getSharedVariable");

            // Critical section: Read the shared variable
            value = this.sharedVariable;

            System.out.println("Thread " + Thread.currentThread().getId() + " exiting getSharedVariable");
        }

        // Non-critical section code

        return value;
    }

    public static void main(String[] args) {
        // Creating an instance of the class
        SynchronizedBlock SB = new SynchronizedBlock();

        // Creating multiple threads that modify and read the shared variable
        Thread thread1 = new Thread(() -> {
            SB.modifySharedVariable(5);
        });

        Thread thread2 = new Thread(() -> {
            int value = SB.getSharedVariable();
            System.out.println("Thread " + Thread.currentThread().getId() + " read value: " + value);
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

        // Printing the final value of the shared variable
        System.out.println("\nFinal Shared Variable Value: " + SB.getSharedVariable());
    }
}
