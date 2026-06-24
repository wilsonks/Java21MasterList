/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : ExecuterServiceExample.java
 *  * Created On : 2026-06-09 04:51
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

package org.wilsonks.java5_2004;

import java.util.concurrent.*;

public class ExecuterFrameWorkExample {
    public static final String HISTORY = """
            - Added to java.util.concurrent package in 2004
            - Executers. Factory Class instantiates pre-configured thread pools.
            - Decoupled task submission from thread management with 3 core interfaces 
            - 1. Executer (For only launching tasks: execute(Runnable)) 
            - 2. ExecuterService(Extended for Callable returns Future) 
            - 3. ScheduledExecuterService(After a delay or periodic) 
            """;
    public static final String WHY = """
            1. Creating raw OS-level threads is computationally expensive. Thread pools reuse existing threads to avoid creation overhead.
            2. Resource Management: Unbounded thread creation can quickly crash an application with an OutOfMemoryError. Executors set hard limits on thread counts
            3. Simplified API: It automates complex concurrency mechanics like queueing up excess tasks, handling thread deadlocks, and capturing exceptions thrown inside threads
            """
            ;
public static final String USE_CASE = """
             - Run multiple isolated thread pools side-by-side to keep workloads segregated:
             - Pool A: A small FixedThreadPool dedicated only to heavy computational math or image processing.
             - Pool B: A large, bounded ThreadPoolExecutor dedicated only to network API calls.
        """;

    public static void main(String[] args) {
        System.out.println(HISTORY);
        System.out.println(WHY);
        System.out.println(USE_CASE);

        //Create a Pool
        int poolSize = Runtime.getRuntime().availableProcessors();
        ExecutorService pool = Executors.newFixedThreadPool(poolSize);

        //Create some Tasks and submit
        for (int i = 0; i < 10; i++) {
            final int taskNumber = i;
            pool.submit(
                    () -> {
                        System.out.println("Executing task " + taskNumber + "...");
                        // Get the current thread executing this task
                        Thread currentThread = Thread.currentThread();

                        // Print various thread details
                        System.out.println("Thread Name: " + currentThread.getName());
                        System.out.println("Thread Priority: " + currentThread.getPriority());
                        System.out.println("-----------------------------------");
                    }
            );
        }

        // Automatically creates new threads as needed and reuses idle ones
        //It keeps idle threads alive for 60 seconds, meaning subsequent quick tasks can instantly grab an existing thread.
        ExecutorService ioPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int taskNumber = i;
            ioPool.submit(
                    () -> {
                        System.out.println("Executing short task in ioPool " + taskNumber + "...");
                        // Get the current thread executing this task
                        Thread currentThread = Thread.currentThread();

                        // Print various thread details
                        System.out.println("Thread Name: " + currentThread.getName());
                        System.out.println("Thread Priority: " + currentThread.getPriority());
                        System.out.println("-----------------------------------");
                    }
            );
        }

        //A raw newCachedThreadPool is unbounded and can spin up thousands of threads, causing an OutOfMemoryError if flooded. For high-scale production, configure a custom ThreadPoolExecutor with an upper cap:
        ExecutorService safeIoPool = new ThreadPoolExecutor(
                10,                      // Core pool size
                200,                     // Maximum pool size cap
                60L, TimeUnit.SECONDS,   // Keep-alive time for idle threads
                new LinkedBlockingQueue<>(5000) // Bounded queue to prevent memory overload
        );


        pool.shutdown();
        ioPool.shutdown();
        safeIoPool.shutdown();

    }
}
