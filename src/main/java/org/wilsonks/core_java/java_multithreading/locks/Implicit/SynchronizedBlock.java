/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : SynchronozedBlock.java
 *  * Created On : 2026-06-22 18:58
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
public class SynchronizedBlock {
    private int count = 0;

    //● Intrinsic locks are built into Java and are associated with every object.
    public synchronized void increment() {
        synchronized (this) {
            count++;
        }
    }
    public static void main(String[] args) {
        SynchronizedBlock obj = new SynchronizedBlock();

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

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(obj.count);
    }
}
