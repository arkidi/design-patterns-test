package iterator;

import iterator.dinermergercafe.CafeMenu;
import iterator.transition.DinerMenu;
import iterator.transition.Menu;
import iterator.transition.PancakeHouseMenu;
import iterator.transition.Waitress;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MenuTestDrive {

    @Test
    @DisplayName("Nothing Test")
    public void nothing() {

    }

    @Test
    @DisplayName("이터레이터 패턴 테스트 1")
    public void should_transition_iterator() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        ArrayList<Menu> menus = new ArrayList<Menu>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }

    @Test
    @DisplayName("이터레이터 패턴 테스트 2")
    public void should_dinermergercafe_iterator() {
        iterator.dinermergercafe.PancakeHouseMenu pancakeHouseMenu = new iterator.dinermergercafe.PancakeHouseMenu();
        iterator.dinermergercafe.DinerMenu dinerMenu = new iterator.dinermergercafe.DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        iterator.dinermergercafe.Waitress waitress =
                new iterator.dinermergercafe.Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);

        waitress.printMenu();
        waitress.printVegetarianMenu();

        System.out.println("\nCustomer asks is the Hotdog vegetarian?");
        System.out.print("Waitress says: ");
        if  (waitress.isItemVegetarian("Hotdog"))
            System.out.println("Yes");
        else
            System.out.println("No");

        System.out.println("\nCustomer asks is the Waffles vegetarian?");
        System.out.print("Waitress says: ");
        if  (waitress.isItemVegetarian("Waffles"))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
