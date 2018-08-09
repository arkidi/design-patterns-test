package strategy.duck;

import strategy.behavior.FlyNoWay;
import strategy.behavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm a model duck");
    }
}
