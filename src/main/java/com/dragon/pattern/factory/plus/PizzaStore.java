package com.dragon.pattern.factory.plus;

/**
 * @date: 2024/3/21 07:49
 * @author: ybl
 */
public abstract class PizzaStore {
    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
