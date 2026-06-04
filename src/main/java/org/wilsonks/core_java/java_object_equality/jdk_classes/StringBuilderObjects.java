/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : StringBuilderObjects.java
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

public class StringBuilderObjects {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");

        //StringBuilder does not override equals method, so it uses the default implementation from Object class, which compares memory addresses (references) of the objects.
        System.out.println(sb1 == sb2); //This will print false because sb1 and sb2 are different objects in memory, so they are not the same reference.
        System.out.println(sb1.equals(sb2)); //This will also print false because the equals method in StringBuilder is not overridden to compare the content of the StringBuilder objects, so it behaves the same as the == operator and compares references instead of content.

    }
}
