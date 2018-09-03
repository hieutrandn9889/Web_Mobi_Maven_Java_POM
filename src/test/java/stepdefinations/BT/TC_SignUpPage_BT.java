package stepdefinations.BT;
import org.apache.log4j.xml.DOMConfigurator;
import BT_pages.HomePage_BT;
import BT_pages.PageFactory_BT;
import commons.LogEvent;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utility.Hook;
public class TC_SignUpPage_BT {
	AppiumDriver<MobileElement> driverAppium;
	LogEvent LOG;
	static BT_pages.SkipPage_BT skipPage;
	static BT_pages.SignUpPage_BT signUpPage;
	static HomePage_BT homePage;

	public TC_SignUpPage_BT() {
		this.driverAppium = Hook.getAppiumDriver();
	}

	@Given("^I open application$")
	public void i_open_the_application_IOS() {

		DOMConfigurator.configure("..//Web_Mobi_Maven_Java_POM/resource/log4j.xml");
		LOG = new LogEvent();
		LOG.info("Open application");
	}

	@When("^I click skip button to going register screen$")
	public void i_click_skip_button() {
		try {

			skipPage = PageFactory_BT.getSkipPage(driverAppium);
			signUpPage = skipPage.openSignInPageForSkip_BT(driverAppium);
			LOG.info("Swide screen 1 page");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Then("^I click FB button of app$")
	public void i_click_Fb_btn() {
		try {
			System.out.println("test");
			signUpPage.clickFBBtn();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Then("^I click Google plus button of app$")
	public void i_click_Google_plus_btn() {
		try {
			signUpPage.clickGoglePlusBtn();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}





	