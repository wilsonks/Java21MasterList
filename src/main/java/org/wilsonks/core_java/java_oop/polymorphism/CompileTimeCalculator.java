/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : CompileTimeCalculator.java
 *  * Created On : 2026-06-22 20:05
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

package org.wilsonks.core_java.java_oop.polymorphism;

public class CompileTimeCalculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }


    public static void main(String[] args) {
        CompileTimeCalculator calc = new CompileTimeCalculator();
        System.out.println(calc.add(1, 2));
        System.out.println(calc.add(1.0, 2.0));
    }
}
