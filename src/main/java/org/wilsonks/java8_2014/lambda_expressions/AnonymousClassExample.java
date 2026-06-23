/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : AnonymousClassExample.java
 *  * Created On : 2026-06-23 07:50
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

public class AnonymousClassExample {
    public static void main(String[] args) {
        // Using an anonymous class to implement the Runnable interface
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from the anonymous class!");
            }
        };

        // Start a new thread with the anonymous class
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
