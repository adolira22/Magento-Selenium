package Sanity;

import Pages.Global.TopHeaderPage;
import TestCaseImplements.TestCase;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestCase {


    @Test
    public void createAccountUser(){
        TopHeaderPage topHeaderPage = new TopHeaderPage(driver);

        topHeaderPage.getCreateAccountLink().click();

    }








}
