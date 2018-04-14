package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import interfaces.apiAppDemoUI;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PressesKeyCode;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import pages.AbstractMobile;
import utility.Hook;

public class AppiumScenario extends AbstractMobile {

	private AppiumDriver<MobileElement> driverAppium;
	private AndroidDriver<MobileElement> driverAndroid;
	public AppiumScenario() {
		this.driverAppium = Hook.getAppiumDriver();
	}

	// check information api
	@Given("^I open the application$")
	public void i_open_the_application() {
		System.out.println("Open application API demos");
		Assert.assertTrue(driverAppium.findElement(By.xpath(apiAppDemoUI.ACCESSIBILITY)).isDisplayed());
	}

	@When("^I tap on Accessibility$")
	public void i_tap_on_Accessibility() {
		try {

			driverAppium.findElement(By.xpath(apiAppDemoUI.ACCESSIBILITY)).click();
			String text = driverAppium.findElement(By.xpath(apiAppDemoUI.MSG_ACCESSIBILITY_NODE_PROVIDER)).getText();

			if (text.equalsIgnoreCase("Accessibility Node Provider")) {
				System.out.println("Passed");
			} else {
				System.out.println("Failed");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Then("^I validate Custom View$")
	public void i_validate_Custom_View() {
		try {
			Assert.assertTrue(driverAppium.findElement(By.xpath(apiAppDemoUI.CUSTOM_VIEW)).isDisplayed(),
					"Custom View is not displayed");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// check swipe down to top
	@When("^I click view buton$")
	public void i_click_view_button() {
		try {
			driverAppium.findElement(By.xpath(apiAppDemoUI.VIEW_BUTTON)).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Then("^I click Tabs button$")
	public void i_click_tabs_buttons() throws Exception {
		for (int i = 0; i <= 10; i++) {
			try {
				driverAppium.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
				driverAppium.findElement(By.xpath(apiAppDemoUI.TABS_BUTTON)).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				swipeVerticalTopToDown(driverAppium, 0.80, 0.20, 0.3, 2000);
			}
		}
	}

	@Then("^I validate Conten By ID$")
	public void i_validate_content_by_id() {
		boolean flag = false;
		flag = driverAppium.findElement(By.xpath(apiAppDemoUI.CONTENT_BY_ID_BUTTON)).isDisplayed();
		if (flag) {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED");
		}
	}

	// check search google by chrome browser
	// setup chrome in emulator ==> click gapps ==>
	@When("^I open the browser$")
	public void i_open_the_browser() {
		System.out.println("Open the browser");

	}

	@Then("^I input text to searching$")
	public void i_input_text_to_searching() {
		try {
			driverAppium.findElement(By.xpath(apiAppDemoUI.INPUT_TEXT_BOX)).sendKeys("appium");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Then("^I click search button$")
	public void i_click_search_button() {
		try {
			driverAppium.findElement(By.xpath(apiAppDemoUI.SUBMIT_BUTTON)).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// hybrid applicatio: mở chrome trong pc rồi chrome://inspect/#devices ==>
	// click inspect

	// SMS
	@Then("^I click OS and click SMS Messaging$")
	public void i_click_OS_and_click_SMS_message() {
		try {
			driverAppium.findElement(By.xpath(apiAppDemoUI.OS_BUTTON)).click();
			driverAppium.findElement(By.xpath(apiAppDemoUI.SMS_MESSAGING_BUTTON)).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@And("^I input sms \"([^\"]*)\"$")
	public void i_enter_into_the_name_field(String sms) {
		try {
			driverAppium.findElement(By.id(apiAppDemoUI.INPUT_TEXT_BOX_SMS)).sendKeys(sms);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@And("^I input content sms \"([^\"]*)\"$")
	public void i_input_content_sms(String content_sms) {
		try {
			driverAppium.findElement(By.id(apiAppDemoUI.INPUT_CONTENT_SMS)).sendKeys(content_sms);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Then("^I click send button$")
	public void i_click_send_button() {
		try {
			driverAppium.findElement(By.xpath(apiAppDemoUI.SEND_BUTTON)).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Then("^I verify message sent1$")
	public void i_verify_message_sent() {
		try {
			String otpValue = getOTP();
			System.out.println("OTP VALUE : " + otpValue);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getOTP() {
		// startActivity phải dùng driverAndroid
		driverAndroid.startActivity(new Activity("com.android.mms", "com.android.mms.ui.ConversationList"));
		// Detail sms: 004655 : split(":")[1].trim() sẽ lấy phần tử 2 và cắt từ
		// Detail sms: chỉ lấy thằng 004655
		String getOTPValue = driverAppium.findElement(By.id(apiAppDemoUI.CONTENT_SMS)).getText().split(":")[1].trim();
		return getOTPValue;
	}

	// auto dropdown
	@Then("^I click Auto complete button$")
	public void i_click_Auto_complete_button() {
		try {
			driverAppium.findElement(By.xpath(apiAppDemoUI.AUTO_COMPLETE_BUTTON)).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@And("^I click screen top$")
	public void i_click_screen_top() {
		try {
			driverAppium.findElement(By.xpath(apiAppDemoUI.SCREEN_TOP_BUTTON)).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Then("^I input content \"([^\"]*)\"$")
	public void i_input_content(String content_dropdown) {
		try {
			driverAppium.findElement(By.id(apiAppDemoUI.TEXT_BOX_CONTENT)).sendKeys(content_dropdown);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Then("^I choose india dropdown$")
	public void i_choose_india_drop_down() {
		try {
			((PressesKeyCode) driverAppium).pressKeyCode(AndroidKeyCode.KEYCODE_PAGE_DOWN);
			Thread.sleep(2000);
			((PressesKeyCode) driverAppium).pressKeyCode(AndroidKeyCode.KEYCODE_PAGE_DOWN);
			Thread.sleep(2000);
			((PressesKeyCode) driverAppium).pressKeyCode(AndroidKeyCode.ENTER);
			Thread.sleep(2000);
			String text = driverAppium.findElement(By.id(apiAppDemoUI.TEXT_BOX_CONTENT)).getText();
			System.out.println("Text Found : "+text);
			if(text.equals("India"))
			{
				System.out.println("Passed");
			}else
			{
				System.out.println("Failed");
	}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// sms demo
	@Given("^I open the application sms$")
	public void i_open_the_application_sms() {
		System.out.println("Open application API demos");
	}
	
	protected apiAppDemoUI apiUI = new apiAppDemoUI();

}
