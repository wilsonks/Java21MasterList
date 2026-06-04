/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : SpringBootPayment.java
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

package org.wilsonks.java_oop.polymorphism;


public class SpringBootPayment {


    public static void main(String[] args) {
        Payment cardPayment = new CardPayment();
        cardPayment.pay();

        Payment upiPayment = new UpiPayment();
        upiPayment.pay();

    }
}

interface Payment {
    void pay();
}

class  UpiPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Pay upi");
    }
}

class CardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Pay card");
    }
}