package com.dragon.pattern.iterador.third;


import com.dragon.pattern.iterador.common.MenuItem;

import java.util.Iterator;

/**
 * @date: 2024/3/26 16:46
 * @author: ybl
 */
public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;

    int numberOfItems = 0;

    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "(Fakin' 'bout a las) Lettuce-Spinach, Jalapeño & Tomato BLT", true, 2.99);
        addItem("BLT", "Bacon-Lettuce-Tomato", false, 2.99);
        addItem("Hotdog", "Smothered Hotdog with Bacon & Lettuce", false, 2.99);
        addItem("Soup of the day", "A cup of the soup of the day with a side salad", false, 3.99);
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Menu is full! Can't add item "+ name);
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

//    public MenuItem[] getMenuItems(){
//        return menuItems;
//    }
}
