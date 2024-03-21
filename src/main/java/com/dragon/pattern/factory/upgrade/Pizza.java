package com.dragon.pattern.factory.upgrade;

import java.util.ArrayList;

/**
 * @date: 2024/3/21 08:09
 * @author: ybl
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    ArrayList<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("\t" + topping);
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

}
