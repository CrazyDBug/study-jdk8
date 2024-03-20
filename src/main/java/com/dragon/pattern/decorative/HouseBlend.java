package com.dragon.pattern.decorative;

/**
 * @date: 2024/3/20 19:33
 * @author: ybl
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return .89;
    }
}
