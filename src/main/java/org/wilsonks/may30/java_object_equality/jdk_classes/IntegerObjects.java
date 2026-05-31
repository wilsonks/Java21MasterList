package org.wilsonks.may30.java_object_equality.jdk_classes;

public class IntegerObjects {
    public static void main(String[] args) {
        Integer i1 = 100;
        Integer i2 = 100;

        System.out.println(i1 == i2); // true because of integer caching for values between -128 and 127
        System.out.println(i1.equals(i2)); // true because the equals method compares the values of the Integer objects

        Integer i3 = 128;
        Integer i4 = 128;

        System.out.println(i3 == i4); // false because values outside the cache range are not cached, so i3 and i4 refer to different objects
        System.out.println(i3.equals(i4)); // true because the equals method compares the values of the Integer objects
    }
}
