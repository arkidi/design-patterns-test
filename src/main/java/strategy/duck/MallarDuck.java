package strategy.duck;

import strategy.behavior.FlyWithWings;
import strategy.behavior.Quack;

public class MallarDuck extends Duck {

    public MallarDuck() {
        super.flyBehavior = new FlyWithWings();
        super.quackBehavior = new Quack();
    }
    @Override
    void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
