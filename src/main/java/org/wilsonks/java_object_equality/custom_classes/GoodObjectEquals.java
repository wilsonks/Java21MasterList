/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : GoodObjectEquals.java
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

import java.util.Objects;

public class GoodObjectEquals {
    public static void main(String[] args) {
        GoodEmployee employee1 = new GoodEmployee(1L, "John Doe");
        GoodEmployee employee2 = new GoodEmployee(1L, "John Doe");

        System.out.println("employee1 == employee2: " + (employee1 == employee2)); // false because employee1 and employee2 are different objects in memory
        System.out.println("employee1.equals(employee2): " + (employee1.equals(employee2)));  //

    }
}


class GoodEmployee  {
    private final Long id;
    private String name;

    GoodEmployee(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if both references point to the same object
        if (obj == null || getClass() != obj.getClass()) return false; // Check if the other object is null or of a different class

        GoodEmployee employee = (GoodEmployee) obj; // Cast the object to Employee

        // Compare the id and name fields for equality
        return id.equals(employee.id) && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}