/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : PatternClassMethod_compile.java
 *  * Created On : 2026-06-09 09:57
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
import java.util.regex.Pattern;

public class PatternClassMethod_compile {

    public static void main(String[] args) {
        Predicate<String> matchPredicate = Pattern.compile("\\d*Hello\\d*").asMatchPredicate();

        System.out.println(matchPredicate.test("Hello"));
        System.out.println(matchPredicate.test("43Hello34"));
        System.out.println(matchPredicate.test("1234"));

    }
}
