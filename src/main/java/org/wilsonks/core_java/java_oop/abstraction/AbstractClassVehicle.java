/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : AbstractClassVehicle.java
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

