package runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		format	 = {"pretty", "json:target//json//cucumber.json", "html:target//html//"},
//		features = {"src//test//resources//features//ZP//RegisterTo_ZP_Scenario.feature"}, 
		features = {"src//test//resources//features"}, 
//		features = { "src/test/java/features/Register.feature" }, 
		glue = { "stepdefinations","utility" },
		tags = {"@Chrome"}
)

@Test
public class Runner extends AbstractTestNGCucumberTests {

}
