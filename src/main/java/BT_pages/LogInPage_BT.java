package BT_pages;

import BT_interfaces.LogInPageUI_BT;
import commons.AbstractMobile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LogInPage_BT extends AbstractMobile {
	AppiumDriver<MobileElement> driverAppium;

	public LogInPage_BT(AppiumDriver<MobileElement> driverAppium) {
		this.driverAppium = driverAppium;
	}
	
	public void enterUserName(String useremail) {
		typeToElementByXpath(driverAppium, LogInPageUI_BT.EMAIL_LOGIN, useremail);
	}

	public void enterPass(String password) {
		typeToElementByXpath(driverAppium, LogInPageUI_BT.PASSWORD_LOGIN, password);

	}

	public HomePage_BT clickLOGIN() {
		clickToElementByXpath(driverAppium, LogInPageUI_BT.SUBMIT_LOGIN);
		return PageFactory_BT.getHomePage(driverAppium);

	}
}
