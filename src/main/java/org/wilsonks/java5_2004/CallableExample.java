/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : CallableExample.java
 *  * Created On : 2026-06-09 04:52
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

package org.wilsonks.java5_2004;

import java.security.PrivilegedAction;
import java.util.concurrent.Callable;

public class CallableExample {
    public static final String HISTORY = """
            - Introduced in Java 5 as part of the java.util.concurrent package.
            - Represents a task that can return a result and may throw an exception.
            - Has a single method: V call() throws Exception;
            
            """;

    public static void main(String[] args) {
        System.out.println(HISTORY);
         Callable<String> callableTask = new Callable<String>() {
             @Override
             public String call() throws Exception {
                 return "Pre-Java8 Task Return Value";
             }
         };

        Callable<String> callableTask1 = () -> "Lambda Task Return Value";

        try {
             String result = callableTask.call();
             System.out.println(result);

             String result2 = callableTask1.call();
             System.out.println(result2);

         } catch (Exception e) {
             e.printStackTrace();
         }
    }
}
