package factory.pizzafm;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        super.name = "NY Style Sauce and Cheese Pizza";
        super.dough = "Thin Curst Dough";
        super.sauce = "Marinara Sauce";
        super.toppings.add("Grated Reggiano Chesse");
    }
}
