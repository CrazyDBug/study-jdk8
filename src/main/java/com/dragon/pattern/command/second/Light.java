package com.dragon.pattern.command.second;

/**
 * @date: 2024/3/23 16:24
 * @author: ybl
 */
public class Light {
    public Light(String name) {
        System.out.println(name);
    }

    public void on(){
        System.out.println("灯亮");
    }
    public void off(){
        System.out.println("灯灭");
    }
}
