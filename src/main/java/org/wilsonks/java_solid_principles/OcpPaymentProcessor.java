/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : OCPPaymentProcessor.java
 *  * Created On : 2026-06-04 11:08
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
 *   * - Open/Closed Principle is one of the five SOLID design principle described by Robert C. Martin.
 *       It promotes the use of interfaces to enable you to adapt the functionality of your application without changing the existing code.
 *
 *  * Notes:
 *  * - In this example, we have a PaymentProcessor class that can process different payment methods.
 *      Each payment method is implemented as a separate class that implements the PaymentMethod interface.
 *      This design allows us to add new payment methods without modifying the existing code, adhering to the Open-Closed Principle.
 *  *
 *  * =============================================================================
 *
 */

package org.wilsonks.java_solid_principles;

public class OcpPaymentProcessor {

    public static String DESCRIPTION = """
         DESCRIPTION:
         The Open-Closed Principle (OCP) is a core software design concept stating that classes should be open for extension 
         but closed for modification.
            """;
    public interface PaymentMethod {
        void process(double amount);
    }
    public static class CreditCardPayment implements PaymentMethod {
        @Override
        public void process(double amount) {
            System.out.println("Processing CreditCard payment of : " + amount);
        }
    }

    public static class PayPalPayment implements PaymentMethod {
        @Override
        public void process(double amount) {
            System.out.println("Processing PayPal payment of :" + amount);
        }
    }

    public static class BankTransferPayment implements PaymentMethod {
        @Override
        public void process(double amount) {
            System.out.println("Processing Bank Transfer payment of :" + amount);
        }
    }

    public static class CryptoPayment implements PaymentMethod {
        @Override
        public void process(double amount) {
            System.out.println("Processing Crypto payment of :" + amount);
        }
    }

    public static class MobilePayment implements PaymentMethod {
        @Override
        public void process(double amount) {
            System.out.println("Processing Mobile payment of :" + amount);
        }
    }

    public static class GiftCardPayment implements PaymentMethod {
        @Override
        public void process(double amount) {
            System.out.println("Processing Gift Card payment of :" + amount);
        }
    }

    public static class ApplePayPayment implements PaymentMethod {
        @Override
        public void process(double amount) {
            System.out.println("Processing Apple Pay payment of :" + amount);
        }
    }

    public static class GooglePayPayment implements PaymentMethod {
        @Override
        public void process(double amount) {
            System.out.println("Processing Google Pay payment of :" + amount);
        }
    }

    public void executePayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.process(amount);
    }
    public static void main(String[] args) {

        OcpPaymentProcessor processor = new OcpPaymentProcessor();
        processor.executePayment(new CreditCardPayment(), 100.0);
        processor.executePayment(new PayPalPayment(), 200.0);
        processor.executePayment(new BankTransferPayment(), 300.0);
        processor.executePayment(new GiftCardPayment(), 400.0);
        processor.executePayment(new MobilePayment(), 500.0);
        processor.executePayment(new ApplePayPayment(), 600.0);
        processor.executePayment(new GooglePayPayment(), 700.0);

    }
}
