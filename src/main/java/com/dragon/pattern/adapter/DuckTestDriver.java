package com.dragon.pattern.adapter;

/**
 * @date: 2024/3/24 10:44
 * @author: ybl
 */
public class DuckTestDriver {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("The Duck says...");
        testDuck(duck);

        System.out.println("The TurkeyAdapter says...");
        testDuck(turkeyAdapter);


    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
