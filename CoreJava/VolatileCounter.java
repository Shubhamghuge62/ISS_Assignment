package com.iss;

// The volatile keyword in Java is used to indicate that a variable's value 
//may be modified by multiple threads simultaneously.
public class VolatileCounter {
    // Using volatile keyword for shared counter
    private static volatile int counter = 0;

    public static void main(String[] args) {
        // Thread to increment the counter
        Thread incrementThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                // Increment the counter
                counter++;
                System.out.println("Incremented counter: " + counter);

                try {
                    // Simulate some processing time
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Thread to decrement the counter
        Thread decrementThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                // Decrement the counter
                counter--;
                System.out.println("Decremented counter: " + counter);

                try {
                    // Simulate some processing time
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        incrementThread.start();
        decrementThread.start();
    }
}

