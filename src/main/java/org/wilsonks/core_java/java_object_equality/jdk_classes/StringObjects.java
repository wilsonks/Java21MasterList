/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : StringObjects.java
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

public class StringObjects {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2); //Why true because of string literal pool, both s1 and s2 refer to the same memory location where "Hello" is stored.
        System.out.println(s1.equals(s2)); //Why true because the equals method in the String class is overridden to compare the content of the strings, and since both s1 and s2 contain the same characters "Hello", it returns true.
    }
}
