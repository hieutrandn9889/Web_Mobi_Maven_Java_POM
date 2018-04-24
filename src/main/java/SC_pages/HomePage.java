package SC_pages;

import SC_interfaces.AbstractPageUI;
import SC_interfaces.HomePageUI;
import commons.AbstractMobile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HomePage extends AbstractMobile {
	AppiumDriver<MobileElement> driverAppium;

	public HomePage(AppiumDriver<MobileElement> driverAppium) {
		this.driverAppium = driverAppium;
	}

	public SignUpPage openSignUpPage(AppiumDriver<MobileElement> driverAppium) {
		clickToElement(driverAppium, HomePageUI.MY_ACCOUNT_MENU);
		clickToElement(driverAppium, HomePageUI.SIGN_UP_MENU);
		return PageFactory.getSignUpPage(driverAppium);
	}

	// open each page
	public HomePage openHomePage(AppiumDriver<MobileElement> driverAppium) {
		clickToElement(driverAppium, AbstractPageUI.HOME_PAGE);
		return PageFactory.getHomePage(driverAppium);
	}

}
