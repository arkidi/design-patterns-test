package strategy.behavior;

public class FakeQuack implements QuackBehavior {
    @Override
    public String quack() {
        return "Qwak";
    }
}
