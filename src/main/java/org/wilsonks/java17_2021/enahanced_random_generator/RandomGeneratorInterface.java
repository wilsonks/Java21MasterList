/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : RandomGeneratorInterface.java
 *  * Created On : 2026-06-03 11:58
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

package org.wilsonks.java17_2021.enahanced_random_generator;

import java.util.random.RandomGenerator;

public class RandomGeneratorInterface {

    public static String DESCRIPTION = """
        DESCRIPTION:
      
        This class demonstrates the use of the RandomGenerator interface, which provides a more flexible and powerful way to generate random numbers in Java. 
        The RandomGenerator interface allows for different implementations of random number generators, such as L64X128MixRandom, which can be used for better performance and randomness quality. 
        In this example, we use the default random generator to generate a random integer between 0 and 99 and print it to the console.
    """;

    public static void main(String[] args) {
            System.out.println(DESCRIPTION);
            RandomGenerator randomGenerator1 = RandomGenerator.getDefault();
            RandomGenerator randomGenerator2 = RandomGenerator.of("L64X128MixRandom");
            RandomGenerator randomGenerator3 = RandomGenerator.of("L32X64MixRandom");

            int randomInt = randomGenerator1.nextInt(100);
            System.out.println("Random integer between 0 and 99: " + randomInt);

            int randomInt2 = randomGenerator2.nextInt(100);
            System.out.println("Random integer between 0 and 99: " + randomInt2);

            int randomInt3 = randomGenerator3.nextInt(100);
            System.out.println("Random integer between 0 and 99: " + randomInt3);
    }
}
