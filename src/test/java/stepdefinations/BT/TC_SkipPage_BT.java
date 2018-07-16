package stepdefinations.BT;

import org.apache.log4j.xml.DOMConfigurator;

import BT_pages.PageFactory_BT;
import BT_pages.SkipPage_BT;
import commons.LogEvent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utility.Hook;

public class TC_SkipPage_BT {

	AppiumDriver<MobileElement> driverAppium;
	LogEvent LOG;
	BT_pages.SkipPage_BT skipPage;
	private SkipPage_BT swideScreen1;
	private SkipPage_BT swideScreen2;

	public TC_SkipPage_BT() {
		this.driverAppium = Hook.getAppiumDriver();
	}
	
	@Given("^I open application amd show skip screen$")
	public void i_open_the_application() {

		DOMConfigurator.configure("..//Web_Mobi_Maven_Java_POM/resource/log4j.xml");
		LOG = new LogEvent();
		LOG.info("Open application");
	}
	
	@Then("^I swide screen1$")
	public void i_swide_screen1() {
		try {
			LOG.info("I state the first screen in Skip page");
			skipPage = PageFactory_BT.getSkipPage(driverAppium);
			swideScreen1 = skipPage.swideSkipPage_BT(driverAppium);
			LOG.info("Swide screen 1 page");
			Thread.sleep(5000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Then("^I swide screen2$")
	public void i_swide_screen2() {
		try {
			swideScreen2 = swideScreen1.swideSkipPage_BT(driverAppium);
			LOG.info("Swide screen 2 page");
			Thread.sleep(5000);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@And("^I swide screen3$")
	public void i_swide_screen3() {
		try {
			swideScreen2.swideSkipPage_BT(driverAppium);
			LOG.info("Swide screen 3 page");
			Thread.sleep(5000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
