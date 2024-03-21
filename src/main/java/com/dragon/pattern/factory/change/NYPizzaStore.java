package com.dragon.pattern.factory.change;

import com.dragon.pattern.factory.common.Pizza;
//import com.dragon.pattern.factory.upgrade.Pizza;
//import com.dragon.pattern.factory.upgrade.PizzaStore;

/**
 * @date: 2024/3/21 07:54
 * @author: ybl
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
