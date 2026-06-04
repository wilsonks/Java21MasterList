/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : BigDecimalObjects.java
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

package org.wilsonks.java_object_equality.jdk_classes;

import java.math.BigDecimal;

public class BigDecimalObjects {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.2");
        BigDecimal c = new BigDecimal("0.3");

        System.out.println(a.add(b) == c); // false because a.add(b) creates a new BigDecimal object that is not the same reference as c
        System.out.println(a.add(b).equals(c)); // true because the equals method of BigDecimal compares the values, and a.add(b) results in a BigDecimal that is equal to c

    }
}
