/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : SolidPrinciples.java
 *  * Created On : 2026-06-04 11:06
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

package org.wilsonks.java_solid_principles;

public class SolidPrinciples {

    public static String SRP = """
        Single Responsibility Principle (SRP):
        A class should have only one reason to change, meaning it should have only one responsibility.
        This promotes separation of concerns and makes the code easier to maintain.
        Example: IntUtility, StringUtility, FileUtility, etc. Each class should handle a specific type of functionality.
        
    """;

    public static String OCP = """
        Open/Closed Principle (OCP):
        Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
        This means you should be able to add new functionality without changing existing code.
        Example: Using interfaces or abstract classes to allow new implementations without modifying existing code.
    """;

    public static String LSP = """
        Liskov Substitution Principle (LSP):
        Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.
        This ensures that subclasses can stand in for their parent classes without causing issues.
    """;

    public static String ISP = """
        Interface Segregation Principle (ISP):
        Clients should not be forced to depend on interfaces they do not use.
        This encourages the creation of smaller, more specific interfaces rather than large, general ones.
    """;

    public static String DIP = """
        Dependency Inversion Principle (DIP):
        High-level modules should not depend on low-level modules. Both should depend on abstractions.
        Abstractions should not depend on details. Details should depend on abstractions.
        This promotes loose coupling and makes the code more flexible and easier to maintain.
    """;

    public static void main(String[] args) {
        System.out.println("Welcome to the SOLID Principles in Java!");
        System.out.println("""
                The solid principles are a set of best practices, transformed into a set of rules after dozens of years of 
                cumulative development experience around the world done by software professionals. Those are the insights 
                that senior developers reached after decades of developing complex, enterprise-grade software. Although 
                popularized and named by Robert C. Martin they were known and used by lots of senior developers around 
                the world. In essence, the purpose of those principles is to allow developers to write better software.
                 The software is easier and cheaper to maintain, easier to understand, faster to develop in a team, 
                 and easier to test. Following those principles doesn’t guarantee success, but avoiding them will lead 
                 in most cases to at least sub-optimal results in terms of functionality, cost, or both.
                """);

        System.out.println("SOLID Principles in Java:");
        System.out.println("1. Single Responsibility Principle (SRP)");
        System.out.println(SRP);
        System.out.println("2. Open/Closed Principle (OCP)");
        System.out.println(OCP);
        System.out.println("3. Liskov Substitution Principle (LSP)");
        System.out.println(LSP);
        System.out.println("4. Interface Segregation Principle (ISP)");
        System.out.println(ISP);
        System.out.println("5. Dependency Inversion Principle (DIP)");
        System.out.println(DIP);
    }
}
