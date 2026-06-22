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

import java.util.function.BiFunction;
import java.util.function.Function;
import lombok.NonNull;

public class LocalVariablesInLambdaExpression {

    public static void main(String[] args) {
        int multiplier = 2;

        // Using a lambda expression that captures the local variable 'multiplier'
        //Why use of var in Lambda
        //1. Improves Syntax
        //2. Consistency between formal parameters and lambda paraters
        Function<Integer, Integer> multiplyBy = (var x) -> x * multiplier;
        BiFunction<Integer, Integer, Integer> sumOf = (@NonNull var x,@NonNull var y) -> x + y;

        // Testing the lambda function
        System.out.println(multiplyBy.apply(5)); // Output: 10
        System.out.println(sumOf.apply(0, 10)); //Output: 20
    }
}
