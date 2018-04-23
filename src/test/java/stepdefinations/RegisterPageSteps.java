package stepdefinations;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import commons.AbstractTest;
import commons.Constants;
import commons.LogEvent;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.PageFactory;
import utility.Hook;

public class RegisterPageSteps extends AbstractTest {
	private WebDriver driver;
	private HomePage homePage;
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
		
		homePage = PageFactory.getHomePage(driver);
		LOG.info("Open the Home page");
	}

	@Given("^I click the SignIn button$")
	public void i_click_the_SignIn_button() throws InterruptedException{
		homePage.clickSignInTitle();
		Thread.sleep(5000);
	}
	
	
	
}