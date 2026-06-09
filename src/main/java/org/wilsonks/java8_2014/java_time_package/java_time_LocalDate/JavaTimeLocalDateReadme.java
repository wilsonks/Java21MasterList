/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : JavaTimeLocalDateReadme.java
 *  * Created On : 2026-06-09 12:07
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

package org.wilsonks.java8_2014.java_time_package.java_time_LocalDate;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import static java.time.temporal.ChronoUnit.DAYS;

public class JavaTimeLocalDateReadme {
    public static final String README = """
            LocalDate is a class in the java.time package that represents a date without time or timezone information. 
            It is part of the Java 8 Date and Time API, which provides a more modern and comprehensive way to handle 
            dates and times compared to the older java.util.Date and java.util.Calendar classes.

            Key features of LocalDate include:
            - It represents a date in the ISO-8601 calendar system, which is the standard calendar system used by most of the world.
            - It is immutable, meaning that once a LocalDate object is created, it cannot be modified. Any operations that would modify the date will return a new LocalDate instance.
            - It provides various methods for creating, manipulating, and formatting dates.

            Commonly used methods of LocalDate include:
            - now(): Returns the current date from the system clock.
            - of(int year, int month, int dayOfMonth): Creates an instance of LocalDate with the specified year, month, and day.
            - plusDays(long daysToAdd): Returns a new LocalDate that is a specified number of days after this date.
            - minusMonths(long monthsToSubtract): Returns a new LocalDate that is a specified number of months before this date.
            - getYear(), getMonth(), getDayOfMonth(): Methods to retrieve specific components of the date.

            Example usage:
            LocalDate today = LocalDate.now();
            LocalDate birthday = LocalDate.of(1990, Month.JANUARY, 1);
            LocalDate nextWeek = today.plusDays(7);
            
            Does it manage leap years ? Yes
            The LocalDate class handles this via four main mechanisms:
            
            Date Validation: Creating or parsing an invalid date (e.g., 2017-02-29) throws a DateTimeException since 2017 is not a leap year.
            
            Dynamic Lengths: The lengthOfMonth() method returns 29 if the month is February and it is a leap year, or 28 otherwise. 
            Similarly, lengthOfYear() returns 366 for leap years and 365 for others.Leap 
            
            Year Checks: You can programmatically check if a specific year is a leap year using .isLeapYear().
            
            How Adding Time Works?
            When using methods like .plusYears() or .plusMonths(), LocalDate corrects leap day anomalies intelligently.
            For example, if you move exactly one year forward from 2024-02-29, it results in 2025-02-28 since February 29th does not exist in 2025.
            It adjusts the day to the last valid day of the month so your program does not crash.
            
            In summary, LocalDate is a powerful class for handling dates in Java, providing a clear and concise API for working with dates without time or timezone complexities.
            """;

    public static void main(String[] args) {
        System.out.println(README);

        //Yes, by default, calling LocalDate.now() uses the system's local time zone to determine the current date.
        // This behavior can be overloaded using the static factory method alternatives provided by the API.

        // 1. Default (Uses the local system time zone)
        LocalDate localDate = LocalDate.now();

        // 2. Overloaded with ZoneId (Get Tokyo's current date)
        LocalDate tokyoDate = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        LocalDate istDate =  LocalDate.now(ZoneId.of("Asia/Kolkata"));

        // 3. Overloaded with Clock (Fixed to UTC for predictable testing)
        Clock fixedClock = Clock.fixed(Instant.parse("2028-12-25T10:15:30.00Z"), ZoneId.of("UTC"));
        LocalDate Christmas2028 = LocalDate.now(fixedClock);

        System.out.println("Today's date: " + localDate);
        System.out.println("Tokyo's date: " + tokyoDate);
        System.out.println("IST's date: " + istDate);
        System.out.println("Christmas2028's date: " + Christmas2028);

        //Leap Year Tests
        LocalDate specificDate = LocalDate.of(2024, 1, 11); // A specific date
        LocalDate nextYear = specificDate.plusYears(1);

        System.out.println("Specific date: " + specificDate);
        System.out.println("Is 2024 a leap year? " + specificDate.isLeapYear());
        System.out.println("Adding 1 year to specific date: " + nextYear);
        System.out.println("Number of Days in between: " + DAYS.between(specificDate, nextYear));


    }
}