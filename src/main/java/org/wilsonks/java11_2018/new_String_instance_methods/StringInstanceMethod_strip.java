/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : StringInstanceMethod_stripLeading.java
 *  * Created On : 2026-06-09 09:34
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

package org.wilsonks.java11_2018.new_String_instance_methods;

public class StringInstanceMethod_strip {

    public static void main(String[] args) {
        String stringWithLeadingSpaces = "   Hello, World!";
        String strippedString = stringWithLeadingSpaces.stripLeading();
        System.out.println("Original: '" + stringWithLeadingSpaces + "'");
        System.out.println("Stripped: '" + strippedString + "'");

        String stringWithTrailingSpaces = "Hello, World!   ";
        String strippedTrailingString = stringWithTrailingSpaces.stripTrailing();
        System.out.println("Original: '" + stringWithTrailingSpaces + "'");
        System.out.println("Stripped Trailing: '" + strippedTrailingString + "'");

        String stringWithLeadingAndTrailingSpaces = "   Hello, World!   ";
        String fullyStrippedString = stringWithLeadingAndTrailingSpaces.strip();
        System.out.println("Original: '" + stringWithLeadingAndTrailingSpaces + "'");
        System.out.println("Fully Stripped: '" + fullyStrippedString + "'");
    }
}
