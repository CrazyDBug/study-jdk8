package com.dragon.pattern.factory.plus;

/**
 * @date: 2024/3/21 08:46
 * @author: ybl
 */
public class ChessePizza extends Pizza {
    PizzaIngredientFactory pizIngredientFactory;

    public ChessePizza(PizzaIngredientFactory pizIngredientFactory) {
        this.pizIngredientFactory = pizIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = pizIngredientFactory.createDough();
        sauce = pizIngredientFactory.createSauce();
        cheese = pizIngredientFactory.createCheese();
    }
}
