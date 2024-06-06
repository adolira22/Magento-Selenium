package Sanity;

import Pages.Account.CheckoutPage;
import Pages.Account.ReviewPaymentPage;
import Pages.Global.ProductPage;
import Pages.Global.TopHeaderPage;
import Pages.Home.HomePage;
import TestCaseImplements.TestCase;
import Util.Products;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageHotSellerTest extends TestCase {

    @Test
    public void test(){

        Actions actions = new Actions(driver);
        HomePage home = new HomePage(driver);
        ProductPage product = new ProductPage(driver);
        TopHeaderPage topheader = new TopHeaderPage(driver);
        CheckoutPage checkout = new CheckoutPage(driver);
        ReviewPaymentPage reviewPayment = new ReviewPaymentPage(driver);

        Products item = home.getProductByName("Breathe-Easy Tank");
        actions.moveToElement(item.getProductWebElement()).click().perform();
        product.getSize(ProductPage.size.MEDIUM).click();
        product.getColor(ProductPage.color.PURPLE).click();
        product.getAddToCartButton().click();
        Assert.assertTrue(product.isTextPresent("You added Breathe-Easy Tank to your"));
        topheader.getCartButton().click();
        topheader.getCheckoutButton().click();
         checkout.getEmailField().sendKeys(getEmailRandom());
        checkout.getFirstNameInput().sendKeys("Pedro");
        checkout.getLastNameInput().sendKeys("Torres");
        checkout.getCompanyInput().sendKeys("Main Website Store");
        checkout.getCityInput().sendKeys("Santa tecla");
        checkout.getStreetInput().sendKeys("Calle 2");
        checkout.selectDropdown("Florida");
        checkout.getStateDropdown().submit();
        checkout.getZipCodeInput().sendKeys("33101");
        checkout.setCountryDropdown("El Salvador").click();
        checkout.getPhoneInput().sendKeys("77777777");
        checkout.getShippingRadio().click();
        checkout.getNextButton().click();
        reviewPayment.getPlaceOrderButton().click();
        assertTrue(reviewPayment.isTextPresent("Thank you for your purchase!"));














    }

}
