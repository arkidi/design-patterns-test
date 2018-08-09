package strategy.duck;

import strategy.behavior.FlyNoWay;
import strategy.behavior.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        super.setFlyBehavior(new FlyNoWay());
        super.setQuackBehavior(new MuteQuack());
    }

    @Override
    void display() {
        System.out.println("I'm a duck Decoy");
    }
}
