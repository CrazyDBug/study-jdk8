package com.dragon.pattern.factory.plus;

/**
 * @date: 2024/3/21 08:53
 * @author: ybl
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new ChessePizza(ingredientFactory);
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
        }

        return pizza;
    }
}
