/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : CollectionSynchronisedList.java
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

package org.wilsonks.core_java.java_multithreading.thread_safe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSynchronisedList {

     public static void main(String[] args) {
          List<String> synchronizedArrayList = Collections.synchronizedList(new ArrayList<>());
         List<String> stringArrayList = new ArrayList<>();


         // Create threads to add elements to the synchronized list
          Thread t1 = new Thread(() -> {
              for (int i = 0; i < 1000; i++) {
                  stringArrayList.add("Thread1-" + i);
                  synchronizedArrayList.add("Thread1-" + i);
              }
          });

          Thread t2 = new Thread(() -> {
              for (int i = 0; i < 1000; i++) {
                  stringArrayList.add("Thread2-" + i);
                  synchronizedArrayList.add("Thread2-" + i);
              }
          });

          // Start the threads
          t1.start();
          t2.start();

          // Wait for the threads to finish
          try {
              t1.join();
              t2.join();
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          

         System.out.println("ArrayList Size: " + stringArrayList.size());
         System.out.println("Synchronized List Size: " + synchronizedArrayList.size());
     }
}
