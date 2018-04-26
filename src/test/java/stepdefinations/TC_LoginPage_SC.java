package stepdefinations;

import org.apache.log4j.xml.DOMConfigurator;

import SC_pages.PageFactory;
import commons.AbstractTest;
import commons.Constants;
import commons.LogEvent;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utility.Hook;

public class TC_LoginPage_SC extends AbstractTest {

	private AppiumDriver<MobileElement> driverAppium;
	LogEvent LOG;
	SC_pages.LogInPage loginPage;
	SC_pages.SignUpPage signUpPage;

	// test data
	private String _valid_mail = Constants.USEREMAIL;
	private String _valid_pass = Constants.PASSWORD;

	public TC_LoginPage_SC() {
		this.driverAppium = Hook.getAppiumDriver();
	}

	// check information api
	@Given("^I open the app$")
	public void I_open_the_app() {
		System.out.println("Open application API demos");
	}

	// click login button
	@When("^I click login button$")
	public void i_click_login_button() {
		try {
			signUpPage = PageFactory.getSignUpPage(driverAppium);
			loginPage = signUpPage.openLogInPage(driverAppium);
			
			DOMConfigurator.configure("..//Web_Mobi_Maven_Java_POM/resource/log4j.xml");
			LOG = new LogEvent();
			LOG.info("ACTIVITY SCREEN: " + showActivityScreen());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Then("^I input username \"([^\"]*)\"$")
	public void i_input_username(String username) {
		try {
			loginPage.enterUserName(_valid_mail);
			LOG.info("Input username");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Then("^I input password \"([^\"]*)\"$")
	public void i_input_password(String password) {
		try {
			loginPage.enterPass(_valid_pass);
			LOG.info("Input password");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}	
	@Then("^I click submit button$")
	public void i_click_submit_button() {
		try {
			loginPage.clickLOGIN();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
