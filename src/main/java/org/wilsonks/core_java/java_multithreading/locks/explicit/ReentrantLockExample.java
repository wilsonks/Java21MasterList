/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : ReentrantLockExample.java
 *  * Created On : 2026-06-22 19:02
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

package org.wilsonks.core_java.java_multithreading.locks.explicit;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    //Create lock object explicitly
    ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        ReentrantLockExample example = new ReentrantLockExample();

        Thread t1 = new Thread(() -> {
            example.lock.lock();
            try {
                System.out.println("Thread 1: Acquired lock, doing work...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                example.lock.unlock();
                System.out.println("Thread 1: Released lock.");
            }
        });

        Thread t2 = new Thread(() -> {
            example.lock.lock();
            try {
                System.out.println("Thread 2: Acquired lock, doing work...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                example.lock.unlock();
                System.out.println("Thread 2: Released lock.");
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Both threads have finished execution.");
    }
}
