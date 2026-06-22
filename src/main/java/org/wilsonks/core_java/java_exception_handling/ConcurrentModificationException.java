/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : ConcurrentModificationException.java
 *  * Created On : 2026-06-22 17:30
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

package org.wilsonks.core_java.java_exception_handling;

import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationException {

    public static void main(String[] args) {
        // Example of using CopyOnWriteArrayList
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Adding elements to the list
        list.add("Hello");
        list.add("World");

        // Iterating over the list
        for (String item : list) {
            System.out.println(item);
        }

        // Modifying the list while iterating
        for (String item : list) {
            if (item.equals("Hello")) {
                list.remove(item); // This will not cause ConcurrentModificationException
            }
        }

        // Final state of the list
        System.out.println("Final List: " + list);
    }
}
