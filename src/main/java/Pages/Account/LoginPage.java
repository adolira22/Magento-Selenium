package Pages.Global;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginPage {
    @Test
    public void testWaits() throws InterruptedException {

        ChromeDriver browser = new ChromeDriver();

        browser.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2xvZ291dFN1Y2Nlc3Mv/");

        //browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login[username]")));
        WebElement userName = browser.findElement(By.id("email"));
        WebElement password = browser.findElement(By.name("login[password]"));
        WebElement login = browser.findElement(By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]"));

        userName.sendKeys("lilianaracelig@hotmail.com");
        password.sendKeys("Abcd2024@cd ");
        login.click();


    }
}
