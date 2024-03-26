package com.dragon.pattern.template.second;

/**
 * @date: 2024/3/26 16:18
 * @author: ybl
 */
public class Duck implements Comparable {
    String name;
    int wight;

    public Duck(String name, int wight) {
        this.name = name;
        this.wight = wight;
    }

    public String toString() {
        return "name:" + name + ", wight:" + wight;
    }

    @Override
    public int compareTo(Object object) {
        Duck otherDuck = (Duck) object;
        if (this.wight > otherDuck.wight) {
            return 1;
        } else if (this.wight == otherDuck.wight) {
            return 0;
        } else {
            return -1;
        }
    }
}
