package com.dragon.pattern.template;

import com.dragon.pattern.decorative.Beverage;

/**
 * @date: 2024/3/25 23:44
 * @author: ybl
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        CoffeeWithHock coffeeWithHock = new CoffeeWithHock();
        System.out.println("\nMaking coffee ...");
        coffeeWithHock.prepareRecipe();

    }
}
