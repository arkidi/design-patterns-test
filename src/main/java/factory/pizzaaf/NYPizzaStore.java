package factory.pizzaaf;

import factory.pizzaaf.Ingredient.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore{
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    @Override
    protected Pizza createPizza(String item) {

        if (item.equals("cheese")) {
           pizza = new CheesePizza(ingredientFactory);
           pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }

        return pizza;
    }
}
