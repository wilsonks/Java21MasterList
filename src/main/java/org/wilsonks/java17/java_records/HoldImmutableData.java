/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : HoldImmutableData.java
 *  * Created On : 2026-06-03 11:24
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

package org.wilsonks.java17.java_records;

public class HoldImmutableData {

    public static String DESCRIPTION = """
            DESCRIPTION:

        This class demonstrates the use of Java records to hold immutable data.
        Records in Java are a special type of class that are designed to be simple data carriers.
        They automatically generate constructors, getters, equals, hashCode, and toString methods based on their components.
        By using records, we can create immutable objects with less boilerplate code, making our code cleaner and easier to maintain.
    """;

    record Employee(String firstName, String lastName, int salary) {
    }

    public static void main(String[] args) {
            System.out.println(DESCRIPTION);
            // Using a record to hold immutable data
            Employee emp1 = new Employee("John", "Doe", 50000);
            Employee emp2 = new Employee("Jane", "Smith", 60000);

            //No setters are generated for records, so we cannot modify the state of emp1 or emp2 after they are created.


    }
}
