package TestCaseImplements;

import Util.CustomException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.util.Random;

public class TestCase {

    protected static WebDriver driver;

    @BeforeClass
    public void setUp(){

        //driver = new ChromeDriver();

    }

    @BeforeMethod
    public void beforeMethod(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @AfterMethod
    public void afterMethod(ITestResult result){
        if (result.getStatus() == ITestResult.FAILURE){
            CustomException.takeScreenshot(driver);
        }
        //driver.close();
    }

    @AfterClass
    public void afterClass(){

    }


    public String getEmailRandom(){
        Random rand = new Random();
        return "pedro" + rand.nextInt(1000) + "@yopmail.com";
    }


    public void takeScreenshot(WebDriver driver){
        if (driver instanceof TakesScreenshot){

            File screenshot = ((TakesScreenshot) driver).getScreenshotAs((OutputType.FILE));
            new File("./target/screenshots").mkdirs();
            try {
                FileUtils.copyToDirectory(screenshot, new File("./target/screenshots"));
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }


    public void assertTrue(boolean condition){
        if (!condition){
            throw new CustomException(this.getClass().getName(), "Test failed", driver);
        }
    }



}
