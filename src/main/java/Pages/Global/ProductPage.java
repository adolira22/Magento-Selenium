package Pages.Global;

import Pages.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Page {

    @FindBy(xpath = "//span[normalize-space()='Add to Cart']")
    private WebElement addToCartButton;

    public enum size {
        EXTRA_SMALL("Extra Small", By.xpath("//div[@ class = 'swatch-option text' and @aria-label = 'XS'] ")),
        SMALL("Small", By.xpath("//div[@ class = 'swatch-option text' and @aria-label = 'S'] ")),
        MEDIUM("Medium", By.xpath("//div[@ class = 'swatch-option text' and @aria-label = 'M'] ")),
        LARGE("Large", By.xpath("//div[@ class = 'swatch-option text' and @aria-label = 'L'] ")),
        EXTRA_LARGE("Extra Large", By.xpath("//div[@ class = 'swatch-option text' and @aria-label = 'XL'] ")),
        ;

        private String name;
        private By xpath;
        size(String name, By xpath) {
            this.name = name;
            this.xpath = xpath;
        }
    }

    public enum color {
        PURPLE("Purple", By.xpath("//div[@ class = 'swatch-option color' and @aria-label = 'Purple'] ")),
        RED("Red", By.xpath("//div[@ class = 'swatch-option color' and @aria-label = 'Red'] ")),
        BLUE("Blue", By.xpath("//div[@ class = 'swatch-option color' and @aria-label = 'Blue'] ")),
        ;

        private String name;
        private By xpath;

        color(String name, By xpath) {
            this.name = name;
            this.xpath = xpath;
        }
    }

    public ProductPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getAddToCartButton() {
        return this.fiendElement(addToCartButton);
    }

    public WebElement getSize(size size){
        return this.fiendElement(size.xpath);
    }

    public WebElement getColor(color color){
        return this.fiendElement(color.xpath);
    }
}
