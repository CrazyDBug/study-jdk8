package pattern.strategy.quack;

/**
 * @date: 2024/3/18 20:53
 * @author: ybl
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
