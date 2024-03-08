package cucumberSelenium.bucaCep;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features    = "classpath:features/buscaCep.feature",
        plugin      = {
                "pretty",
                "json:target/json/testreport.json",
                "html:target/html/native-cucumber-reporting.html",
                "junit:target/junit/testreport.xml"
        },
        tags        = "@selenium",
        glue        = "cucumberSelenium.bucaCep")
public class TestRunner {
}