package stepdefinations.ZP;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;

import ZP_pages.ZingPoll_HomePage;
import ZP_pages.ZingPoll_PageFactory;
import commons.AbstractTest;
import commons.LogEvent;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utility.Hook;

public class TC_RegisterPageSteps_ZP extends AbstractTest {
	WebDriver driver = Hook.getDriver();
	private ZingPoll_HomePage homePage = new ZingPoll_HomePage();
	LogEvent LOG;

	@Given("^I am on ZingPoll website$")
	public void i_am_on_ZingPoll_website() {
		
//		driver.get(Constants.ZINGPOLL_URL);
		homePage.openZingPollPage();
		DOMConfigurator.configure("..//Web_Mobi_Maven_Java_POM/resource/log4j.xml");
		LOG = new LogEvent();
		LOG.info("ACTIVITY SCREEN: " + showActivityScreen());
		
		homePage = ZingPoll_PageFactory.getHomePage(driver);
		LOG.info("Open the Home page");
	}

	@Then("^I click the SignIn button$")
	public void i_click_the_SignIn_button() throws InterruptedException{
		homePage.clickSignInTitle();
		Thread.sleep(5000);
	}
	
	@Then("^I input username (.+) and password (.+)$")
	public void i_input_username_and_password(String username, String password) throws Throwable {
		// (.+): truyền cho  <username> với examples
		// \"(.*?)\" : truyền cho "chrome" and "<content_dropdown>"
		homePage.typeIntoEmail(username);
		homePage.typeIntoPassword(password);
	}
	
	
	
}