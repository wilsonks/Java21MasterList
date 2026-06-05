/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : CoffeeMachine.java
 *  * Created On : 2026-06-04 12:11
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

package org.wilsonks.java_solid_principles.coffee_app;

public interface CoffeeMachine {
    Coffee brewCoffee (CoffeeSelection selection, String size);
}
