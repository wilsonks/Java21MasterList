/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : DurationAndPeriodExample.java
 *  * Created On : 2026-06-09 19:59
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

package org.wilsonks.java8_2014.java_time_package.java_Period_and_Duration;

public class DurationAndPeriodExample {

    public static void main(String[] args) {
        DurationAndPeriodExample example = new DurationAndPeriodExample();
        example.durationExample();
        example.periodExample();
    }

    private void durationExample() {
        System.out.println("Duration Example:");
        java.time.Duration duration = java.time.Duration.ofHours(5).plusMinutes(30);
        System.out.println("Duration: " + duration);
        System.out.println("Total Seconds: " + duration.getSeconds());
    }

    private void periodExample() {
        System.out.println("\nPeriod Example:");
        java.time.Period period = java.time.Period.of(2, 3, 15);
        System.out.println("Period: " + period);
        System.out.println("Total Months: " + (period.getYears() * 12 + period.getMonths()));
    }
}
