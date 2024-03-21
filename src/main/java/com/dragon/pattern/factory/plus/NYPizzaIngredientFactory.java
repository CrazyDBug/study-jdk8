package com.dragon.pattern.factory.plus;

/**
 * @date: 2024/3/21 08:40
 * @author: ybl
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThincurstDough();
    }

    @Override
    public Sauce createSauce() {
        return new MildSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
       Veggies veggies[] = {new Garlic(),new Onion(),new Mushroom(),new Redpeper() };
       return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
