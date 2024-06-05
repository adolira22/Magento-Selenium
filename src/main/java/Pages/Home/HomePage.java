package Pages.Home;

import Pages.Page;
import Util.Products;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Page {

    @FindBy(xpath = "//li[@class = 'product-item' ]")
    private List<WebElement> products;


    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public Products getProductByName(String name){

        Actions actions = new Actions(driver);

        for (WebElement product : products){
            if (this.fiendElement(product.findElement(By.xpath("div/div/strong/a"))).getText().contains(name)){
                actions.moveToElement(product).perform();
                return this.getProduct(product);
            }
        }

        return null;
    }


    private Products getProduct(WebElement product){
        return new Products(product);
    }
}
