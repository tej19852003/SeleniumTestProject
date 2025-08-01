import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/main/java/com/test/features",
        glue = "com.test.stepdefinitions",
        tags = "@first1"
//        plugin = {"pretty", "html:target/cucumber-reports.html"}

)

public class TestRunner {
}
