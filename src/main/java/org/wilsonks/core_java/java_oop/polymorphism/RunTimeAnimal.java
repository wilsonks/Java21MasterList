/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : RunTimeAnimal.java
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

package org.wilsonks.core_java.java_oop.polymorphism;


public class RunTimeAnimal {

    public void sound(){
        System.out.println("I'm Animal");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        //The JVM checks the actual object type and invokes method at run time
        animal.sound();

        Animal animal1 = new Dog();
        //The JVM checks the actual object type and invokes method at run time
        animal1.sound();

        Animal animal2 = new Cat();
        //The JVM checks the actual object type and invokes method at run time
        animal2.sound();
    }
}

class Animal{
    public void sound(){
        System.out.println("I'm Animal");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Bark");
    }
}

class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meow");
    }
}