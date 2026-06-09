/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : ManualThreadVsExecutingExecuterService.java
 *  * Created On : 2026-06-09 06:15
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

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ManualThreadVsExecutingExecuterService {
    public static final String EXPLANATION = """
    The Java Executor Framework abstracts away thread mechanics. 
    You define a fixed or cached number of worker threads. 
    Tasks are placed in a queue, and the pool's internal threads continually pull from that queue to execute them.
""";
    public static void main(String[] args) {
        // Manual Thread Creation
        Thread thread = new Thread(() -> System.out.println("Running in a manual thread"));
        thread.start();

        // Using ExecutorService
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> System.out.println("Running in an ExecutorService thread"));
        executorService.shutdown();
    }
}