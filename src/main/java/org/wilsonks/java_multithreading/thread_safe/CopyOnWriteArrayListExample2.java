/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : CopyOnWriteArrayListExample2.java
 *  * Created On : 2026-06-04 10:09
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

package org.wilsonks.java_multithreading.thread_safe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample2 {

     public static void main(String[] args) throws InterruptedException {
         CopyOnWriteArrayList<String> threadSafeArrayList = new CopyOnWriteArrayList<>();
         ArrayList<String> arrayList = new ArrayList<>();
         List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());// Make ArrayList thread-safe

         Thread t1 = new Thread(() -> {
             for (int i = 0; i < 1000; i++) {
                 threadSafeArrayList.add("Thread1-" + i);
                 arrayList.add("Thread1-" + i);
                 synchronizedList.add("Thread1-" + i);
             }
         });

         Thread t2 = new Thread(() -> {
             for (int i = 0; i < 1000; i++) {
                 threadSafeArrayList.add("Thread2-" + i);
                 arrayList.add("Thread2-" + i);
                 synchronizedList.add("Thread2-" + i);
             }
         });

         t1.start();
         t2.start();

         t1.join();
         t2.join();

         System.out.println("CopyOnWriteArrayList Size: " + threadSafeArrayList.size());
         System.out.println("ArrayList Size: " + arrayList.size());
         System.out.println("SynchronizedList Size: " + synchronizedList.size());
     }
}
