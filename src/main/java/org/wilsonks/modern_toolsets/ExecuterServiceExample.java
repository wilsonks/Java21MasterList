/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : ExecuterServiceExample.java
 *  * Created On : 2026-06-09 05:03
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

package org.wilsonks.modern_toolsets;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServiceExample {

    public static void main(String[] args) {
         ExecutorService executorService = Executors.newFixedThreadPool(2);
         executorService.submit(() -> {
             System.out.println("Task 1");
         });
         executorService.submit(() -> {
             System.out.println("Task 2");
         });
         executorService.shutdown();
    }
}