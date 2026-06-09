/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : ModernSwitch.java
 *  * Created On : 2026-06-03 11:56
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

public class SwitchAcceptsPatternVariables {

    static void checkType(Object source) {
        switch (source) {
            case Integer intValue -> System.out.println("Integer value: " + intValue);
            case String string -> System.out.println("String value: " + string);
            default -> System.out.println("Unknown type");
        }
    }

    public static void main(String[] args) {
        Object obj1 = 10;
        Object obj2 = "Java";
        checkType(obj1); // Output: Integer value: 10
        checkType(obj2); // Output: String value: Java
    }
}
