package com.dragon.pattern.factory.plus;

/**
 * @date: 2024/3/21 08:44
 * @author: ybl
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;

    abstract void prepare();

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    public String toString(){
        StringBuffer result = new StringBuffer();
        result.append("*** " + name + " ***\n");
        return result.toString();
    }

}
