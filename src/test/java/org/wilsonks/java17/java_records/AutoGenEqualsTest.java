/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : DefaultEqualMethodTest.java
 *  * Created On : 2026-06-03 11:04
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

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoGenEqualsTest {

    @Test
    void testEqualMethod() {
        AutoGenEquals.Person person1 = new AutoGenEquals.Person("John", 25);
        AutoGenEquals.Person person2 = new AutoGenEquals.Person("John", 25);

        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);

        assertEquals(person1, person2);
    }

}