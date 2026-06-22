/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : NewScheculedThreadPoolExample.java
 *  * Created On : 2026-06-22 19:35
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

public class NewScheduledThreadPoolExample {

     public static void main(String[] args) {
         //Creates a thread pool for scheduling tasks.
         // It allows you to schedule tasks to run after a specified delay or to execute periodically at fixed intervals.
         var scheduledExecutorService = java.util.concurrent.Executors.newScheduledThreadPool(2);

         scheduledExecutorService.schedule(() -> System.out.println("Task executed after 3 seconds"), 3, java.util.concurrent.TimeUnit.SECONDS);
         scheduledExecutorService.scheduleAtFixedRate(() -> System.out.println("Task executed every 2 seconds"), 0, 2, java.util.concurrent.TimeUnit.SECONDS);
     }
}
