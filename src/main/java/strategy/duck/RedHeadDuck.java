package strategy.duck;

import strategy.behavior.FlyWithWings;
import strategy.behavior.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        super.flyBehavior = new FlyWithWings();
        super.quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
