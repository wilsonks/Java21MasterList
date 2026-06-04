/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : DefaultObjectEquals.java
 *  * Created On : 2026-06-04 08:56
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

package org.wilsonks.java_object_equality.custom_classes;

public class DefaultObjectEquals {
    public static void main(String[] args) {
        Employee e1 = new Employee(1L, "John Doe");
        Employee e2 = new Employee(1L, "John Doe");

        System.out.println("e1 == e2: " + (e1 == e2)); // false because e1 and e2 are different objects in memory
        System.out.println("e1.equals(e2): " + (e1.equals(e2)));  // false because the default equals method compares object references, not content
    }
}

class Employee {
    private final Long id;
    private final String name;

    public Employee(Long id, String name) {
        this.id = id;
        this.name = name;
    }

}