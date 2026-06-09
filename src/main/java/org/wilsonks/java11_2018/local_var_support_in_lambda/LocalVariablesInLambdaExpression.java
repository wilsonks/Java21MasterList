/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : LocalVariablesInLambda.java
 *  * Created On : 2026-06-09 11:28
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

package org.wilsonks.java11_2018.local_var_support_in_lambda;

public class LocalVariablesInLambdaExpression {

    public static void main(String[] args) {
        int multiplier = 2;

        // Using a lambda expression that captures the local variable 'multiplier'
        java.util.function.Function<Integer, Integer> multiply = (Integer x) -> x * multiplier;

        // Testing the lambda function
        System.out.println(multiply.apply(5)); // Output: 10
    }
}
