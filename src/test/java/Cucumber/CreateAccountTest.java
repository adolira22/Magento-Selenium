package Cucumber;

import Pages.Account.CreateAccountPage;
import Pages.Global.TopHeaderPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccountTest {

    static WebDriver driver = new ChromeDriver();

    @Given("En el menu dar clcik en link de registro")
    public void en_el_menu_dar_clcik_en_link_de_registro() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
        TopHeaderPage topHeaderPage = new TopHeaderPage(driver);
        topHeaderPage.getCreateAccountLink().click();
    }

    @When("El formulario se cargara y llenar los datos")
    public void el_formulario_se_cargara_y_llenar_los_datos() {
        CreateAccountPage createAccount = new CreateAccountPage(driver);

        createAccount.getFirstNameInput().sendKeys("Pedro");
        createAccount.setLastNameInput("Torres");
        createAccount.getEmailInput().sendKeys("pedroJose1234567@yopmail.com");
        createAccount.getPasswordInput().sendKeys("Pedro@123.");
        createAccount.getConfirmPasswordInput().sendKeys("Pedro@123.");


    }
    @When("click en el boton enviar")
    public void click_en_el_boton_enviar() {
        CreateAccountPage createAccount = new CreateAccountPage(driver);
        createAccount.getCreateAccountButton().click();

    }
    @Then("Se creara el usuario y debe mostar la pagina de la cuenta")
    public void se_creara_el_usuario_y_debe_mostar_la_pagina_de_la_cuenta() {
        CreateAccountPage createAccount = new CreateAccountPage(driver);
        Assert.assertTrue(createAccount.isTextPresent("Thank you for registering with Main Website Store."));

    }
}
