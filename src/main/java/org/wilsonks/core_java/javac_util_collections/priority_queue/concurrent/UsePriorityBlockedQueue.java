/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : UsePriorityBlockedQueue.java
 *  * Created On : 2026-06-22 12:00
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

package org.wilsonks.core_java.javac_util_collections.priority_queue.concurrent;

import java.time.LocalDateTime;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class UsePriorityBlockedQueue {

    public static AtomicInteger count = new AtomicInteger(0);

    public static void log(String message) {
        System.out.println(LocalDateTime.now() + " " + message + " " + Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {

//        PriorityBlockingQueue<Integer> pbq1 = new PriorityBlockingQueue<>();
        PriorityQueue<Integer> pbq1 = new PriorityQueue<>();

        Thread  producer = new Thread(() -> {
            System.out.println("Producer start");
            for (int i = 0; i < 10; i++) {
                try {
                    Integer randomNumber = new Random().nextInt(100);
                    pbq1.offer(randomNumber);
                    log("Adding " + randomNumber);
                    pbq1.forEach(number -> System.out.print(" " + number));
                    System.out.println();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Producer end");
        });

        Thread consumer = new Thread(() -> {
            System.out.println("Consumer start");
            for (int i = 1; i <= 10; i++) {
                try {
                    Integer number = pbq1.poll();
                    log("Polling " + number);
                    count.incrementAndGet();
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Consumer end");
        });

        producer.start();
        consumer.start();

        //wait till consumer finish
        producer.join();
        consumer.join();

        System.out.println("Number of numbers consumed: " + count.get());

    }
}
