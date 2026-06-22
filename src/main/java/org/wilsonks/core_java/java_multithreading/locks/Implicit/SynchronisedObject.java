/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : SynchronisedObject.java
 *  * Created On : 2026-06-22 18:49
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

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SynchronisedObject{
    private int count = 0;

    //Synchronized Methods
    //● Intrinsic locks are built into Java and are associated with every object.
    //The entire method is synchronized, and the lock is associated with the object (this)
    public synchronized void increment(){
            count++;
    }
    public static void main(String[] args) throws InterruptedException {
        SynchronisedObject obj = new SynchronisedObject();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                obj.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                obj.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + obj.getCount());
    }

}
