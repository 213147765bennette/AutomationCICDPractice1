package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * Created by {Bennette Molepo} on {2024/10/09}.
 * Email address {bennettemolepo@gmail.com}
 */
public class LoginPage {

    WebDriver driver;

    @FindBy(id = "login2")
    WebElement loginLink;

    @FindBy(id = "loginusername")
    WebElement userNameField;

    @FindBy(id = "loginpassword")
    WebElement passwordNameField;

    @FindBy(xpath = "//button[text()='Log in']")
    WebElement loginButton;

    @FindBy(id = "logout2")
    WebElement validateText;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void onLoginLinkClick() {
        loginLink.click();
    }

    public void onEnterValidCredentials(String userName, String password) {
        userNameField.clear();
        userNameField.sendKeys(userName);
        passwordNameField.clear();
        passwordNameField.sendKeys(password);
    }

    public void onLoginButtonClick() {
        loginButton.click();
    }

    public void onValidateLogin() {
        //Assert.assertEquals(validateText.getText(),"Log out");
    }
}
