package strategy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import strategy.behavior.FlyRocketPowered;
import strategy.behavior.Quack;
import strategy.duck.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MiniDuckSimulator {

    @Test
    @DisplayName("Nothing Test")
    public void nothing() {

    }

    @Test
    @DisplayName("스트레티지 패턴 테스트")
    public void should_duck_strategy() {
        MallarDuck mallarDuck = new MallarDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();
        Duck model = new ModelDuck();

        assertThat(mallarDuck.performQuack(), is("Quack"));
        assertThat(rubberDuck.performQuack(), is("Squeak"));

        assertThat(decoyDuck.performQuack(), is("<< Silence >>"));
        decoyDuck.setQuackBehavior(new Quack());
        assertThat(decoyDuck.performQuack(), is("Quack"));

        assertThat( model.performFly(), is("I can't fly"));
        model.setFlyBehavior(new FlyRocketPowered());
        assertThat( model.performFly(), is("I'm flying with a rocket!!"));
    }
}
