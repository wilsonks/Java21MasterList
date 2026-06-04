/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : DoublePrimitivePrecisionProblem.java
 *  * Created On : 2026-06-04 08:56
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

package org.wilsonks.java_object_equality.jdk_primitives;

public class DoublePrimitivePrecisionProblem {
    public static void main(String[] args) {
        double a = 0.1 + 0.2;
        double b = 0.3;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // Direct comparison using == , for primitives compares the actual values, but due to precision issues with floating-point arithmetic, this may not work as expected.
        System.out.println("Using == : " + (a == b)); // This will likely print false because floating-point arithmetic can lead to precision issues, and a and b may not be exactly equal due to how they are represented in memory.

        // Using a small epsilon value for comparison
        double epsilon = 1e-10; // A small threshold
        boolean areEqual = Math.abs(a - b) < epsilon;
        System.out.println("Using epsilon comparison: " + areEqual); // This should print true

    }
}
