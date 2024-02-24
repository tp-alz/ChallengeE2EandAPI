package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "steps", plugin = { "pretty",
        "json:target/cucumber-reports/Cucumber.json" }, monochrome = true, tags = "@DemoBlaze")

// FOR CI/CD JSON FORMAT REPORT
// "json:target/cucumber-reports/Cucumber.json"

// FOR WEB HTML LOCAL RUN REPORTS
// "html:target/cucumber-reports"

public class runner {
    @AfterClass
    public static void cleanDriver() {
        BasePage.closeBrowser();
    }
}