/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : CustomInterfaceLambda.java
 *  * Created On : 2026-06-23 07:53
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

public class CustomInterfaceLambda {
    @FunctionalInterface
    interface MyFunctionalInterface {
        void execute();
    }

    public static void main(String[] args) {
        // Using a lambda expression to implement the custom functional interface
        MyFunctionalInterface myFunc = () -> System.out.println("Hello from the custom functional interface!");

        // Call the method defined in the functional interface
        myFunc.execute();
    }
}
