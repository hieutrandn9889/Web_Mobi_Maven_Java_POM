package stepdefinations.Calculator;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Calculator_pages.calculator_page;
import ZP_pages.ZingPoll_HomePage;
import commons.AbstractTest;
import commons.LogEvent;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import interfaces.calculatorUI;
import utility.Hook;

public class TC_calculatorScenario extends AbstractTest {
	WebDriver driverAppium = Hook.getAppiumDriver();
	private calculator_page cal = new calculator_page();
	LogEvent LOG;

	@Given("^I open the Calculator application$")
	public void i_open_the_Calculator_application() {
		System.out.println("Opened calculator app");
		DOMConfigurator.configure("..//Web_Mobi_Maven_Java_POM/resource/log4j.xml");
		LOG = new LogEvent();
		LOG.info("ACTIVITY SCREEN: " + showActivityMobileScreen());
	}

	@When("^I click number seven$")
	public void i_click_number_seven() {
		// click number 7
//		driverAppium.findElement(By.id(calculatorUI.NUMER_SEVEN)).click();
		cal.clickSevenNumber();
		LOG.info("number seven");
	}

	@Then("^I click plus$")
	public void i_click_plus() {
		// click symbol plus
//		driverAppium.findElement(By.id(calculatorUI.SYMBOL_PlUS)).click();
		cal.clickPlus();
		LOG.info("plus");

	}

	@Then("^I click number two$")
	public void i_click_number_two() {
		// click number 2
//		driverAppium.findElement(By.id(calculatorUI.NUMER_TWO)).click();
		cal.clickTwoNumber();
		LOG.info("number two");
	}

	@Then("^I click equal$")
	public void i_click_equal() {

//		driverAppium.findElement(By.id(calculatorUI.SYMBOL_EQUAL)).click();
		cal.clickEqual();
		LOG.info("equal");

	}

	@Then("^I validate value$")
	public void i_validate_value() {
		String text = driverAppium.findElement(By.id(calculatorUI.RESULT)).getText();
		if (text.equals("9")) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
	}

	protected calculatorUI calc = new calculatorUI();
}
