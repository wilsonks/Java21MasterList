/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : JavaTimeInstantReadme.java
 *  * Created On : 2026-06-09 19:50
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

package org.wilsonks.java8_2014.java_time_package.java_time_Instant;

import java.time.Instant;

public class JavaTimeInstantReadme {

    public static final String README = """
            * Java Time Instant:
      *
      * - Represents a specific moment on the timeline in UTC.
      * - Immutable and thread-safe.
      * - Provides nanosecond precision.
      * - Can be created from the current time, a specific epoch second, or a string representation.
      * - Supports various operations like addition, subtraction, and comparison.
      *
      * Common Methods:
      * - now(): Gets the current instant from the system clock.
      * - ofEpochSecond(long epochSecond): Creates an instant from the given epoch second.
      * - ofEpochMilli(long epochMilli): Creates an instant from the given epoch millisecond.
      * - parse(CharSequence text): Parses a string representation of an instant.
      * - plus(Duration duration): Returns a copy of this instant with the specified duration added.
      * - minus(Duration duration): Returns a copy of this instant with the specified duration subtracted.
      * - isBefore(Instant other): Checks if this instant is before another instant.
      * - isAfter(Instant other): Checks if this instant is after another instant.
      *
      * Example Usage:
      *
      * Instant now = Instant.now();
      * System.out.println("Current Instant: " + now);
      *
      * Instant specificInstant = Instant.ofEpochSecond(1609459200); // January 1, 2021
      * System.out.println("Specific Instant: " + specificInstant);
      *
      * Instant parsedInstant = Instant.parse("2021-01-01T00:00:00Z");
      * System.out.println("Parsed Instant: " + parsedInstant);
      
      
      This class is intended for use with timestamps, and it's often used in logging and other time-stamped data. 
      It can be converted to other date-time types like LocalDateTime or ZonedDateTime for more complex date-time manipulations.
      
            """;

    public static void main(String[] args) {
        System.out.println(README);
        Instant now = Instant.now(); // Current timestamp
        System.out.println("Current Instant: " + now);
    }

}
