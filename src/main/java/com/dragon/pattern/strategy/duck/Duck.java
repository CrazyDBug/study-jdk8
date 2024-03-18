package com.dragon.pattern.strategy.duck;

import com.dragon.pattern.strategy.fly.FlyBehavior;
import com.dragon.pattern.strategy.quack.QuackBehavior;

/**
 * @date: 2024/3/18 20:42
 * @author: ybl
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {}

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }

   public void swim() {
        System.out.println("All ducks float, even decoys");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public  void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}


