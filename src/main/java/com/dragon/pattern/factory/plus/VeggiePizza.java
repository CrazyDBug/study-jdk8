package com.dragon.pattern.factory.plus;


/**
 * @date: 2024/3/21 07:41
 * @author: ybl
 */
public class VeggiePizza extends Pizza {
    PizzaIngredientFactory pizIngredientFactory;

    public VeggiePizza(PizzaIngredientFactory pizIngredientFactory) {
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
