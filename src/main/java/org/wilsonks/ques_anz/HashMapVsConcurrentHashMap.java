/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : HashMapVsConcurrentHashMap.java
 *  * Created On : 2026-06-23 18:06
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

package org.wilsonks.ques_anz;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

public class HashMapVsConcurrentHashMap {
    public static void main(String[] args) throws InterruptedException {
        // HashMap is not thread-safe, while ConcurrentHashMap is thread-safe.
        // HashMap is faster than ConcurrentHashMap in single-threaded scenarios, but slower in multi-threaded scenarios.
        // ConcurrentHashMap uses a technique called "lock striping" to allow concurrent access to different segments of the map, while HashMap uses a single lock for the entire map.

        // HashMap allows null keys and values, while ConcurrentHashMap does not allow null keys or values.
        HashMap<String, Integer > hashMap1 = new HashMap<>();
        hashMap1.put("one", 1);
        hashMap1.put(null, 2);

        Stream.of(hashMap1)
                .forEach(System.out::println);//{null=2, one=1}

        ConcurrentHashMap<String, Integer> concurrentHashMap1 = new ConcurrentHashMap<>();
        concurrentHashMap1.put("one", 1);
//      concurrentHashMap1.put(null, 2); // throws NullPointerException
        Stream.of(concurrentHashMap1)
                .forEach(System.out::println);//{one=1

        //HashMap crashes or loses data compared to ConcurrentHashMap on concurrent access,
        // while ConcurrentHashMap handles concurrent access without crashing or losing data.
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        ConcurrentHashMap<String, Integer> concurrentHashMap2 = new ConcurrentHashMap<>();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                hashMap2.put("key" + i, i);
                concurrentHashMap2.put("key" + i, i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                hashMap2.put("key" + i, i);
                concurrentHashMap2.put("key" + i, i);
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(hashMap2.size()); // May print a value less than 2000 due to data loss or may throw ConcurrentModificationException
        System.out.println(concurrentHashMap2.size()); //Will print 2000

    }
}
