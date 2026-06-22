/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : AtomicIntegerExample.java
 *  * Created On : 2026-06-22 17:48
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

package org.wilsonks.core_java.java_multithreading.thread_safe;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {

    private static AtomicInteger atomicIntegerCounter = new AtomicInteger(0);
    private static Integer integerCounter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                atomicIntegerCounter.incrementAndGet();
                integerCounter++;
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                atomicIntegerCounter.incrementAndGet();
                integerCounter++;
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Atomic Counter Value: " + atomicIntegerCounter.get());
        System.out.println("Integer Counter Value: " + integerCounter);
    }
}
