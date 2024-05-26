package Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Page {

    protected WebDriver driver;
    protected WebDriverWait wait;
    private static final int WAIT_TIMEOUT = 120;
    private static final int POLLING_TIME = 1;

    public Page(WebDriver driver){
        this.driver = driver;
    }

    public WebElement fiendElement(WebElement element){
        return this.fluentWaitElement(element);
    }

    private WebElement fluentWaitElement(WebElement element){
        Wait<WebDriver> wait = new FluentWait<WebDriver>(this.driver)
                .withTimeout(Duration.ofSeconds(WAIT_TIMEOUT))
                .pollingEvery(Duration.ofSeconds(POLLING_TIME))
                .ignoring(NoSuchElementException.class);
        return wait.until(ExpectedConditions.visibilityOf(element));

    }
}
