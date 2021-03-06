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

public class TC_LogInPage_BT {
	AppiumDriver<MobileElement> driverAppium;
	LogEvent LOG;
	static BT_pages.SkipPage_BT skipPage;
	static BT_pages.LogInPage_BT loginPage;
	static SignUpPage_BT signUpPage;
	static HomePage_BT homePage;

	public TC_LogInPage_BT() {
		this.driverAppium = Hook.getAppiumDriver();
	}

	@Given("^I open app and testing$")
	public void i_open_the_application_IOS() {

		DOMConfigurator.configure("..//Web_Mobi_Maven_Java_POM/resource/log4j.xml");
		LOG = new LogEvent();
		LOG.info("Open application");
	}

	@When("^I click skip button$")
	public void i_click_skip_button() {
		try {

			skipPage = PageFactory_BT.getSkipPage(driverAppium);
			signUpPage = skipPage.openSignInPageForSkip_BT(driverAppium);
			LOG.info("Swide screen 1 page");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Then("^I click login button to login$")
	public void i_click_login_button_to_login() {
		try {
			loginPage = signUpPage.clickLoginBtnInSignUpPage();
			LOG.info("login page");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Then("^I input email \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_input_email_password(String email, String password) {
		try {
			loginPage.enterUserName(email);
			driverAppium.hideKeyboard();
			loginPage.enterPass(password);
			driverAppium.hideKeyboard();
			LOG.info("Input value");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Then("^I click login button of app$")
	public HomePage_BT i_click_login() {
		try {
			return homePage = loginPage.clickLOGIN();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	

}
