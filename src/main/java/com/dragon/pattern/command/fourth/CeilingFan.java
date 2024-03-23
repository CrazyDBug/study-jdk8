package com.dragon.pattern.command.fourth;

/**
 * @date: 2024/3/23 18:10
 * @author: ybl
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;

    public static final int LOW = 1;

    public static final int OFF = 0;
    private String location;
    private int speed;
    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }
    public void high() {
        speed = HIGH;
        System.out.println(speed);
    }
    public void medium() {
        speed = MEDIUM;
        System.out.println(speed);
    }
    public void low() {
        speed = LOW;
        System.out.println(speed);
    }
    public void off() {
        speed = OFF;
        System.out.println(speed);
    }
    public int getSpeed() {
        return speed;
    }
}
