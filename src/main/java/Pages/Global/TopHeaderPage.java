package Pages.Global;

import Pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopHeaderPage extends Page {

    @FindBy(xpath = "//div[@class='panel header']//a[normalize-space()='Create an Account']")
    private WebElement createAccounntLink;

    @FindBy(xpath = "//a[@class='action showcart']")
    private WebElement cartButton;

    @FindBy(id = "top-cart-btn-checkout")
    private WebElement checkoutButton;


    public TopHeaderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getCreateAccountLink(){
        return this.fiendElement(createAccounntLink);

    }

    public WebElement getCartButton(){
        return this.fiendElement(cartButton);
    }

    public WebElement getCheckoutButton(){
        return this.fiendElement(checkoutButton);
    }

    public void clickCheckoutButton(){
        this.getCheckoutButton().click();
    }
}
