package com.dragon.pattern.decorative;

/**
 * @date: 2024/3/20 19:32
 * @author: ybl
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
