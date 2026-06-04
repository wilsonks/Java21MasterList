/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : SingleNumberPrime.java
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

public class SingleNumberPrime {

    public static boolean isPrime(int number) {
        //corner case
        if(number <= 1 ) return false; //why because prime numbers are defined as greater than 1
        //Check from 2 to number/2 or Math.sqrt(number)
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }
    //Driver Program
    public static void main(String[] args) {
        System.out.println("Is 2 prime? " + isPrime(2)); // true
        System.out.println("Is 3 prime? " + isPrime(3)); // true
        System.out.println("Is 4 prime? " + isPrime(4)); // false
        System.out.println("Is 5 prime? " + isPrime(5)); // true
        System.out.println("Is 6 prime? " + isPrime(6)); // false
        System.out.println("Is 7 prime? " + isPrime(7)); // true
        System.out.println("Is 8 prime? " + isPrime(8)); // false
        System.out.println("Is 9 prime? " + isPrime(9)); // false
    }
}
