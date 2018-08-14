package iterator;

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
    @DisplayName("이터레이터 패턴 테스트")
    public void should_menu_iterator() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        ArrayList<Menu> menus = new ArrayList<Menu>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
