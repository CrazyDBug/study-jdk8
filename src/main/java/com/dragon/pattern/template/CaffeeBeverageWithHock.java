package com.dragon.pattern.template;

/**
 * @Description: 咖啡因饮料
 * @date: 2024/3/25 23:26
 * @author: ybl
 */
public abstract class CaffeeBeverageWithHock {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("水烧开");
    }

    void pourInCup() {
        System.out.println("倒入杯中");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
