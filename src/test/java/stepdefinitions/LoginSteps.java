package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import factory.DriverFactory;
import factory.PageFactory;
 
import static org.testng.Assert.assertTrue;
 
public class LoginSteps {
 
    @Given("I am on shopping site")
    public void navigateToShoppingSite() {
DriverFactory.getDriver().get("https://sauce-demo.myshopify.com/account/login");
    }
 
    @When("I enter username")
    public void enterUsername() {
        PageFactory.getLoginPage().enterUsername("vikalprathore710@gmail.com");
    }
 
    @And("I enter password")
    public void enterPassword() {
        PageFactory.getLoginPage().enterPassword("Stack@125");
    }
 
    @And("I click on Sign in")
    public void clickOnSignInBtn() {
        PageFactory.getLoginPage().clickOnSignInBtn();
    }
 
    @Then("I should be on accounts page")
    public void verifyAccountsPage() {
        String currentUrl = DriverFactory.getDriver().getCurrentUrl();
        assertTrue(currentUrl.contains("/account"),
                "Login failed! Current URL: " + currentUrl);
    }
}