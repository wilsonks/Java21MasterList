/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : InterfaceEngineClass.java
 *  * Created On : 2026-06-22 20:05
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

package org.wilsonks.core_java.java_oop.abstraction;

public class InterfaceEngineClass {
    public static void main(String[] args) {
        Engine.displayInfo();

        Car car = new Car();
        car.engine();
        car.startEngine();
        car.stopEngine();
    }
}

class Car implements Engine {
    @Override
    public void engine() {
        System.out.println("Car Engine Implementation ...");
    }
}

/*

 */

interface Engine {
    //NO CONSTRUCTORS - Why ? Because interfaces cannot be instantiated directly.
    // They are meant to be implemented by classes, and the implementing classes provide the actual behavior
    // for the methods defined in the interface. Since interfaces only declare method signatures and constants,
    // they do not have constructors like regular classes do.

    //Instance Variables - Only Constants Why ? Because interfaces can only contain constants (static final variables)
    // and method signatures.
    String MANUFACTURER = "Manufacturer";
    String MODEL = "Model";

    static void displayInfo() {
        System.out.println("Manufacturer : " + MANUFACTURER);
        System.out.println("Model : " + MODEL);
    }


    default void startEngine() {
        System.out.println("Starting engine ...");
    }
    default void stopEngine() {
        System.out.println("Stopping engine ...");
    }
    void engine();
}
