package factory.pizzafm;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        super.name = "Chicago Style Deep Dish Cheese Pizza";
        super.dough = "Extra Thick Crust Dough";
        super.sauce = "Plum Tomato sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    public void cut() {
        System.out.println("Cutting the pizza intto square slices");
    }
}
