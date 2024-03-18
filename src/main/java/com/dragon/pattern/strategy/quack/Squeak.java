package pattern.strategy.quack;

/**
 * @date: 2024/3/18 20:59
 * @author: ybl
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}