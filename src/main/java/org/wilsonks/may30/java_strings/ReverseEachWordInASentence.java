package org.wilsonks.may30.java_strings;

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
