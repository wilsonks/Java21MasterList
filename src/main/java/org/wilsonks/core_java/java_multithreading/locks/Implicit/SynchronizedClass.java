/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : SynchronizedClass.java
 *  * Created On : 2026-06-22 18:55
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

package org.wilsonks.core_java.java_multithreading.locks.Implicit;

public class SynchronizedClass {
    private static int count = 0;

    //Synchronized Static Method
    //● Intrinsic locks are built into Java and are associated with every object.
    //The entire method is synchronized, and the lock is associated with the class (SynchronizedClass.class)
    public static synchronized void increment(){
            count++;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                SynchronizedClass.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                SynchronizedClass.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }
}
