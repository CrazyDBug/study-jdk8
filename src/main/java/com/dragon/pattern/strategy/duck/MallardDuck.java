package pattern.strategy.duck;

import pattern.strategy.fly.FlyWithWings;
import pattern.strategy.quack.Quack;

import javax.annotation.Resource;

/**
 * @date: 2024/3/18 20:44
 * @author: ybl
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck");
    }
}
