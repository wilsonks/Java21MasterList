/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : ZonedDateTimeReadme.java
 *  * Created On : 2026-06-09 13:12
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

package org.wilsonks.java8_2014.java_time_package.java_time_ZonedDateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeReadme {
    public static final String README = """
            ZonedDateTime is a class in the java.time package that represents a date and time with a time zone. 
            It is an immutable class that provides methods for manipulating date and time values, as well as for formatting and 
            parsing date and time strings.
            
            ZonedDateTime is useful for working with date and time values that are associated with a specific time zone, 
            such as when you need to display a date and time in a specific time zone or when you need to perform calculations 
            that take into account the time zone.
            
            It is important for applications that operate across multiple time zones and need to account for timezone differences 
            and daylight saving time changes:
            
            The Tricky Usecase: 
            Booking a dentist appointment at 3:00 PM next month. If governments alter daylight savings rules, fixing this in an absolute 
            timestamp (like Instant) ruins the appointment.
            
            """;

    public static void main(String[] args) {
        System.out.println(README);
        ZonedDateTime zonedNow = ZonedDateTime.now(); // Current date and time with timezone
        LocalDateTime specificDateTime = LocalDateTime.of(2026, 6, 9, 13, 32); // Specific date and time without timezone
        ZonedDateTime zonedSpecificDateTime = ZonedDateTime.of(specificDateTime, ZoneId.of("Asia/Kolkata")); // Specific date and time with timezone
        ZonedDateTime americanZonedTime = zonedSpecificDateTime.withZoneSameInstant(ZoneId.of("America/Los_Angeles")); //To Change the TimeZone

        System.out.println("Current ZonedDateTime: " + zonedNow);
        System.out.println("Specific LocalDateTime: " + specificDateTime);
        System.out.println("Specific ZonedDateTime: " + zonedSpecificDateTime);
        System.out.println("Same Instant in Los Angeles: " + americanZonedTime);
    }

}
