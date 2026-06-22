/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : ReentrantReadWriteLock.java
 *  * Created On : 2026-06-22 19:09
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

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockExample {

     public static void main(String[] args) {
         final ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();

         // Example of acquiring read lock
         Thread readerThread = new Thread(() -> {
             rwLock.readLock().lock();
             try {
                 System.out.println("Reader thread: Acquired read lock, reading data...");
                 Thread.sleep(5000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             } finally {
                 rwLock.readLock().unlock();
                 System.out.println("Reader thread: Released read lock.");
             }
         });

         // Example of acquiring write lock
         Thread writerThread = new Thread(() -> {
             rwLock.writeLock().lock();
             try {
                 System.out.println("Writer thread: Acquired write lock, writing data...");
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             } finally {
                 rwLock.writeLock().unlock();
                 System.out.println("Writer thread: Released write lock.");
             }
         });

         readerThread.start();
         writerThread.start();
     }
}
