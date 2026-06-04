/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : BasicCoffeeMachine.java
 *  * Created On : 2026-06-04 12:12
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

import java.util.HashMap;

public class BasicCoffeeMachine implements CoffeeMachine {

    private final HashMap<String, CoffeeBean> beans = new HashMap<>();

    public BasicCoffeeMachine(HashMap<CoffeeSelection, CoffeeBean> beans) {
        for (var entry : beans.entrySet()) {
            this.beans.put(entry.getKey().name(), entry.getValue());
        }
    }

    @Override
    public Coffee brewCoffee(CoffeeSelection selection) {
        CoffeeBean bean = beans.get(selection.name());
        if (bean == null) {
            throw new IllegalArgumentException("No coffee bean found for selection: " + selection);
        }
        // Simulate brewing process
        return new Coffee(selection.name(), "Medium", bean.toString());
    }
}
