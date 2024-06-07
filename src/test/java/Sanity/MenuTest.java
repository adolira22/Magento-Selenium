package Sanity;

import TestCaseImplements.TestCase;
import Pages.Global.MenuPage;
import org.testng.annotations.Test;

import java.awt.*;

public class MenuTest extends TestCase{

    @Test
    public void test(){
        MenuPage menu = new MenuPage(driver);

        menu.goToMenu(MenuPage.lvl0.WOMEN).perform();
        menu.goToMenu(MenuPage.lvl1.TOPS).perform();
        menu.goToMenu(MenuPage.lvl2.JACKETS).perform();
    }
}
