package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Created by {Bennette Molepo} on {2024/10/09}.
 * Email address {bennettemolepo@gmail.com}
 */
public class HomePage {
    WebDriver driver;

    @FindBy(xpath = "//a[text()='Samsung galaxy s6']")
    WebElement phoneItem;


    @FindBy(xpath = "//a[@href='#'][contains(.,'Add to cart')]")
    WebElement addToCartButton;


    @FindBy(id = "cartur")
    WebElement cartTextLink;

    @FindBy(xpath = "//button[text()='Place Order']")
    WebElement placeOderButton;


    @FindBy(id = "name")
    WebElement nameField;

    @FindBy(id = "card")
    WebElement creditCarInfo;

    @FindBy(xpath = "//button[contains(text(),'Purchase')]")
    WebElement purchaseButton;

    @FindBy(xpath = "//h2[contains(text(),'Thank you for your purchase!')]")
    WebElement orderIdValue;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void onItemTextLinkClick() throws InterruptedException {
        //new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(phoneItem));
        Thread.sleep(2000);
        phoneItem.click();
    }

    public void onAddToCartButtonClick() throws InterruptedException {
        Thread.sleep(2000);
        addToCartButton.click();
    }

    public void onDialogClick() throws InterruptedException {
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
    }

    public void onCartTextLinkClick() {
        cartTextLink.click();
    }

    public void onPlaceOderButtonClick() {
        placeOderButton.click();
    }

    public void onFillTheForm(String name, String creditInfo) {
        nameField.clear();
        nameField.sendKeys(name);
        creditCarInfo.clear();
        creditCarInfo.sendKeys(creditInfo);
    }

    public void onPurchaseButtonClick() {
        purchaseButton.click();
    }

    public void getOrderIdValue() {
        System.out.println(orderIdValue.getText());
    }
}
