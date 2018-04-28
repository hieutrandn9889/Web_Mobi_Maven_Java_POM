package SC_pages;

import SC_interfaces.SignUpPageUI;
import commons.AbstractMobile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class SignUpPage extends AbstractMobile {
	AppiumDriver<MobileElement> driverAppium;
	
	public SignUpPage(AppiumDriver<MobileElement> driverAppium) {
		this.driverAppium = driverAppium;
	}
	
	public LogInPage openLogInPage(AppiumDriver<MobileElement> driverAppium){
		clickToElementByID(driverAppium, SignUpPageUI.LOGIN_TAB_xpath);
		return PageFactory.getLogInPage(driverAppium);
	}

	

	

}
