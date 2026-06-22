/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : StringInstanceMethodisBlank.java
 *  * Created On : 2026-06-09 09:29
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

package org.wilsonks.java11_2018.new_String_instance_methods;

import java.util.Optional;

public class StringInstanceMethod_isBlank {

    public static void main(String[] args) {
        //.isBlank()
        System.out.println("  ".isBlank()); //true
        System.out.println("".isBlank()); //true
        //.strip(), .stripLeading(), .stripTrailing()
        //Purpose: Removes leading and trailing whitespace, including Unicode whitespace.
        //Difference from trim(): trim() only removes ASCII whitespace, while strip()
        //handles Unicode whitespace.
        System.out.println(" Hello World ".strip());//"Hello World"
        System.out.println("  Hello World".stripLeading()); //"Hello World"
        System.out.println("Hello World   ".stripTrailing()); //"Hello World"
        //repeat(int count)
        //● Purpose: Repeats the string a specified number of times.
        System.out.println("Hello".repeat(2));//HelloHello
        //lines()
        //● Purpose: Converts the string into a Stream<String> of lines, split by line terminators
        System.out.println("Line1\nLine2\nLine3\nLine4".lines().toList());//[Line1, Line2, Line3, Line4]
        //transform(Function <String, R> fn)
        //● Purpose: Applies a transformation function to the string.
        System.out.println(Optional.of("hello world".transform(str -> Character.toUpperCase(str.charAt(0)) + str.substring(1))).get()); //Hello world

        //chars() and codePoints()
        //chars(): Returns an IntStream of the string's UTF-16 code units.
        //codePoints(): Returns an IntStream of the string's Unicode code points.
        "abcd".chars().forEach(System.out::println);//97,98,99,100
    }

}
