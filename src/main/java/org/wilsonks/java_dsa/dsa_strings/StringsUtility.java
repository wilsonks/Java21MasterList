/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : StringsUtils.java
 *  * Created On : 2026-06-04 10:57
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

package org.wilsonks.java_dsa.dsa_strings;

public class StringsUtility {

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

     public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedStr = reverseString(cleanedStr);
        return cleanedStr.equals(reversedStr);
    }

    public static void main(String[] args) {
        String testString = "A man, a plan, a canal, Panama";
        System.out.println(testString);
        System.out.println(isPalindrome(testString));
    }

}
