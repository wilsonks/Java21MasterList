/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : SingleNumberFindDigitsCount.java
 *  * Created On : 2026-06-04 09:33
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

package org.wilsonks.java_dsa.dsa_numbers;

public class SingleNumberFindDigitsCount {
    public static int countDigits(String number) {
        return number.length();
    }
    public static int countDigits(int number) {
        if (number == 0) return 1; // Special case for 0
        int count = 0;
        while (number != 0) {
            number /= 10; // Remove the last digit
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Number of digits in 0: " + countDigits(0)); // 1
        System.out.println("Number of digits in 1: " + countDigits(1));
        System.out.println("Number of digits in 12: " + countDigits(12));
        System.out.println("Number of digits in 123: " + countDigits(123));

        System.out.println("Number of digits in 0: " + countDigits(String.valueOf(0))); // 1
        System.out.println("Number of digits in 1: " + countDigits(String.valueOf(1)));
        System.out.println("Number of digits in 12: " + countDigits(String.valueOf(12)));
        System.out.println("Number of digits in 123: " + countDigits(String.valueOf(123)));
    }
}
