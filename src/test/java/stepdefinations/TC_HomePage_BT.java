package stepdefinations;

import org.apache.log4j.xml.DOMConfigurator;

import commons.LogEvent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utility.Hook;

public class TC_HomePage_BT {
	AppiumDriver<MobileElement> driverAppium;
	LogEvent LOG;	
	
	public TC_HomePage_BT() {
		this.driverAppium = Hook.getAppiumDriver();
	}

	@Then("^I see home page$")
	public void i_see_home_page() {
		DOMConfigurator.configure("..//Web_Mobi_Maven_Java_POM/resource/log4j.xml");
		LOG = new LogEvent();
		LOG.info("Enter Home page");
	}

	@And("^I click add new event$")
	public void i_click_add_new_button() {
		try {
			LOG.info("Staring click add new events.");
			TC_LoginPage_BT.homePage.clickAddNewEvent();
			LOG.info("Enter Add new event");
			Thread.sleep(5000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
