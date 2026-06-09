/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : BringsControlledInheritance.java
 *  * Created On : 2026-06-03 09:54
 *  * Author     : Wilson K Sam
 *  * Copyright  : (c) 2026 Wilson K Sam
 *  * =============================================================================
 *  *
 *  * Description:
 *  * This source file is part of a coding practice project created for learning,
 *  * experimentation, interview preparation, and demonstration of software
 *  * development concepts and best practices.
 *  *
 *  * Notes:
 *  * -The sealed keyword in Java 17 allows you to restrict which classes or interfaces can extend or implement a specific superclass or interface. Before Java 17, inheritance was a binary choice: either a class was completely open to everyone (default) or entirely closed to everyone (final). sealed provides a middle ground for fine-grained inheritance control.
 *  *
 *  * =============================================================================
 *
 */

package org.wilsonks.java17_2021.sealed_classes;

public class BringsControlledInheritance {
    public static final String DESCRIPTION = """
        DESCRIPTION:
        The sealed keyword in Java 17 allows you to restrict which classes or interfaces can extend or 
        implement a specific superclass or interface. Before Java 17, inheritance was a binary choice: 
        either a class was completely open to everyone (default) or entirely closed to everyone (final). 
        sealed provides a middle ground for fine-grained inheritance control.
        
        Every permitted subclass must explicitly choose its own inheritance strategy. Subclasses cannot leave 
        their extension status ambiguous; they must use exactly one of these three modifiers:
        final: The subclass is fully closed and cannot be extended further.
        sealed: The subclass continues to restrict inheritance to its own permitted subclasses.
        non-sealed: The subclass breaks the seal and opens itself up to standard inheritance by any class.
        
        related keywords: sealed,permits,non-sealed, final, extends
        
        Strategic Benefits:
        Exhaustive Switch Statements: 
            The compiler knows every possible subclass. In pattern-matching switch expressions, you do not need a default case if you cover all permitted subclasses.
        Domain Modeling Integrity: 
            Perfect for fixed domain boundaries (e.g., a PaymentMethod that only permits CreditCard, PayPal, and BankTransfer).
        Location Constraints: 
            All permitted subclasses must reside in the same package (or the same named module) as the sealed parent class to prevent external rogue inheritance.
        
    """;

    sealed class Shape permits Circle, Rectangle, Square {
        // Common properties and methods for shapes

        public Shape() {
            // Constructor for Shape
            System.out.println("Shape constructor called");
        }
    }

    non-sealed class Circle extends Shape {
        // Implementation for Circle

        public Circle() {
            System.out.println("Circle constructor called");
        }
    }
    final class Rectangle extends Shape {
        //Implementation for Rectangle
        public Rectangle() {
            System.out.println("Rectangle constructor called");
        }

    }
    non-sealed class Square extends Shape {
        public Square() {
            System.out.println("Square constructor called");
        }
    }

     public static void main(String[] args) {
         System.out.println(DESCRIPTION);
     }

}
