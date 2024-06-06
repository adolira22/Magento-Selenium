package Pages.Account;

import Pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewPaymentPage extends Page {

    @FindBy(xpath = "//span[normalize-space()='Place Order']")
    private WebElement placeOrderButton;

    public ReviewPaymentPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getPlaceOrderButton(){
        return this.fiendElement(placeOrderButton);
    }
}
