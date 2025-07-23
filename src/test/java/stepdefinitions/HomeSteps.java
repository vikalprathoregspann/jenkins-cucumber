/*
 * package stepdefinitions;
 * 
 * import io.cucumber.java.en.And; import io.cucumber.java.en.Given; import
 * io.cucumber.java.en.Then; import io.cucumber.java.en.When; import
 * org.openqa.selenium.By; import factory.DriverFactory;
 * 
 * import static org.testng.Assert.assertTrue;
 * 
 * public class HomeSteps {
 * 
 * @Given("I am on shopping site") public void navigateToShoppingSite() {
 * DriverFactory.getDriver().get(
 * "https://sauce-demo.myshopify.com/account/login"); }
 * 
 * @When("I enter username") public void enterUsername() {
 * DriverFactory.getDriver() .findElement(By.id("CustomerEmail"))
 * .sendKeys("shubham.mathur@gspann.com"); }
 * 
 * @And("I enter password") public void enterPassword() {
 * DriverFactory.getDriver() .findElement(By.id("CustomerPassword"))
 * .sendKeys("12345678"); }
 * 
 * @And("I click on Sign in") public void clickOnSignInBtn() {
 * DriverFactory.getDriver() .findElement(By.xpath("//*[@value='Sign In']"))
 * .click(); }
 * 
 * @Then("I should be on accounts page") public void verifyAccountsPage() {
 * String currentUrl = DriverFactory.getDriver().getCurrentUrl();
 * assertTrue(currentUrl.contains("/account"), "Login failed! Current URL: " +
 * currentUrl); } }
 */