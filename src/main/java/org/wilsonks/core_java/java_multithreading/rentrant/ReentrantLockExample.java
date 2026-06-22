/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : ReentrantLockExample.java
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

package org.wilsonks.core_java.java_multithreading.rentrant;

public class ReentrantLockExample {

    public synchronized void methodA() {
        System.out.println("Method A is executing.");

        methodB(); // Reentrant call
    }

    public synchronized void methodB() {
        System.out.println("Inside Method B");
    }

    public static void main(String[] args) {
        ReentrantLockExample reentrantLockExample = new ReentrantLockExample();
        Thread thread1 = new Thread(reentrantLockExample::methodA);
        Thread thread2 = new Thread(reentrantLockExample::methodB);

        thread1.start();
        thread2.start();
    }
}
