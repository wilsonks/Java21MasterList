/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : CollectionSynchronisedList.java
 *  * Created On : 2026-06-04 10:37
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

public class CollectionSynchronisedList {

     public static void main(String[] args) {
          // Create a synchronized list
          List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());

          // Create threads to add elements to the synchronized list
          Thread t1 = new Thread(() -> {
              for (int i = 0; i < 1000; i++) {
                  synchronizedList.add("Thread1-" + i);
              }
          });

          Thread t2 = new Thread(() -> {
              for (int i = 0; i < 1000; i++) {
                  synchronizedList.add("Thread2-" + i);
              }
          });

          Thread t3 = new Thread(() -> {
              synchronized (synchronizedList) { //// Crucial manual lock for iterators
                  for (String s : synchronizedList) {
                      System.out.println(s);
                  }
              }
          });

          // Start the threads
          t1.start();
          t2.start();
          t3.start();

          // Wait for the threads to finish
          try {
              t1.join();
              t2.join();
              t3.join();
          } catch (InterruptedException e) {
              e.printStackTrace();
          }

          // Print the size of the synchronized list
          System.out.println("Synchronized List Size: " + synchronizedList.size());
     }
}
