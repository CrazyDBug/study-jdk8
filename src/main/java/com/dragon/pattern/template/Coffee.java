package com.dragon.pattern.template;

/**
 * @date: 2024/3/25 23:28
 * @author: ybl
 */
public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
