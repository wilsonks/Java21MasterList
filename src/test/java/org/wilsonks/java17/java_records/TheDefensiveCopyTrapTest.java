/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : TheDefensiveCopyTrapTest.java
 *  * Created On : 2026-06-03 10:56
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

package org.wilsonks.java17.java_records;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TheDefensiveCopyTrapTest {
    @Test
    void testDefensiveCopy() {
        // Given
        var players = new ArrayList<>(List.of("Alice", "Bob", "Charlie"));
        var team = new TheDefensiveCopyTrap.Team("Dream Team", players);

        // When
        players.set(0, "Eve");

        // Then
        assertEquals(List.of("Alice", "Bob", "Charlie"), team.players());
    }
}