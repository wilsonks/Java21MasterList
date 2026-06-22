/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : NewFixedPoolExecuterExample.java
 *  * Created On : 2026-06-22 19:29
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

public class NewFixedPoolExecuterExample {

     public static void main(String[] args) {
         //newFixedThreadPool(int n): Creates a thread pool with a fixed number of
         //threads. If all threads are busy executing tasks, additional tasks will wait in a queue until a thread is available.
         var executor = java.util.concurrent.Executors.newFixedThreadPool(3);

         for (int i = 0; i < 10; i++) {
             final int taskId = i;
             executor.submit(() -> {
                 System.out.println("Task " + taskId + " is running on thread " + Thread.currentThread().getName());
             });
         }

         executor.shutdown();
     }
}
