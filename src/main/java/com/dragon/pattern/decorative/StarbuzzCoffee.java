package com.dragon.pattern.decorative;

/**
 * @date: 2024/3/20 19:37
 * @author: ybl
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
