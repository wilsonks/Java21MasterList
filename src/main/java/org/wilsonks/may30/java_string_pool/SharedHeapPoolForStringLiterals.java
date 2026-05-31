package org.wilsonks.may30.java_string_pool;

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
