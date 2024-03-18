package com.dragon.pattern.strategy.quack;

/**
 * @date: 2024/3/18 20:58
 * @author: ybl
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
