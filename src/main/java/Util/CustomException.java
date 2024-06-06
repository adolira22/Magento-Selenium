package Util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import java.io.File;

public class CustomException extends WebDriverException {

    public CustomException(String classNme, String errorMessage, WebDriver driver) {
        super(errorMessage);
        takeScreenshot(driver);
        System.out.println(classNme + " " + errorMessage);
        System.out.println(this.getMessage());
    }

    public static void takeScreenshot(WebDriver driver){
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
}
