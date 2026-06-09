/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : RunnableExample.java
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

public class RunnableExample {
    public static final String HISTORY = """
            - Features exactly one abstract method - run()
            
            """;
    public static void main(String[] args) {
        System.out.println(HISTORY);
        Runnable runnableTask = new Runnable() {
            @Override
            public void run() {
                System.out.println("Pre-Java8 Syntax");
            }
        };

        new Thread(runnableTask).start();
    }
}
