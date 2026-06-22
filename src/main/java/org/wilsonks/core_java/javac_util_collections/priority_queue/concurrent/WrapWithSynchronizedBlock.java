/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : PriorityQueueThreadSafety.java
 *  * Created On : 2026-06-22 11:58
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

public class WrapWithSynchronizedBlock {
    public static void main(String[] args) {
            /*
            * PriorityQueue is not thread-safe. If multiple threads access a PriorityQueue concurrently and at least one of the threads modifies the queue structurally (e.g., by adding or removing elements), it must be synchronized externally.
            *
            * To make a PriorityQueue thread-safe, you can wrap it with Collections.synchronizedCollection() or use a thread-safe alternative like ConcurrentLinkedQueue or PriorityBlockingQueue from the java.util.concurrent package.
            *
            * Example of making a PriorityQueue thread-safe using Collections.synchronizedCollection():
            *
            * import java.util.Collections;
            * import java.util.PriorityQueue;
            *
            * public class ThreadSafePriorityQueue {
            *     private final PriorityQueue<Integer> queue = new PriorityQueue<>();
            *
            *     public void add(Integer element) {
            *         synchronized (queue) {
            *             queue.add(element);
            *         }
            *     }
            *
            *     public Integer poll() {
            *         synchronized (queue) {
            *             return queue.poll();
            *         }
            *     }
            *
            *     public boolean isEmpty() {
            *         synchronized (queue) {
            *             return queue.isEmpty();
            *         }
            *     }
            * }
            */


    }
}
