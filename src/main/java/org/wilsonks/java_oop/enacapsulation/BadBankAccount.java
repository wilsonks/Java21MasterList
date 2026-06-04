/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : BadBankAccount.java
 *  * Created On : 2026-06-04 08:56
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

package org.wilsonks.java_oop.enacapsulation;

public class BadBankAccount {

    public double balance;

    public static void main(String[] args) {
        BadBankAccount badBankAccount = new BadBankAccount();
        badBankAccount.balance = -100;

        System.out.println("Now the account has an invalid balance.");
        System.out.println(badBankAccount.balance);
    }
}
