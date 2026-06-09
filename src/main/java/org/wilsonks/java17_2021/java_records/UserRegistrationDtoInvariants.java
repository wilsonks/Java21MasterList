
/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : UserRegistrationDtoInvariants.java
 *  * Created On : 2026-06-03 10:28
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
 *   * - Create a data transfer object UserRegistration that holds a username and email. You must ensure that neither property can be null or blank.
 *  * Notes:
 *  * -
 *  *
 *  * =============================================================================
 *
 */

package org.wilsonks.java17_2021.java_records;

public class UserRegistrationDtoInvariants {

    public static final String DESCRIPTION = """
                This class demonstrates how to enforce invariants in a Java record by using a compact constructor. 
                In this example, the UserRegistrationDto record has two components: username and email. 
                The compact constructor is used to validate that neither the username nor the email can be null or blank. 
                If either of these conditions is violated, an IllegalArgumentException is thrown, ensuring that any instance of UserRegistrationDto is always in a valid state.
            """;

    record UserRegistrationDto(String username, String email) {
        UserRegistrationDto {
            if (username == null || username.isBlank()) {
                throw new IllegalArgumentException("Username cannot be null or blank");
            }
            if (email == null || email.isBlank()) {
                throw new IllegalArgumentException("Email cannot be null or blank");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(DESCRIPTION);
        UserRegistrationDto userRegistrationDto = new UserRegistrationDto("username", "email");
        UserRegistrationDto badUserRegistrationDto = new UserRegistrationDto("username", "");
        System.out.println(userRegistrationDto);
    }

}
