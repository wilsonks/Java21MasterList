package org.wilsonks.may30.java_oop.enacapsulation;

public class BadBankAccount {

    public double balance;

    public static void main(String[] args) {
        BadBankAccount badBankAccount = new BadBankAccount();
        badBankAccount.balance = -100;

        System.out.println("Now the account has an invalid balance.");
        System.out.println(badBankAccount.balance);
    }
}
