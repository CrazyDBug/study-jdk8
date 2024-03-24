package com.dragon.pattern.adapter;

/**
 * @date: 2024/3/24 10:41
 * @author: ybl
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
