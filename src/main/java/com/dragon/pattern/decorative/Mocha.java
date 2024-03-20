package com.dragon.pattern.decorative;

/**
 * @date: 2024/3/20 19:34
 * @author: ybl
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .20+beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Mocha";
    }
}
