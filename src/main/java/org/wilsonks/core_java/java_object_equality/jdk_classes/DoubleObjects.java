/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : DoubleObjects.java
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

package org.wilsonks.core_java.java_object_equality.jdk_classes;

public class DoubleObjects {
    public static void main(String[] args) {
        Double d1 = 0.1;
        Double d2 = 0.2;
        Double d3 = d1 + d2;
        Double d4 = 0.3;

        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);
        System.out.println("d3: " + d3);

        System.out.println("Using == : " + (d3 == 0.3)); // This will print false because of the way floating-point arithmetic works in Java, leading to precision issues.
        System.out.println("Using equals : " + d3.equals(0.3)); // This will also print false because the equals method in the Double class checks for exact equality, and due to precision issues, d3 may not be exactly equal to 0.3.
        System.out.println("Using epsilon comparison: " + (Math.abs(d3 - 0.3) < 1e-10)); // This should print true because it checks if the difference between d3 and 0.3 is within a small threshold, accounting for precision issues.
        System.out.println("Using equals : " + d4.equals(d3));//This should print false because the equals method in the Double class checks for exact equality, and due to precision issues, d3 may not be exactly equal to d4 (which is 0.3).

    }
}
