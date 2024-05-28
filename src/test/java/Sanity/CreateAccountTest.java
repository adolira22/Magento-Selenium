package Sanity;

import Pages.Account.CreateAccountPage;
import Pages.Global.TopHeaderPage;
import TestCaseImplements.TestCase;
import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateAccountTest extends TestCase {


    @Test
    public void createAccountUser(){
        TopHeaderPage topHeaderPage = new TopHeaderPage(driver);
        CreateAccountPage createAccount = new CreateAccountPage(driver);


        topHeaderPage.getCreateAccountLink().click();
        createAccount.getFirstNameInput().sendKeys("Pedro");
        createAccount.setLastNameInput("Torres");
        createAccount.getEmailInput().sendKeys(getEmailRandom());
        createAccount.getPasswordInput().sendKeys("Pedro@123.");
        createAccount.getConfirmPasswordInput().sendKeys("Pedro@123.");
        createAccount.getCreateAccountButton().click();
        Assert.assertTrue(createAccount.isTextPresent("Thank you for registering with Main Website Store."));


    }

    @Test
    public void validateReistrationForm(){

        String errorMsg = "This is a required field.";

        SoftAssert softAssert = new SoftAssert();

        TopHeaderPage topHeaderPage = new TopHeaderPage(driver);
        CreateAccountPage createAccount = new CreateAccountPage(driver);

        topHeaderPage.getCreateAccountLink().click();
        createAccount.getCreateAccountButton().click();

        softAssert.assertEquals(createAccount.getFirstNameErrorMessage().getText(), errorMsg);
        softAssert.assertEquals(createAccount.getLastNameErrorMessage().getText(), errorMsg);
        softAssert.assertEquals(createAccount.getEmailErrorMessage().getText(), errorMsg);
        softAssert.assertEquals(createAccount.getPasswordErrorMessage().getText(), errorMsg);
        softAssert.assertEquals(createAccount.getConfirmPasswordErrorMessage().getText(), errorMsg);
        softAssert.assertAll();



    }








}
