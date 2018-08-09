package strategy.duck;

import strategy.behavior.FlyNoWay;
import strategy.behavior.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new Squeak();
    }

    @Override
    void display() {
        System.out.println("I'm a rubber duckie");
    }
}
