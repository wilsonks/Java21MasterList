/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : JavaTimeLocalTimeReadme.java
 *  * Created On : 2026-06-09 12:47
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

package org.wilsonks.java8_2014.java_time_package.java_time_LocalTime;

import java.time.LocalTime;

public class JavaTimeLocalTimeReadme {
    public static final String README = """
            The LocalTime class in Java is part of the java.time package and represents a time without a date or time zone. 
            It is used to represent a specific time of day, such as 10:30 AM or 5:45 PM. LocalTime is immutable and thread-safe, making 
            it a good choice for representing time values in applications.

            Key features of LocalTime include:
            - It does not contain any date information, only time.
            - It does not contain any time zone information.
            - It provides methods for creating, manipulating, and formatting time values.

            Common use cases for LocalTime include:
            - Representing business hours or opening/closing times.
            - Scheduling events that occur at specific times of the day.
            - Performing calculations with time values (e.g., adding hours or minutes).

            Example usage:
            LocalTime time = LocalTime.of(10, 30); // 10:30 AM
            LocalTime now = LocalTime.now(); // Current time
            LocalTime later = time.plusHours(2); // 12:30 PM
            
            
            The Tricky Usecase: 
                Scheduling a daily 1:15 AM database maintenance job when users are asleep, irrespective of which global 
                time zone your physical servers are hosted in.
            """;

    public static void main(String[] args) {
        System.out.println(README);

        LocalTime now = LocalTime.now(); // Current time
        LocalTime specificTime = LocalTime.of(14, 30); // A specific time, say 2:30 PM
        LocalTime addedTime = specificTime.plusHours(1).plusMinutes(15); // Adding 1 hour and 15 minutes to 2:30 PM

        System.out.println("Current Time: " + now);
        System.out.println("Specific Time: " + specificTime);
        System.out.println("Added Time: " + addedTime);
    }
}
