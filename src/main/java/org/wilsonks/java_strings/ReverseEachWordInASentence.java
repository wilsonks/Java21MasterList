/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : ReverseEachWordInASentence.java
 *  * Created On : 2026-06-04 08:56
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

package org.wilsonks.java_strings;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseEachWordInASentence {

    public static String reverseString(String str) {
        var result = IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(str.length() - i - 1))
                .map(ch -> String.valueOf(ch))
                .collect(Collectors.joining());
        return result;
    }

    public static String reverseSentence(String sentence) {
        var result = Arrays.stream(sentence.split(" "))
                .map(word -> reverseString(word))
                .collect(Collectors.joining(" "));
        return result;
    }

    public static void main(String[] args) {
        String sentence = "Hello World!";

        var result = reverseSentence(sentence);

        System.out.println("Original sentence:" + sentence);
        System.out.println("Reversed sentence:" + result);

    }
}
