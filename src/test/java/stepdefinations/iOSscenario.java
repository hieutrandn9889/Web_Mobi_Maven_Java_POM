package stepdefinations;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;

import commons.AbstractMobile;
import commons.LogEvent;
import cucumber.api.java.en.Given;
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
		System.out.println("Open application UI demos");
	}

	@When("^I click UI to testing click function$")
	public void i_click_UI() {
		try {
			DOMConfigurator.configure("..//Web_Mobi_Maven_Java_POM/resource/log4j.xml");
			LOG = new LogEvent();
			Thread.sleep(5000);	
			LOG.info("CLICK");
			MobileElement skip = driverAppium.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Toolbars']"));
			skip.click();
			Thread.sleep(5000);	

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

}
