
package stepdefinations.BT;
import org.apache.log4j.xml.DOMConfigurator;
import BT_pages.HomePage_BT;
import BT_pages.PageFactory_BT;
import BT_pages.SignUpPage_BT;
import BT_pages.SkipPage_BT;
import commons.LogEvent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utility.Hook;

public class TC_SkipPage_BT<swideScreen1> {
	AppiumDriver<MobileElement> driverAppium;
	LogEvent LOG;
	static BT_pages.SkipPage_BT skipPage;
	static SignUpPage_BT signUpPage;
	static HomePage_BT homePage;
	private SkipPage_BT swideScreen1;
	private SkipPage_BT swideScreen2;
	private SkipPage_BT swideScreen3;
	
	public TC_SkipPage_BT() {
		this.driverAppium = Hook.getAppiumDriver();
	}

	@Given("^I open application amd show skip screen$")
	public void i_open_the_application_IOS() {

		DOMConfigurator.configure("..//Web_Mobi_Maven_Java_POM/resource/log4j.xml");
		LOG = new LogEvent();
		LOG.info("Open application");
		
	}

	@Then("^I swide screen1$")
	public void i_click_skip_button() {
		try {

			skipPage = PageFactory_BT.getSkipPage(driverAppium);
			swideScreen1 = skipPage.swideSkipPage_BT(driverAppium);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Then("^I swide screen2$")
	public void i_swide_screen2() {
		try {
			swideScreen2 = swideScreen1.swideSkipPage_BT(driverAppium);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Then("^I swide screen3$")
	public void i_swide_screen3() {
		try {
			swideScreen3 =  swideScreen2.swideSkipPage_BT(driverAppium);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@And("^I click finish button$")
	public void i_click_finish_button() {
		try {
			signUpPage = swideScreen3.openSignUpPageForFinish_BT(driverAppium);
			LOG.info("I staty in home page");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
