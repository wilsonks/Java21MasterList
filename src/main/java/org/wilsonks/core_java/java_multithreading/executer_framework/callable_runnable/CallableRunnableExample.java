/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : CallableRunnableExample.java
 *  * Created On : 2026-06-22 19:49
 *  * Author     : Wilson K Sam
 *  * Copyright  : (c) 2026 Wilson K Sam
 *  * =============================================================================
 *  *
 *  * Description:
 *  * This source file is part of a coding practice project created for learning,
 *  * experimentation, interview preparation, and demonstration of software
 *  * development concepts and best practices.
 *  *
 *   * Purpose:
 *   * -
 *  * Notes:
 *  * -
 *  *
 *  * =============================================================================
 *
 */

package org.wilsonks.core_java.java_multithreading.executer_framework.callable_runnable;

public class CallableRunnableExample {
    public static void main(String[] args) {
        // Create a Callable task
        java.util.concurrent.Callable<String> callableTask = () -> {
            Thread.sleep(1000); // Simulate some work
            return "Callable Task Completed";
        };

        // Create a Runnable task
        Runnable runnableTask = () -> {
            try {
                Thread.sleep(500); // Simulate some work
                System.out.println("Runnable Task Completed");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        // Create an ExecutorService
        java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(2);

        try {
            // Submit the Callable task and get a Future
            java.util.concurrent.Future<String> future = executorService.submit(callableTask);

            // Submit the Runnable task
            executorService.submit(runnableTask);

            // Get the result from the Callable task
            String result = future.get(); // This will block until the Callable is done
            System.out.println(result);
        } catch (java.util.concurrent.ExecutionException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Shutdown the executor service
            executorService.shutdown();
        }
    }
}
