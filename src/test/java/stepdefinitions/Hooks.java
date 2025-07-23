package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
 
public class Hooks {
 
    @Before
    public void setup() {
        // Initialize the browser before each scenario
        DriverFactory.getDriver().manage().window().maximize();
    }
 
    @After
    public void tearDown() {
        // Quit the same browser session after each scenario
       DriverFactory.quitDriver();
    }
}