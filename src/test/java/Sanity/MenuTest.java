package Sanity;

import Pages.Global.MenuPage;
import TestCaseImplements.TestCase;
import org.testng.annotations.Test;

public class MenuTest extends TestCase {

    @Test
    public void test(){

        MenuPage menu = new MenuPage(driver);

        menu.goToMenu(MenuPage.lvl0.WOMEN).perform();
        menu.goToMenu(MenuPage.lvl1.TOPS).perform();
        menu.goToMenu(MenuPage.lvl2.JACKETS).click().perform();





    }
}
