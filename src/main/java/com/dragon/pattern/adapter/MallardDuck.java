package com.dragon.pattern.adapter;

/**
 * @description: 绿头鸭
 * @date: 2024/3/24 10:19
 * @author: ybl
 */
public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("Fly");
    }
}
