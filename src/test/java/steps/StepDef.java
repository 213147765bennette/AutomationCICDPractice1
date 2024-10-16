package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import utils.BrowserFactory;

import java.time.Duration;

/**
 * Created by {Bennette Molepo} on {2024/10/09}.
 * Email address {bennettemolepo@gmail.com}
 */
public class StepDef {

    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    BrowserFactory browserFactory = new BrowserFactory();

    @Given("User can be able to login with valid credentials")
    public void user_can_be_able_to_login_with_valid_credentials() {
        driver = browserFactory.startApp("chrome", "https://demoblaze.com/index.html");
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @When("user clicks on login link")
    public void userClicksOnLoginLink() {
        loginPage.onLoginLinkClick();
    }

    @And("User enter valid {string} and {string}")
    public void user_enter_valid_and(String userName, String password) {
        loginPage.onEnterValidCredentials(userName, password);
    }

    @And("User press login button")
    public void user_press_login_button() {
        loginPage.onLoginButtonClick();
    }

    @Then("user is presented with a homepage screen")
    public void user_is_presented_with_a_homepage_screen() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.onValidateLogin();
    }


    @And("User clicks on the item to order")
    public void user_clicks_on_the_item_to_order() throws InterruptedException {
        homePage.onItemTextLinkClick();
    }

    @And("User press Add to cart button")
    public void user_press_add_to_cart_button() throws InterruptedException {
        homePage.onAddToCartButtonClick();
    }

    @And("User click on ok dialog button")
    public void user_click_on_ok_dialog_button() throws InterruptedException {
        homePage.onDialogClick();
    }

    @And("User clicks on cart link text")
    public void user_clicks_on_cart_link_text() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        homePage.onCartTextLinkClick();
    }

    @And("User press on Place Order button")
    public void user_press_on_place_order_button() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        homePage.onPlaceOderButtonClick();
    }

    @And("User fills in {string} and {string} information")
    public void user_fills_in_and_information(String name, String cardInfo) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        homePage.onFillTheForm(name, cardInfo);
    }

    @And("User press the Purchase button")
    public void user_press_the_purchase_button() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        homePage.onPurchaseButtonClick();
    }

    @And("Order is printed out")
    public void order_is_printed_out() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        homePage.getOrderIdValue();
    }

    @After
    public void tearDown() {
        //browserFactory.tearDown();
    }
}



