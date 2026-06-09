/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : StringInstanceMethod_lines.java
 *  * Created On : 2026-06-09 09:31
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

package org.wilsonks.java11_2018.new_String_instance_methods;

public class StringInstanceMethod_lines {

    public static void main(String[] args) {
        String multiLineString = "This is line 1\nThis is line 2\nThis is line 3";
        multiLineString.lines().forEach(System.out::println);
    }
}
