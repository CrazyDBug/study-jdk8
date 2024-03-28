package com.dragon.pattern.iterador.first;

import com.dragon.pattern.iterador.common.MenuItem;

import java.util.ArrayList;

/**
 * @date: 2024/3/26 16:31
 * @author: ybl
 */
public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.9);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.9);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.4);
        addItem("Waffles", "Waffles with your choice of blueberries or strawberries", true, 3.5);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }
}
