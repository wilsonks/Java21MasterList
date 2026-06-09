/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : RecordsCannotBeInherited.java
 *  * Created On : 2026-06-03 11:40
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

public class RecordsCannotBeInherited {
    public static void main(String[] args) {
        System.out.println("""
            DESCRIPTION:
            
            This class demonstrates that Java records cannot be inherited. 
            In Java, records are a special type of class that are designed to be simple data carriers. 
            They automatically generate constructors, getters, equals, hashCode, and toString methods based on their components. 
            However, one of the key characteristics of records is that they cannot be extended or inherited from other classes. 
            This means that you cannot create a subclass of a record, and records cannot be used as a base class for inheritance. 
            This design choice emphasizes the immutability and simplicity of records, making them ideal for representing data without the complexities of inheritance.
            
            JUST FOR REPRESENTING DATA.
        """);
    }
}
