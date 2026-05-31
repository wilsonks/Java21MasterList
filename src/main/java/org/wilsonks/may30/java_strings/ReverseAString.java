package org.wilsonks.may30.java_strings;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseAString {

    /*
        * This method takes a string as input and returns the reversed version of that string.
        * It first checks if the input string is null or empty, in which case it returns the original string.
        * It then converts the string into a character array, and uses two pointers (start and end) to swap characters until they meet in the middle.
        * Finally, it converts the character array back to a string and returns it.
        * It has O(n) time complexity and O(n) space complexity due to the creation of a new character array.
        *
        * Is there a better way ?
        *
        * 1. Using StringBuilder's reverse() method: - O(n) time complexity and O(n) space complexity due to the creation of a new StringBuilder object.
        * 2. Using recursion: - O(n) time complexity and O(n) space complexity due to the call stack used for recursion.
        * 3. Using Java 8 Streams: - O(n) time complexity and O(n) space complexity due to the creation of a new String object from the stream.
        *
     */
    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(chars);
    }

    // Using StringBuilder's reverse() method
    public static String reverseStringUsingStringBuilder(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return new StringBuilder(str).reverse().toString();
    }

    //Using recursion
    /*
Phase 1: Winding Down (The Call Stack Building Up)
Each method call pauses and waits for the next inner method call to return a value.
    [Call Stack Depth]
        Level 1: reverseStringUsingRecursion("Java")
           │      ↳ Requires: reverseStringUsingRecursion("ava") + 'J'
           ▼
        Level 2:   reverseStringUsingRecursion("ava")
           │        ↳ Requires: reverseStringUsingRecursion("va") + 'a'
           ▼
        Level 3:     reverseStringUsingRecursion("va")
           │          ↳ Requires: reverseStringUsingRecursion("a") + 'v'
           ▼
        Level 4:       reverseStringUsingRecursion("a")
           │            ↳ Requires: reverseStringUsingRecursion("") + 'a'
           ▼
        Level 5:         reverseStringUsingRecursion("") ──► [BASE CASE HIT]

Phase 2: Unwinding (Popping Off the Stack & Concatenating)
        Level 5: Returns ""
           │
           ▼ (Evaluates: "" + 'a')
        Level 4: Returns "a"
           │
           ▼ (Evaluates: "a" + 'v')
        Level 3: Returns "av"
           │
           ▼ (Evaluates: "av" + 'a')
        Level 2: Returns "ava"
           │
           ▼ (Evaluates: "ava" + 'J')
        Level 1: Returns "avaJ" ──► [FINAL OUTPUT]


     */
    public static String reverseStringUsingRecursion(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return reverseStringUsingRecursion(str.substring(1)) + str.charAt(0);
    }

    //Using IntStream Index Mapping
    //generate a stream of character indices in descending order and map them back to characters
    public static String reverseStringUsingStream1(String str) {
        return IntStream.range(0, str.length()) //Take the Int Stream
                .mapToObj(i -> str.charAt(str.length() - i - 1))//To Character
                .map(i -> String.valueOf(i)) //To String
                .collect(Collectors.joining()); //Collect By Join
    }

    //Method 2: Using Stream Reduce
    public static String reverseStringUsingStream2(String str) {
        var result = str.chars()
                .mapToObj(i ->  (char)i)
                .map(i -> String.valueOf(i))
                .reduce("", (res, b) -> b + res);

        return result;
    }




    public static void main(String[] args) {
        String str = "java";
        String reversedStr = reverseString(str);
        String reversedStr2 = reverseStringUsingStringBuilder(str);
        String reversedStr3 = reverseStringUsingRecursion(str);
        String reversedStr4 = reverseStringUsingStream1(str);
        String reversedStr5 = reverseStringUsingStream2(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
        System.out.println("Reversed String: " + reversedStr2);
        System.out.println("Reversed String: " + reversedStr3);
        System.out.println("Reversed String: " + reversedStr4);
        System.out.println("Reversed String: " + reversedStr5);
    }
}
