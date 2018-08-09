package factory.pizzafm;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {

        if(item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        }
        return null;
    }
}
