/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : NewSingleThreadExecuterExample.java
 *  * Created On : 2026-06-22 19:33
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

package org.wilsonks.core_java.java_multithreading.executer_framework;

public class NewSingleThreadExecuterExample {

    public static void main(String[] args) {
        //Creates a single-threaded executor.
        // Tasks submitted to this executor will be executed sequentially, and only one task will be active at any given time.
        // If the single thread is busy executing a task, additional tasks will wait in a queue until the thread is available.
        var executor = java.util.concurrent.Executors.newSingleThreadExecutor();

        executor.submit(() -> System.out.println("Task 1 executed by " + Thread.currentThread().getName()));
        executor.submit(() -> System.out.println("Task 2 executed by " + Thread.currentThread().getName()));
        executor.submit(() -> System.out.println("Task 3 executed by " + Thread.currentThread().getName()));

        executor.shutdown();
    }
}
