/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : ReentrantExample.java
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

public class ReentrantExample {
    // The same thread can enter both synchronized methods smoothly
    public synchronized void methodA() {
        System.out.println("Inside Method A");
        methodB(); // Re-enters the object's lock without blocking
    }

    public synchronized void methodB() {
        System.out.println("Inside Method B");
    }


    public static void main(String[] args) {
        ReentrantExample example = new ReentrantExample();
        example.methodA(); // This will call methodB without any issues
    }
}