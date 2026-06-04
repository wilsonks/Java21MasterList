/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : ReentrantExample.java
 *  * Created On : 2026-06-04 09:27
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
 *   * - Reentrant Behavior (Preventing Self-Deadlock)
 *  * Notes:
 *  * - Java's intrinsic locks (synchronized) are reentrant.
 *  This means that if a thread holds a lock on an object, it can re-enter any synchronized method of that object
 *  without blocking itself. This prevents self-deadlock scenarios where a thread would block itself by trying to
 *  acquire a lock it already holds.
 *  *
 *  * =============================================================================
 *
 */

package org.wilsonks.java_multithreading.rentrant;

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