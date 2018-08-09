package factory.pizzafm;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }

        return null;
    }
}
