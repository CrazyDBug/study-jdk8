package pattern.strategy.duck;

import pattern.strategy.fly.FlyNoWay;
import pattern.strategy.quack.Quack;

/**
 * @date: 2024/3/18 21:03
 * @author: ybl
 */
public class ModelDuck extends Duck{
    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
