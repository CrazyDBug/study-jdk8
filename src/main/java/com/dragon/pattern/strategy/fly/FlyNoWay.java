package com.dragon.pattern.strategy.fly;

/**
 * @date: 2024/3/18 20:57
 * @author: ybl
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
