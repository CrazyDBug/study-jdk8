package com.dragon.pattern.template.second;

import java.util.Arrays;

/**
 * @date: 2024/3/26 16:20
 * @author: ybl
 */
public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 10),
                new Duck("Dewey", 15),
                new Duck("Louie", 12),
                new Duck("Donald", 10),
        };
        System.out.println("Before sorting:");
        display(ducks);
        Arrays.sort(ducks);
        System.out.println("After sorting:");
        display(ducks);

    }

    public static void display(Duck[] ducks) {
        for (int i = 0; i < ducks.length; i++) {
            System.out.println("Name: " + ducks[i].name + ", wight: " + ducks[i].wight);
        }
    }
}
