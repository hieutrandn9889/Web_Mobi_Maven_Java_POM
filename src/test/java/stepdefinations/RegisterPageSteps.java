package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import commons.AbstractTest;
import commons.Constants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.PageFactory;
import utility.Hook;

public class RegisterPageSteps extends AbstractTest {
	private WebDriver driver;
	private HomePage homePage;

	public RegisterPageSteps() {
		this.driver = Hook.getDriver();
	}

	@Given("^I am on ZingPoll website \"(.*?)\"$")
	public void i_am_on_ZingPoll_website(String browser) {
		// Write code here that turns the phrase above into concrete actions
		driver.get(Constants.ZINGPOLL_URL);
		homePage = PageFactory.getHomePage(driver);
	}

	@Given("^I click the SignIn button$")
	public void i_click_the_SignIn_button() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		homePage.clickSignInTitle();
		Thread.sleep(5000);
	}
	
}