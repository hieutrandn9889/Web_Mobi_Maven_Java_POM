package stepdefinations.BT;

import BT_pages.HomePage_BT;
import BT_pages.Medication_BT;
import BT_pages.MenuTaskBar_BT;
import commons.LogEvent;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utility.Hook;

public class TC_MenuTaskBar_Page_BT {
	AppiumDriver<MobileElement> driverAppium;
	LogEvent LOG;
	static HomePage_BT homePage;
	static MenuTaskBar_BT  menuTaskBar;
	static Medication_BT medication;

	public TC_MenuTaskBar_Page_BT() {
		this.driverAppium = Hook.getAppiumDriver();
	}
	
	@Then("^I click My Pa button$")
	public void i_click_my_pa_btn() {
		try {
			 TC_HomePage_BT.menuTaskBar.clickMyPa();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Then("^I click medication button$")
	public Medication_BT i_click_medication_btn() {
		try {
			return medication = TC_HomePage_BT.menuTaskBar.clickMedication();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
}
