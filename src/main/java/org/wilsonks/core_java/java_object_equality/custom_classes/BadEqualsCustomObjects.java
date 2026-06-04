/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : BadEqualsCustomObjects.java
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

package org.wilsonks.core_java.java_object_equality.custom_classes;

public class BadEqualsCustomObjects {
    public static void main(String[] args) {
        BadEmployee e1 = new BadEmployee("John", "Doe");

        System.out.println(e1 == e1);
        System.out.println(e1.equals(e1));

    }
}

class BadEmployee {
    private String firstName;
    private String lastName;
    public BadEmployee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }


}