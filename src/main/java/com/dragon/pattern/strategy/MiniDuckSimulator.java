package com.dragon.pattern.strategy;


import com.dragon.pattern.strategy.duck.Duck;
import com.dragon.pattern.strategy.duck.MallardDuck;

/**
 * @date: 2024/3/18 21:00
 * @author: ybl
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();
    }
}
