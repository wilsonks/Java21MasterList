package org.wilsonks.may30.java_primitives;

public class PrimitiveSizesInBytes {
    public static void main(String[] args) {
        System.out.println("Byte: " + Byte.BYTES + " byte");
        System.out.println("Byte: " + Byte.SIZE + " bits");

        System.out.println("Short: " + Short.BYTES + " bytes");
        System.out.println("Short: " + Short.SIZE + " bits");

        System.out.println("Character: " + Character.BYTES + " bytes");
        System.out.println("Character: " + Character.SIZE + " bits");

        System.out.println("Integer: " + Integer.BYTES + " bytes");
        System.out.println("Integer: " + Integer.SIZE + " bits");

        System.out.println("Long: " + Long.BYTES + " bytes");
        System.out.println("Long: " + Long.SIZE + " bits");

        System.out.println("Float: " + Float.BYTES + " bytes");
        System.out.println("Float: " + Float.SIZE + " bits");

        System.out.println("Double: " + Double.BYTES + " bytes");
        System.out.println("Double: " + Double.SIZE + " bits");

        System.out.println("Boolean: " + "1 bit (not precisely defined in Java)");
    }
}
