package pattern.strategy.fly;

/**
 * @date: 2024/3/18 20:51
 * @author: ybl
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings");
    }
}
