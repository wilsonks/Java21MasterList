/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : DuratonClassMethod.java
 *  * Created On : 2026-06-09 11:30
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

package org.wilsonks.java11_2018.Duration_class_methods;

import java.time.Duration;

public class DurationClassMethod {

     public static void main(String[] args) {
         System.out.println(Duration.ofDays(1)); // PT24H
         System.out.println(Duration.ofHours(2)); // PT2H
         System.out.println(Duration.ofMinutes(30)); // PT30M
         System.out.println(Duration.ofSeconds(45)); // PT45S
         System.out.println(Duration.ofMillis(500)); // PT0.5S
         System.out.println(Duration.ofNanos(1000000000)); // PT1S
     }
}
