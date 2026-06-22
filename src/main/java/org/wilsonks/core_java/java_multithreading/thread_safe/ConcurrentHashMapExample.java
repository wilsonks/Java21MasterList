/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : ConcurrentHashMapExample.java
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

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    private static ConcurrentHashMap<String, Integer> map1 = new ConcurrentHashMap<>();
    private static HashMap<String, Integer> map2 = new HashMap<>();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map1.put("key" + i, i);
                map2.put("key" + i, i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map1.put("key" + (i + 1000), i);
                map2.put("key" + (i + 1000), i);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("ConcurrentHashMap Size: " + map1.size());
        System.out.println("HashMap Size: " + map2.size());
    }
}
