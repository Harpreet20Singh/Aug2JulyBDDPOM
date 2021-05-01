package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\tony2\\OneDrive\\Desktop"
		+ "\\Eclipse Workspace\\Aug2JulyBDDPOM\\src\\main\\java\\features",
         glue = "step_definitions",
         plugin = {"pretty", "html:target/demoTours-reports.html"},
         monochrome = true)

public class TestRunner {

}
