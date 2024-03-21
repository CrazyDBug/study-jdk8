package com.dragon.pattern.factory.plus;

/**
 * @date: 2024/3/21 08:38
 * @author: ybl
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();
}
