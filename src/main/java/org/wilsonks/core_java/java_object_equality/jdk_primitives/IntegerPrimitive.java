/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : IntegerPrimitive.java
 *  * Created On : 2026-06-04 09:00
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

package org.wilsonks.core_java.java_object_equality.jdk_primitives;

public class IntegerPrimitive {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // Direct comparison using ==
        System.out.println("Using == : " + (a == b)); // This will print true because for primitive types, == compares the actual values.
    }
}
