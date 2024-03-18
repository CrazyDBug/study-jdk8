package com.dragon.pattern.strategy.duck;

import com.dragon.pattern.strategy.fly.FlyWithWings;
import com.dragon.pattern.strategy.quack.Quack;

/**
 * @date: 2024/3/18 20:44
 * @author: ybl
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck");
    }
}
