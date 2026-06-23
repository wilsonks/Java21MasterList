/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : LambdaExpressionExample.java
 *  * Created On : 2026-06-23 07:52
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

package org.wilsonks.java8_2014.lambda_expressions;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        // Using a lambda expression to implement the Runnable interface
        Runnable runnable = () -> System.out.println("Hello from the lambda expression!");

        // Start a new thread with the lambda expression
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
