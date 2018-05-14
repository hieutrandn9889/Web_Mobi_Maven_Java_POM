package stepdefinations;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;

import commons.AbstractMobile;
import commons.LogEvent;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utility.Hook;
public class iOSscenario extends AbstractMobile {
	AppiumDriver<MobileElement> driverAppium;
	LogEvent LOG;
	
	public iOSscenario() {
		this.driverAppium = Hook.getAppiumDriver();
	}
	
	@Given("^I open application IOS$")
	public void i_open_the_application_IOS() {
		
		DOMConfigurator.configure("..//Web_Mobi_Maven_Java_POM/resource/log4j.xml");
		LOG = new LogEvent();
		LOG.info("Open application");
	}

	@When("^I click skip button$")
	public void i_click_skip_button(){
		try {
			MobileElement skip = driverAppium.findElement(By.xpath("(//XCUIElementTypeOther[@name='Skip'])[6]"));
			skip.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Then("^I input email \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_input_email_password(String email, String password) {
		try {
			driverAppium.findElement(By.xpath("	//XCUIElementTypeOther[@name='Enter email here']")).sendKeys(email);
			// password
			driverAppium.findElement(By.xpath("	//XCUIElementTypeOther[@name='Enter password']")).sendKeys(password);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Then("^I click login button of app$")
	public void i_click_login(){
		try {
			driverAppium.findElement(By.xpath("//XCUIElementTypeOther[@name='Login']")).click();
			
			Thread.sleep(5000);
			LOG.info("Login is successful");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
