/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : DoubleObjectsNan.java
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

public class DoubleObjectsNan {
    public static void main(String[] args) {
        Double d1 = Double.NaN;
        Double d2 = Double.NaN;

        double d3 = Double.NaN;
        double d4 = Double.NaN;

        //All Wrapper class objects are different in memory, so they are not the same reference, even if they represent the same value (NaN in this case).
        System.out.println(d1 == d2); //Why is this false? Because d1 and d2 are different objects in memory, so they are not the same reference.
        System.out.println(d1.equals(d2)); //Why is this true? Because the equals method in the Double class is overridden to return true when both objects are NaN, even though they are different instances. The Double class has a special case in its equals method to handle NaN values, which is why it returns true in this case.
        System.out.println(d3 == d4); //Why is this false? Because in Java, NaN is not considered equal to any value, including itself. So when you compare two NaN values using the == operator, it will always return false, even if both operands are NaN
        System.out.println(Double.isNaN(d3)); //This will print true because d3 is NaN
        System.out.println(Double.NaN == Double.NaN); //Why is this false? Because in Java, NaN is not considered equal to any value, including itself. So when you compare two NaN values using the == operator, it will always return false, even if both operands are NaN

    }
}
