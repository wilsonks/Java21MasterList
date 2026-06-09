/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : AutoGenGettersSetters.java
 *  * Created On : 2026-06-03 11:17
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

package org.wilsonks.java17_2021.java_records;

public class AutoGenGetters {
    public static String DESCRIPTION = """
        DESCRIPTION:
        
        This class demonstrates the use of Java records, which automatically generate getters and other methods. 
        In this example, we define a record called Person with two components: name and age. 
        The record automatically generates a constructor, getters for each component, and other methods like equals, hashCode, and toString. 
        This allows us to create immutable data carriers with minimal boilerplate code, making our code cleaner and more maintainable.
    """;

    record Person(String name, int age) {
    }

    public static void main(String[] args) {
        System.out.println(DESCRIPTION);
        Person person = new Person("Wilsonk", 30);
        System.out.println(person.name);
        System.out.println(person.age);
    }


}
