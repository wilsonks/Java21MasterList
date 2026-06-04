/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : FourCoreInterfaces.java
 *  * Created On : 2026-06-04 09:08
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
 *   * - Based on specific behaviors: whether they allow duplicates, maintain an order, store key-value pairs, or require special processing
 *  * Notes:
 *  * - List
 *  * - Set
 *  * - Queue
 *  * - Map
 *  *
 *  * =============================================================================
 *
 */

package org.wilsonks.java_collections;

public class FourCoreInterfaces {

    public static String DESCRIPTION = """
            1. List Interface:
                An ordered collection (or sequence) that allows duplicate elements 
                Gives you precise control over where elements are inserted. 
                You can access elements by their integer index.
                Implementations : ArrayList, LinkedList and Vector
            2. Set Interface:
                A collection that cannot contain duplicate elements. 
                Sets are typically used to model the mathematical set abstraction (e.g., storing unique IDs).
                Implementations: HashSet, LinkedHashSet, TreeSet
            3. Queue and Dequeue Interfaces:
                Designed to hold elements prior to processing. 
                Queues usually follow a FIFO (First-In-First-Out) order, while 
                Deque's (Double-ended queues) allow elements to be inserted or removed from both ends.  
                Implementations: PriorityQueue, ArrayDeque   
            4. Map Interface:
                An object that maps keys to values. 
                A map cannot contain duplicate keys; each key can map to at most one value.   
                Implementations: HashMap, LinkedHashMap, TreeMap    
            """;

    public static void main(String[] args) {
        System.out.println(DESCRIPTION);
    }
}
