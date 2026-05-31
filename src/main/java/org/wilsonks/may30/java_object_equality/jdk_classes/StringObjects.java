package org.wilsonks.may30.java_object_equality.jdk_classes;

public class StringObjects {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2); //Why true because of string literal pool, both s1 and s2 refer to the same memory location where "Hello" is stored.
        System.out.println(s1.equals(s2)); //Why true because the equals method in the String class is overridden to compare the content of the strings, and since both s1 and s2 contain the same characters "Hello", it returns true.
    }
}
