/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : InsideStreams.java
 *  * Created On : 2026-06-23 07:56
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

import java.util.List;
import java.util.Arrays;

public class InsideStreams {
    public static void main(String[] args) {
        // Example of using a lambda expression inside a stream operation
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Using a stream to filter and print names that start with 'A'
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}
