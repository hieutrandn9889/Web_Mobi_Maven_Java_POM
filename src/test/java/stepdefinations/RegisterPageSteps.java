package stepdefinations;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import ZingPoll_pages.ZingPoll_HomePage;
import ZingPoll_pages.ZingPoll_PageFactory;
import commons.AbstractTest;
import commons.Constants;
import commons.LogEvent;
import cucumber.api.java.en.Given;
import utility.Hook;

public class RegisterPageSteps extends AbstractTest {
	private WebDriver driver;
	private ZingPoll_HomePage homePage;
	LogEvent LOG;
	
	
	public RegisterPageSteps() {
		this.driver = Hook.getDriver();
	}

	@Given("^I am on ZingPoll website \"(.*?)\"$")
	public void i_am_on_ZingPoll_website(String browser) {
		
		driver.get(Constants.ZINGPOLL_URL);
		DOMConfigurator.configure("..//Web_Mobi_Maven_Java_POM/resource/log4j.xml");
		LOG = new LogEvent();
		LOG.info("ACTIVITY SCREEN: " + showActivityScreen());
		
		homePage = ZingPoll_PageFactory.getHomePage(driver);
		LOG.info("Open the Home page");
	}

	@Given("^I click the SignIn button$")
	public void i_click_the_SignIn_button() throws InterruptedException{
		homePage.clickSignInTitle();
		Thread.sleep(5000);
	}
	
	
	
}