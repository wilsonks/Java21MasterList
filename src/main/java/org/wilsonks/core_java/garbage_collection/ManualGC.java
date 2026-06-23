/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : ManualGC.java
 *  * Created On : 2026-06-23 10:51
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

package org.wilsonks.core_java.garbage_collection;

public class ManualGC {


    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        s1 = null; //Eligible for Garbage Collection

        //Hint JVM about garbage collection. Note: This is just a hint, not a guarantee that GC will run immediately.
        System.gc();

    }

//
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Finalize method called for ManualGC object.");
//    }
}
