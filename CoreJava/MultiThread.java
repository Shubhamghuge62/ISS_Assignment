package com.iss;

class NumberPrinter extends Thread {
	
    // Constructor to set the thread name
    public NumberPrinter(String name) {
        super(name);
    }

    // Run method 
    public void run() {
        for (int i = 1; i <= 5; i++) {
            // Print the current number along with the thread name
            System.out.println(Thread.currentThread().getName() + ": " + i);

            try {
                // Introduce a short delay to simulate concurrent execution
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {
        // Create four threads with different names
        NumberPrinter thread1 = new NumberPrinter("Thread 1");
        NumberPrinter thread2 = new NumberPrinter("Thread 2");
        NumberPrinter thread3 = new NumberPrinter("Thread 3");
        NumberPrinter thread4 = new NumberPrinter("Thread 4");

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
