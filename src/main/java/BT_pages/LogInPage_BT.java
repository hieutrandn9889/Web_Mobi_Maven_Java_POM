package BT_pages;

import BT_interfaces.LogInPageUI_BT;
import commons.AbstractMobile;
import interfaces.pageUI_BT;
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
	
	public HomePage_BT clickFBBtn() {
		clickToElementByXpath(driverAppium, pageUI_BT.FB_BUTTON);
		return PageFactory_BT.getHomePage(driverAppium);
	}
	
	public HomePage_BT clickGoglePlusBtn() {
		clickToElementByXpath(driverAppium, pageUI_BT.GOOGLE_PLUS_BUTTON);
		return PageFactory_BT.getHomePage(driverAppium);
	}
}
