package Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/resources/customerRegister.feature", glue = "Cucumber", plugin = {""})
public class TestRunner extends AbstractTestNGCucumberTests {
}
