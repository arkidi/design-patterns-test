package factory;

import factory.pizzafm.ChicagoPizzaStore;
import factory.pizzafm.NYPizzaStore;
import factory.pizzafm.Pizza;
import factory.pizzafm.PizzaStore;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PizzaTestDrive {
    @Test
    @DisplayName("Nothing Test")
    public void nothing() {

    }

    @Test
    @DisplayName("팩토리 메서드 패턴 테스트")
    public void should_factory_method() {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }

    @Test
    @DisplayName("추상 팩토리 패턴 테스트")
    public void should_abstract_factory() {
        factory.pizzaaf.PizzaStore nyStore = new factory.pizzaaf.NYPizzaStore();
        factory.pizzaaf.Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");

    }
 }
