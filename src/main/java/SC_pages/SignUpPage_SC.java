package SC_pages;

import SC_interfaces.SignUpPageUI_SC;
import commons.AbstractMobile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class SignUpPage_SC extends AbstractMobile {
	AppiumDriver<MobileElement> driverAppium;
	
	public SignUpPage_SC(AppiumDriver<MobileElement> driverAppium) {
		this.driverAppium = driverAppium;
	}
	
	public LogInPage_SC openLogInPage(AppiumDriver<MobileElement> driverAppium){
		clickToElementByID(driverAppium, SignUpPageUI_SC.LOGIN_TAB_xpath);
		return PageFactory_SC.getLogInPage(driverAppium);
	}

	

	

}
