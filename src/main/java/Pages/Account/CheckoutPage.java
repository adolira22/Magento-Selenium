package Pages.Account;

import Pages.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends Page {

    @FindBy(id = "customer-email")
    private WebElement emailField;

    @FindBy(name = "firstname")
    private WebElement firstNameInput;

    @FindBy(name = "lastname")
    private WebElement lastNameInput;

    @FindBy(name = "company")
    private WebElement companyInput;

    @FindBy(name = "street[0]")
    private WebElement streetInput;

    @FindBy(name = "city")
    private WebElement cityInput;

    @FindBy(name = "region_id")
    private WebElement stateDropdown;

    @FindBy(name = "postcode")
    private WebElement zipCodeInput;

    @FindBy(name = "region_id")
    private WebElement countryDropdown;

    @FindBy(name = "telephone")
    private WebElement phoneInput;

    @FindBy(name = "ko_unique_1")
    private WebElement shippingRadio;

    @FindBy(xpath = "//span[normalize-space()='Next']")
    private WebElement nextButton;


    public CheckoutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getEmailField(){
        return this.fiendElement(emailField);
    }

    public WebElement getFirstNameInput(){
        return this.fiendElement(firstNameInput);
    }

    public WebElement getLastNameInput(){
        return this.fiendElement(lastNameInput);
    }

    public WebElement getCompanyInput(){
        return this.fiendElement(companyInput);
    }

    public WebElement getStreetInput(){
        return this.fiendElement(streetInput);
    }

    public WebElement getCityInput(){
        return this.fiendElement(cityInput);
    }

    public WebElement getStateDropdown(){
        return this.fiendElement(stateDropdown);
    }

    public void selectDropdown(String state){
        this.getStateDropdown().click();
        this.fiendElement(this.getStateDropdown().findElement(By.xpath("//option[normalize-space() = '"+state+"']"))).click();
    }

    public WebElement getZipCodeInput(){
        return this.fiendElement(zipCodeInput);
    }

    public WebElement getCountryDropdown(){
        return this.fiendElement(countryDropdown);
    }

    public WebElement setCountryDropdown(String country){
        this.getCountryDropdown().click();
        return this.fiendElement(this.getCountryDropdown().findElement(By.xpath("//option[normalize-space() = '"+country+"']")));
    }

    public WebElement getPhoneInput(){
        return this.fiendElement(phoneInput);
    }


    public WebElement getShippingRadio(){
        return this.fiendElement(shippingRadio);
    }

    public WebElement getNextButton(){
        return this.fiendElement(nextButton);
    }
}
