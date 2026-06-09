/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : PredicateInstanceMethod_test.java
 *  * Created On : 2026-06-09 10:12
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

package org.wilsonks.java11_2018.new_Pattern_class_methods;

import java.util.function.Predicate;

public class PredicateInstanceMethod_test {

     public static void main(String[] args) {
         Predicate<String> isEmptyPredicate = String::isEmpty;
         Predicate<String> isNotEmptyPredicate = isEmptyPredicate.negate();

         System.out.println(isEmptyPredicate.test("")); // true
         System.out.println(isEmptyPredicate.test("Hello")); // false
         System.out.println(isNotEmptyPredicate.test("Hello"));
     }
}
