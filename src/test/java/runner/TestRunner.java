package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Created by {Bennette Molepo} on {2024/10/09}.
 * Email address {bennettemolepo@gmail.com}
 */
@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {"html:target//cucumberTestReport.html"},
        glue = {"steps"},
        tags = "@regression",
        publish = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
