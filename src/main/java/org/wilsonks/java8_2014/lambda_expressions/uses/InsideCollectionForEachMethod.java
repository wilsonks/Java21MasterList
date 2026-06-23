/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : CollectionForEachMethod.java
 *  * Created On : 2026-06-23 07:54
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

package org.wilsonks.java8_2014.lambda_expressions.uses;


public class InsideCollectionForEachMethod {
    public static void main(String[] args) {
        // Create a list of strings
        java.util.List<String> names = java.util.Arrays.asList("Alice", "Bob", "Charlie", "Diana");

        // Use the forEach method with a lambda expression to print each name
        names.forEach(name -> System.out.println(name));
    }
}
