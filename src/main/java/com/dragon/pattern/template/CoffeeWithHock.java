package com.dragon.pattern.template;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @date: 2024/3/25 23:37
 * @author: ybl
 */
public class CoffeeWithHock extends CaffeeBeverageWithHock {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().charAt(0) == 'y') {
            return true;
        } else {
            return false;
        }
    }

    public String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = reader.readLine();
        } catch (Exception e) {
            System.out.println("IO error while trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
