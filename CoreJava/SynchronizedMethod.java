package com.iss;

public class SynchronizedMethod {

    // Shared resource
    private int sharedVariable;

    // Constructor
    public SynchronizedMethod() {
        this.sharedVariable = 0;
    }

    // Synchronized method to modify the shared variable
    public synchronized void modifySharedVariable(int value) {
    	
        // The 'synchronized' keyword ensures that only one thread can execute this method at a time
        System.out.println("Thread " + Thread.currentThread().getId() + " entering modifySharedVariable");
        
        //Modify the shared variable
        this.sharedVariable += value;
        
        System.out.println("Thread " + Thread.currentThread().getId() + " updated the value of sharedVariable to:" 
        + sharedVariable);

        System.out.println("Thread " + Thread.currentThread().getId() + " exiting modifySharedVariable");
    }

    // Synchronized method to get the current value of the shared variable
    public synchronized int getSharedVariable() {
        // The 'synchronized' keyword ensures that only one thread can execute this method at a time
        System.out.println("Thread " + Thread.currentThread().getId() + " entering getSharedVariable");

        // Critical section: Read the shared variable
        int value = this.sharedVariable;

        System.out.println("Thread " + Thread.currentThread().getId() + " exiting getSharedVariable");

        return value;
    }

    public static void main(String[] args) {
        // Creating an instance of the class
        SynchronizedMethod SM = new SynchronizedMethod();

        // Creating multiple threads that modify and read the shared variable
        Thread thread1 = new Thread(() -> {
            SM.modifySharedVariable(5);
        });

        Thread thread2 = new Thread(() -> {
            int value = SM.getSharedVariable();
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
        System.out.println("\nFinal Shared Variable Value: " + SM.getSharedVariable());
    }
}

