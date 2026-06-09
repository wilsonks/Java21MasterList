/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : StringInstanceMethod_repeat.java
 *  * Created On : 2026-06-09 09:33
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

public class StringInstanceMethod_repeat {

    public static void main(String[] args) {
        String original = "Hello ";
        String repeated = original.repeat(3);
        System.out.println(repeated); // Output: Hello Hello Hello
    }
}