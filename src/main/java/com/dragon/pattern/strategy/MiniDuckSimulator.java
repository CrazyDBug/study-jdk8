package pattern.strategy;

import pattern.strategy.duck.Duck;
import pattern.strategy.duck.MallardDuck;

/**
 * @date: 2024/3/18 21:00
 * @author: ybl
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();
//        D mallardDuck = new MallardDuck();
//        Duck duck = new ModelDuck();
//        duck.display();
//        duck.quack();
//        duck.fly();
//        System.out.println("-----------------");
//        duck = new MallardDuck();
//        duck.display();
//        duck.quack();
//        duck.fly();
//        System.out.println("-----------------");
//        duck = new RedHeadDuck();
//        duck.display();
//        duck.quack();
//        duck.fly();

    }
}
