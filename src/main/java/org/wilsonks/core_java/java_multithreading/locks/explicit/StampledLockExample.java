/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : StampledLockExample.java
 *  * Created On : 2026-06-22 19:18
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

import java.util.concurrent.locks.StampedLock;

public class StampledLockExample {
    public static void main(String[] args) throws InterruptedException {
        final StampedLock stampedLock = new StampedLock();

        Thread thread1 = new Thread(() -> {
            try {
                long stamp = stampedLock.writeLock();
                System.out.println(Thread.currentThread().getName() + " acquired read lock, reading data...");
                Thread.sleep(5000);
                stampedLock.unlockWrite(stamp);
                System.out.println(Thread.currentThread().getName() + " released read lock.");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                long stamp = stampedLock.readLock();
                System.out.println(Thread.currentThread().getName() + " acquired read lock, reading data...");
                Thread.sleep(5000);
                stampedLock.unlockRead(stamp);
                System.out.println(Thread.currentThread().getName() + " released read lock.");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Both threads have completed their execution.");

    }
}
