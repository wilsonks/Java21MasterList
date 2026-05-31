package org.wilsonks.may30.java_oop.polymorphism;


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