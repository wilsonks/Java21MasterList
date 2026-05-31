package org.wilsonks.may30.java_oop.polymorphism;

public class CompileTimeCalculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }


    public static void main(String[] args) {
        CompileTimeCalculator calc = new CompileTimeCalculator();
        System.out.println(calc.add(1, 2));
        System.out.println(calc.add(1.0, 2.0));
    }
}
