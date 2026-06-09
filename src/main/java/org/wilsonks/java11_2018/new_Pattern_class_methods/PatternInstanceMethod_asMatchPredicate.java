/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : PatternInstanceMethod_asMatchPredicate.java
 *  * Created On : 2026-06-09 10:15
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

public class PatternInstanceMethod_asMatchPredicate {

     public static void main(String[] args) {
         var matchPredicate = java.util.regex.Pattern.compile("\\d*Hello\\d*").asMatchPredicate();

         System.out.println(matchPredicate.test("Hello"));
         System.out.println(matchPredicate.test("43Hello34"));
         System.out.println(matchPredicate.test("1234"));

     }
}
