/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : CustomPriorityQueueExample.java
 *  * Created On : 2026-06-22 11:56
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

package org.wilsonks.core_java.javac_collections.priority_queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CustomPriorityQueueExample {
    public static void main(String[] args) {
        // Create a custom priority queue with a comparator that sorts integers in descending order
        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>(Comparator.reverseOrder());

        priorityQueue1.add("Banana");
        priorityQueue1.add("Apple");
        priorityQueue1.add("Pear");

        priorityQueue1.add("Orange");
        priorityQueue1.add("Watermelon");

        priorityQueue1.add("Pineapple");
        priorityQueue1.add("Strawberry");

        System.out.println("Head of the queue: " + priorityQueue1.peek()); //returns the head of the queue without removing it
        priorityQueue1.remove();
        System.out.println("Head of the queue after removing: " + priorityQueue1.peek()); // retrieves the head of the queue

        System.out.println("Elements in descending order:");
        while (!priorityQueue1.isEmpty()) {
            System.out.println(priorityQueue1.poll()); //removes the head of the queue
        }




    }
}
