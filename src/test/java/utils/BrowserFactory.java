package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

/**
 * Created by {Bennette Molepo} on {2024/10/09}.
 * Email address {bennettemolepo@gmail.com}
 */
public class BrowserFactory {
    public static WebDriver driver;

    public WebDriver startApp(String browserName, String url) {

        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else {
            driver = new SafariDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(url);
        return driver;
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver.close();
        }
    }
}
