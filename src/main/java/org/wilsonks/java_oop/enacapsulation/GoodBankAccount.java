/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : GoodBankAccount.java
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

public class GoodBankAccount {

    private double balance;
    private final String accountNumber;
    private String firstName;
    private String lastName;

    GoodBankAccount(double balance, String accountNumber, String firstName, String lastName) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double balance) {
        if (balance < 0) {
            System.out.println("Balance cannot be negative.");
            return;
        }
        this.balance += balance;
    }

    public void withdraw(double balance) {
        if (balance < 0) {
            System.out.println("Balance cannot be negative.");
            return;
        }
        if (balance > this.balance) {
            System.out.println("Balance cannot be greater than balance.");
            return;
        }

        this.balance -= balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        GoodBankAccount goodBankAccount = new GoodBankAccount(200, "123", "Wilson", "Sam");
        goodBankAccount.deposit(500);
        goodBankAccount.withdraw(500);
        System.out.println("Account Full Name = " + goodBankAccount.fullName());
        System.out.println("goodBankAccount = " + goodBankAccount.accountNumber);
        System.out.println(goodBankAccount.balance);
    }
}
