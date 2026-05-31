package org.wilsonks.may30.java_object_equality.jdk_primitives;

public class IntegerPrimitive {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // Direct comparison using ==
        System.out.println("Using == : " + (a == b)); // This will print true because for primitive types, == compares the actual values.
    }
}
