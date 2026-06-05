/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : LiskovSubstitutionPrinciple.java
 *  * Created On : 2026-06-04 12:50
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
 *   * -The principle defines that objects of a superclass shall be replaceable with objects of its subclasses without
 *      breaking the application. That requires the objects of your subclasses to behave in the same way as the objects
 *      of your superclass.
 *      This requires all subclasses to behave in the same way as the parent class.
 *      To achieve that, your subclasses need to follow these rules:
            Don’t implement any stricter validation rules on input parameters than implemented by the parent class.
            Apply at the least the same rules to all output parameters as applied by the parent class.
*
 *  * Notes:
 *  * - Unfortunately, there is no easy way to enforce this principle.
 *      It is up to the developer to ensure that their subclasses can be substituted for their superclasses without
 *      breaking the application. This is often achieved through careful design and testing.
 *  *
 *  * =============================================================================
 *
 */

package org.wilsonks.java_solid_principles;

public class LiskovSubstitutionPrinciple {

    public static void main(String[] args) {
        // Example of Liskov Substitution Principle


    }
}
