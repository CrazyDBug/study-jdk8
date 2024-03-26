package com.dragon.pattern.template.first;

/**
 * @date: 2024/3/25 23:27
 * @author: ybl
 */
public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}
