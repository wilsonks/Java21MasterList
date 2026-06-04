/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : SharedHeapPoolForStringLiterals.java
 *  * Created On : 2026-06-04 10:33
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

package org.wilsonks.core_java.java_strings.java_string_pool;

/*
Heap
 ├── Young Generation
 ├── Old Generation
 └── String Pool
 */
class SharedHeapPoolForStringLiterals {
    public static void main(String[] args) {
        String s1 = "SUCCESS";
        String s2 = "SUCCESS";
        String s3 = new String("SUCCESS");
        String s4 = new String("SUCCESS");
        StringBuffer s5 = new StringBuffer("SUCCESS");

        System.out.println(s1 == s2); //True: Because Reuse Heap
        System.out.println(s1 == s3); //False: S3 is in Young Gen Heap
        System.out.println(s1 == s3.intern()); //True
        System.out.println(s1 == s4.intern());//True
        System.out.println(s1 == String.valueOf(s5).intern());//True
    }
}
