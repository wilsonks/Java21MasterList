/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : ExecuterServiceExample.java
 *  * Created On : 2026-06-22 20:06
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

package org.wilsonks.java21_2023;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServiceExample {

    public static final String test= "Executors.newFixedThreadPool";

    public static void main(String[] args) {
//         ExecutorService executorService = Executors.newFixedThreadPool(2); //
//        ExecutorService executorService = Executors.newSingleThreadExecutor(); //
        ExecutorService executorService = Executors.newCachedThreadPool(); //
        for (int i = 0; i < 10; i++) {
            String task = "Task " + i;
            executorService.execute(() -> {
                System.out.println(test + task  +  " Running in " + Thread.currentThread().getName());
            });
        }
         executorService.shutdown();
    }
}