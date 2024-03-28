package com.dragon.pattern.iterador.second;

import com.dragon.pattern.iterador.first.PancakeHouseMenu;

/**
 * @date: 2024/3/26 16:53
 * @author: ybl
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(dinerMenu);
        waitress.printMenu();
    }
}
