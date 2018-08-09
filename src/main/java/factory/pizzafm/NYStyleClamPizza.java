package factory.pizzafm;

public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza() {
        super.name = "NY Style Clam Pizza";
        super.dough = "Thin Crust Dough";
        super.sauce = "Marinara Sauce";

        super.toppings.add("Grated Reggiano Chesse");
        super.toppings.add("Fresh Clams from Long Island Sound");
    }
}
