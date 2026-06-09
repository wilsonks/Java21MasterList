/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : StringInstanceMethodisBlank.java
 *  * Created On : 2026-06-09 09:29
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

public class StringInstanceMethod_isBlank {

    public static void main(String[] args) {
        String str1 = "   ";
        String str2 = "Hello";
        String str3 = "";

        System.out.println("str1 is blank: " + str1.isBlank());
        System.out.println("str2 is blank: " + str2.isBlank());
        System.out.println("str3 is blank: " + str3.isBlank());
    }
}
