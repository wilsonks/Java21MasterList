/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : JavaTimeLocalDateTimeReadme.java
 *  * Created On : 2026-06-09 13:03
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

package org.wilsonks.java8_2014.java_time_package.java_time_LocalDateTime;

import java.time.LocalDateTime;

public class JavaTimeLocalDateTimeReadme {
    public static final String README = """
            LocalDateTime (the human-entered time):
            LocalDateTime is a class in the java.time package that represents a date and time without a time zone. It combines the functionality of LocalDate and LocalTime, allowing you to work with both date and time components together.
            
            Key features of LocalDateTime include:
            1. Immutability: LocalDateTime instances are immutable, meaning that once created, they cannot be modified. 
            Any operation that seems to modify a LocalDateTime will actually return a new instance with the updated values.
            
            2. No Time Zone: LocalDateTime does not contain any information about time zones. 
            It represents a date and time as it would be seen on a wall clock, without any reference to a specific location on Earth.
            
            
            
            
            It is particularly useful when the time zone is implied or not necessary for the context:
            
            Example usage:
            LocalDateTime now = LocalDateTime.now(); // Current date and time
            LocalDateTime specificDateTime = LocalDateTime.of(2022, Month.JANUARY, 1, 10, 30); // January 1, 2022 at 10:30 AM
            LocalDateTime addedDateTime = specificDateTime.plusDays(5).plusHours(2); // Adding 5 days and 2 hours to the specific date and time
            
          
            
            """;

    public static void main(String[] args) {
        System.out.println(README);

        LocalDateTime now = LocalDateTime.now(); // Current date and time
        LocalDateTime specificDateTime = LocalDateTime.of(2022, 1, 1, 10, 30); // January 1, 2022 at 10:30 AM
        LocalDateTime addedDateTime = specificDateTime.plusDays(5).plusHours(2); // Adding 5 days and 2 hours to the specific date and time

        System.out.println("Current Date and Time: " + now);
        System.out.println("Specific Date and Time: " + specificDateTime);
        System.out.println("Added Date and Time: " + addedDateTime);




    }
            
            
}
