package pattern.strategy.fly;

/**
 * @date: 2024/3/18 21:04
 * @author: ybl
 */
public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying with rocket!");
    }
}
