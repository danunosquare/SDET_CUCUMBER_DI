package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"features"},
                 glue = {"steps"},
                plugin = {"pretty", "html:Report1.html"},
                dryRun = false,
                monochrome = true,
                tags = "@Sell or @home or @Advanced"
                )
public class TestRunner {
}
