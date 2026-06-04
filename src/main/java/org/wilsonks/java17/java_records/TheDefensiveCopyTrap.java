/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : TheDefensiveCopyTrap.java
 *  * Created On : 2026-06-03 10:33
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
 *   * - Design a Team record that accepts a String name and a List<String> players.
 *      Ensure that external code cannot modify the internal roster of players after creation.
 *  * Notes:
 *  * -
 *  *
 *  * =============================================================================
 *
 */

package org.wilsonks.java17.java_records;

import java.util.ArrayList;
import java.util.List;


public class TheDefensiveCopyTrap {

    public static final String DESCRIPTION = """
        This class demonstrates how to avoid the defensive copy trap when using Java records with mutable components. 
        In this example, the Team record has a name and a list of players. 
        To ensure that external code cannot modify the internal roster of players after creation, we make a defensive copy of the players list in the constructor. 
        This way, even if the original list passed to the constructor is modified after the Team instance is created, the internal state of the Team remains unchanged and secure.
    """;

    record Team(String name, List<String> players) {
        Team(String name, List<String> players) {
            this.name = name;
            this.players = List.copyOf(players);
        }
    }

    public static void main(String[] args) {
        System.out.println(DESCRIPTION);
        List<String> players = new ArrayList<>(List.of("Alice", "Bob", "Charlie"));
        Team team = new Team("Dream Team", players);
        System.out.println(team);

        // Attempting to modify the original players list will not affect the team roster
        players.set(0, "Eve");
        System.out.println(team); // The team roster remains unchanged
    }
}
