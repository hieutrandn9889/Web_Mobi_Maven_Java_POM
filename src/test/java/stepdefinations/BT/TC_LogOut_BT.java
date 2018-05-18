package stepdefinations.BT;

import org.apache.log4j.xml.DOMConfigurator;

import commons.LogEvent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utility.Hook;

public class TC_LogOut_BT {
	AppiumDriver<MobileElement> driverAppium;
	LogEvent LOG;	
	
	public TC_LogOut_BT() {
		this.driverAppium = Hook.getAppiumDriver();
	}

	@Then("^I open homepage$")
	public void i_open_homepage() {
		DOMConfigurator.configure("..//Web_Mobi_Maven_Java_POM/resource/log4j.xml");
		LOG = new LogEvent();
		LOG.info("Enter Home page");
	}

	@And("^I click logout button$")
	public void i_click_logout_button() {
		try {
			LOG.info("Clicking logout button.");
			TC_LoginPage_BT.homePage.clickLogOutBtn();
			LOG.info("Logout page");
			Thread.sleep(5000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
