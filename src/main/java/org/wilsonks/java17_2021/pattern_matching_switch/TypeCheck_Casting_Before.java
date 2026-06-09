/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : TypeCheck_Casting_Before.java
 *  * Created On : 2026-06-03 11:48
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

package org.wilsonks.java17_2021.pattern_matching_switch;


public class TypeCheck_Casting_Before {

    static void checkTypeBefore(Object source) {
        if(source instanceof Integer) {
            Integer intValue = (Integer) source;
            System.out.println("Integer value: " + intValue);
        }
        if(source instanceof String) {
            String string = (String) source;
            System.out.println("String value: " + string);
        }
    }


    public static void main(String[] args) {
        Object obj1 = 10;
        Object obj2 = "Java";
        checkTypeBefore(obj1); // Output: Integer value: 10
        checkTypeBefore(obj2); // No output, as obj2 is not an Integer




    }
}
