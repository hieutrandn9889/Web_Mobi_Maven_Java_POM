package runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		format	 = {"pretty", "json:target//json//cucumber.json", "html:target//html//"},
		features = {"src//test//resources//features"}, 
		glue = { "stepdefinations","utility" },
		tags = {"@Medication"}
)

@Test
public class Runner extends AbstractTestNGCucumberTests {

}
