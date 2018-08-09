package strategy.duck;

import strategy.behavior.FlyNoWay;
import strategy.behavior.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    void display() {
        System.out.println("I'm a rubber duckie");
    }
}
