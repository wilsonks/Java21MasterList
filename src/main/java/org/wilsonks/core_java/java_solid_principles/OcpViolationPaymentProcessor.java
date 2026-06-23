/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : OcpViolationPaymentProcessor.java
 *  * Created On : 2026-06-22 20:05
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

package org.wilsonks.core_java.java_solid_principles;

public class OcpViolationPaymentProcessor {

    public void processPayment(String paymentType, double amount) {
        if (paymentType.equals("CreditCard")) {
            System.out.println("Processing credit card payment of $" + amount);
        } else if (paymentType.equals("PayPal")) {
            System.out.println("Processing PayPal payment of $" + amount);
        } else {
            System.out.println("Unsupported payment type: " + paymentType);
        }
    }

    public static void main(String[] args) {
        OcpViolationPaymentProcessor processor = new OcpViolationPaymentProcessor();
        processor.processPayment("CreditCard", 100.0); // Output: Processing credit card payment of $100.0
        processor.processPayment("PayPal", 200.0); // Output: Processing PayPal payment of $200.0
        processor.processPayment("Bitcoin", 300.0); // Output: Unsupported payment type:

    }
}
