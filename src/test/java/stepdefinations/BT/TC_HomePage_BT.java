package stepdefinations.BT;

import org.apache.log4j.xml.DOMConfigurator;

import BT_pages.HomePage_BT;
import BT_pages.Medication_BT;
import BT_pages.MenuTaskBar_BT;
import commons.LogEvent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utility.Hook;

public class TC_HomePage_BT {
	AppiumDriver<MobileElement> driverAppium;
	LogEvent LOG;
	
	static MenuTaskBar_BT  menuTaskBar;

	public TC_HomePage_BT() {
		this.driverAppium = Hook.getAppiumDriver();
	}

	@Then("^I see home page$")
	public void i_see_home_page() {
		DOMConfigurator.configure("..//Web_Mobi_Maven_Java_POM/resource/log4j.xml");
		LOG = new LogEvent();
		LOG.info("Enter Home page");
	}

	@Then("^I click allow button$")
	public void i_click_allow_button() {
		try {
			TC_LogInPage_BT.homePage.clickAllowBtn();
			LOG.info("Enter Add new event");
			Thread.sleep(5000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Then("^I click menu taskbar$")
	public MenuTaskBar_BT i_click_menu_taskbar() {
		try {
			Thread.sleep(5000);
			return menuTaskBar = TC_LogInPage_BT.homePage.clickMenuTaskBar();
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
}
