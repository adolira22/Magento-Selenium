package Pages.Account;

import Pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends Page {
    public CreateAccountPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this );
    }

    @FindBy(id = "firstname")
    private WebElement firstName;

    @FindBy(id = "lastname")
    private WebElement lastName;

    @FindBy(id = "email_address")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "password-confirmation")
    private WebElement confirmPassword;

    @FindBy(xpath = "//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")
    private WebElement createAccountButton;

    @FindBy(id = "firstname-error")
    private WebElement firstNameErrorMessage;

    @FindBy(id = "lastname-error")
    private WebElement lastNameErrorMessage;

    @FindBy(id = "email_address-error")
    private WebElement emailErrorMessage;

    @FindBy(id = "password-error")
    private WebElement passwordErrorMessage;

    @FindBy(id = "password-confirmation-error")
    private WebElement confirmPasswordErrorMessage;


    public WebElement getFirstNameInput(){
        return this.fiendElement(firstName);
    }

    public void setLastNameInput(String lastName){
        WebElement lastNameInput = this.fiendElement(this.lastName);
        lastNameInput.sendKeys(lastName);
    }

    public WebElement getEmailInput(){
        return this.fiendElement(email);
    }

    public WebElement getPasswordInput(){
        return this.fiendElement(password);
    }

    public WebElement getConfirmPasswordInput(){
        return this.fiendElement(confirmPassword);
    }


    public WebElement getCreateAccountButton(){
        return this.fiendElement(createAccountButton);
    }


    public WebElement getFirstNameErrorMessage(){
            return this.fiendElement(firstNameErrorMessage);
    }

    public WebElement getLastNameErrorMessage(){
        return this.fiendElement(lastNameErrorMessage);
    }

    public WebElement getEmailErrorMessage(){
        return this.fiendElement(emailErrorMessage);
    }

    public WebElement getPasswordErrorMessage(){
        return this.fiendElement(passwordErrorMessage);
    }

    public WebElement getConfirmPasswordErrorMessage(){
        return this.fiendElement(confirmPasswordErrorMessage);
    }








}
