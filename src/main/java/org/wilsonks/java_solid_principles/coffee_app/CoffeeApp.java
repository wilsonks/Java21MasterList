/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : CoffeeApp.java
 *  * Created On : 2026-06-04 11:55
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
import java.util.concurrent.ConcurrentHashMap;

public class CoffeeApp {
    private final CoffeeMachine coffeeMachine;

    public CoffeeApp(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public Coffee PrpareCoffee(CoffeeSelection selection) {
        Coffee coffee = coffeeMachine.brewCoffee(selection);
        System.out.println("Coffee is ready! " + coffee);
        return coffee;
    }

    public static void main(String[] args) {
        //Available Beans
        HashMap<CoffeeSelection, CoffeeBean> beans = new HashMap<>();
        beans.put(CoffeeSelection.ESPRESSO, new CoffeeBean("Ethiopia", "Arabica", "Medium"));
        beans.put(CoffeeSelection.LATTE, new CoffeeBean("Colombia", "Arabica", "Light"));
        beans.put(CoffeeSelection.CAPPUCCINO, new CoffeeBean("Brazil", "Robusta", "Dark"));
        beans.put(CoffeeSelection.AMERICANO, new CoffeeBean("Kenya", "Arabica", "Medium"));


        CoffeeMachine machine = new BasicCoffeeMachine(beans);
        CoffeeApp app = new CoffeeApp(machine);
        app.PrpareCoffee(CoffeeSelection.ESPRESSO);
        app.PrpareCoffee(CoffeeSelection.LATTE);
        app.PrpareCoffee(CoffeeSelection.CAPPUCCINO);
        app.PrpareCoffee(CoffeeSelection.AMERICANO);
    }
}
