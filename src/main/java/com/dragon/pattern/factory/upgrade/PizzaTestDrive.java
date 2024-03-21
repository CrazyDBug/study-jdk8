package com.dragon.pattern.factory.upgrade;

/**
 * @date: 2024/3/21 08:16
 * @author: ybl
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        Pizza pizza = store.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        pizza = store.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

    }
}
