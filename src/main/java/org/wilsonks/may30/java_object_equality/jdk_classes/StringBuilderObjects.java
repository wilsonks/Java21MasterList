package org.wilsonks.may30.java_object_equality.jdk_classes;

public class StringBuilderObjects {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");

        //StringBuilder does not override equals method, so it uses the default implementation from Object class, which compares memory addresses (references) of the objects.
        System.out.println(sb1 == sb2); //This will print false because sb1 and sb2 are different objects in memory, so they are not the same reference.
        System.out.println(sb1.equals(sb2)); //This will also print false because the equals method in StringBuilder is not overridden to compare the content of the StringBuilder objects, so it behaves the same as the == operator and compares references instead of content.

    }
}
