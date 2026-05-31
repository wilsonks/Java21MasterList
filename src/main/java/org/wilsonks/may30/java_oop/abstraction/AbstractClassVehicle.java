package org.wilsonks.may30.java_oop.abstraction;

public class AbstractClassVehicle {
    public static void main(String[] args) {

    }
}

/*
WHAT SOMETHING IS
 */
abstract class Vehicle {

    //Can maintain state.
    protected String make;
    protected String model;
    protected int year;

    //    Can have both abstract and concrete methods.
    abstract void startEngine();
    abstract void stopEngine();

    void displayInfo() {
        System.out.println(year + " " + make + " " + model);
    }
}

