package com.dragon.pattern.iterador.third;

//import com.dragon.pattern.iterador.common.MenuItem;
import com.dragon.pattern.iterador.common.MenuItem;
import com.dragon.pattern.iterador.second.DinerMenu;
//import com.dragon.pattern.iterador.second.Iterator;
import java.util.Iterator;
/**
 * @date: 2024/3/26 16:49
 * @author: ybl
 */
public class Waitress {
    Menu pancacheHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu dinerMenu) {
        this.dinerMenu = dinerMenu;
    }


    public void printMenu() {
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----");
        printMenu(dinerMenuIterator);
    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName());

            System.out.println(", $" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
    }
}
