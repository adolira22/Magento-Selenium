package Util;

import Interfaces.IProduct;
import org.openqa.selenium.WebElement;

public class Products implements IProduct {

    private String name;
    private String price;
    private String image;
    private String size;
    private String color;

    private WebElement selectSize;
    private WebElement selectColor;
    private WebElement addToCart;
    private WebElement productWebElement;

    public void setSelectSize(WebElement selectSize) {
        this.selectSize = selectSize;
    }

    public void setSelectColor(WebElement selectColor) {
        this.selectColor = selectColor;
    }

    public void setAddToCart(WebElement addToCart) {
        this.addToCart = addToCart;
    }

    public void setProductWebElement(WebElement productWebElement) {
        this.productWebElement = productWebElement;
    }

    public WebElement getSelectSize() {
        return selectSize;
    }

    public WebElement getSelectColor() {
        return selectColor;
    }

    public WebElement getAddToCart() {
        return addToCart;
    }

    public WebElement getProductWebElement() {
        return productWebElement;
    }

    public String getName() {
        return "";
    }

    public Products(WebElement element){
        setProductWebElement(element);
    }
}
