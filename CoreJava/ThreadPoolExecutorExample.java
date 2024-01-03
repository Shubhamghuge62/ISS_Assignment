package com.iss;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// This represents a simple task that can be executed by a thread
class Task implements Runnable {
    private String taskName;

    // Constructor to set the task name
    public Task(String taskName) {
        this.taskName = taskName;
    }

    // Run method where the actual task execution happens
    @Override
    public void run() {
        // Printing information about the task being executed
        System.out.println( taskName + " is being executed by " +
                Thread.currentThread().getName());

        
        try {
            Thread.sleep(1000); //1000ms 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print information about task completion
        System.out.println(taskName + " completed");
    }
}

public class ThreadPoolExecutorExample {
    public static void main(String[] args) {
        // Create a ThreadPoolExecutor with a fixed-size pool of 3 threads
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);

        // Submit tasks to the thread pool
        for (int i = 1; i <= 5; i++) {
            String taskName = "Task-" + i;
            Task task = new Task(taskName);

            // Print information abo	ut task submission
            System.out.println("Submitting " + taskName + " to the pool");

            // Execute the task using the thread pool
            executor.execute(task);
        }

        // Shutdown the executor after all tasks are submitted
        executor.shutdown();

        try {
            // Wait for all tasks to complete or timeout after 10 seconds
            executor.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Printing a message indicating that all tasks have completed
        System.out.println("All tasks have completed. Shutting down the executor.");
    }
}
