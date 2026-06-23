/*
 *
 *  * =============================================================================
 *  * Project    : Java21MasterList
 *  * File       : CoffeeApp.java
 *  * Created On : 2026-06-22 20:05
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

package org.wilsonks.core_java.java_solid_principles.coffee_app;

import java.util.HashMap;

public class CoffeeApp {
    private final CoffeeMachine coffeeMachine;

    public CoffeeApp(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public Coffee PrpareCoffee(CoffeeSelection selection, String size) {
        return coffeeMachine.brewCoffee(selection, size);
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

        Coffee coffee1 = app.PrpareCoffee(CoffeeSelection.LATTE, "Medium");
        System.out.println(coffee1);
        Coffee coffee2 = app.PrpareCoffee(CoffeeSelection.ESPRESSO, "Large");
        System.out.println(coffee2);
        Coffee coffee3 = app.PrpareCoffee(CoffeeSelection.CAPPUCCINO, "Small");
        System.out.println(coffee3);
        Coffee coffee4 = app.PrpareCoffee(CoffeeSelection.AMERICANO, "Medium");
        System.out.println(coffee4);

    }
}
