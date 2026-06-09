/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : README.java
 *  * Created On : 2026-06-09 11:58
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

package org.wilsonks.java8_2014.java_time_package.before_java8;

public class ReadMeForJavaUtilDate {
    public static final String README = """
            Before Java 8, the primary classes for handling dates and times were `java.util.Date` and `java.util.Calendar`. 
            These classes had several design flaws and limitations, such as being mutable, not being thread-safe, and having a confusing API. 
            For example, the `Date` class had methods that were deprecated and did not provide a clear way to represent different time zones or perform date arithmetic.
            
            The `Calendar` class was an improvement over `Date`, but it was still complex and difficult to use correctly. 
            It required a lot of boilerplate code to perform common operations like adding days or months to a date, and it was easy to make mistakes when working with it.
            
            Due to these issues, Java 8 introduced the new `java.time` package, which provides a more modern and comprehensive API for handling dates and times. 
            The new API is immutable, thread-safe, and provides better support for time zones and date arithmetic, making it easier to work with dates and times in Java.
            
            What is UTC?
            UTC stands for Coordinated Universal Time. It is the primary time standard used to regulate clocks worldwide. It does not observe Daylight Saving Time (DST) and serves as the zero-point reference to determine all local time zones around the globe.
            How local time works: Time zones are expressed as positive or negative offsets from UTC. For example, India Standard Time (IST) is UTC + 5:30.
            Precision: It is measured using a network of highly accurate atomic clocks.
            Also known as: Often referred to as GMT (Greenwich Mean Time) or "Zulu time" in aviation and military contexts.
            No Time Zone Drama: Since UTC is constant everywhere, it allows people across multiple continents to reference the exact same moment without calculating local time differences.
            
            
            
            """;

    public static void main(String[] args) {
        System.out.println(README);
    }
}
