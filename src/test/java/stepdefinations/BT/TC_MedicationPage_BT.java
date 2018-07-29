package stepdefinations.BT;

import org.apache.log4j.xml.DOMConfigurator;
import BT_pages.HomePage_BT;
import BT_pages.PageFactory_BT;
import BT_pages.SignUpPage_BT;
import commons.LogEvent;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utility.Hook;

public class TC_MedicationPage_BT {

	AppiumDriver<MobileElement> driverAppium;
	LogEvent LOG;
	static BT_pages.SkipPage_BT skipPage;
	static BT_pages.LogInPage_BT loginPage;
	static SignUpPage_BT signUpPage;
	static HomePage_BT homePage;

	public TC_MedicationPage_BT() {
		this.driverAppium = Hook.getAppiumDriver();
	}

	@Then("^I stay medication page$")
	public void i_stay_medication_page() {
		try {
			DOMConfigurator.configure("..//Web_Mobi_Maven_Java_POM/resource/log4j.xml");
			LOG = new LogEvent();
			LOG.info("Open application");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Then("^I click add a medication$")
	public void i_click_add_a_medication() {
		try {
		
			TC_MenuTaskBar_Page_BT.medication.clickAddAMedicationBtn();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	

}
