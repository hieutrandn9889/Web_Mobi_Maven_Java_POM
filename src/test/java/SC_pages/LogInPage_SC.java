package SC_pages;

import SC_interfaces.LogInPageUI_SC;
import commons.AbstractMobile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class LogInPage_SC extends AbstractMobile {
	AppiumDriver<MobileElement> driverAppium;

	public LogInPage_SC(AppiumDriver<MobileElement> driverAppium) {
		this.driverAppium = driverAppium;
	}

	public void enterUserName(String useremail) {
		typeToElement(driverAppium, LogInPageUI_SC.USER_TXT, useremail);
	}

	public void enterPass(String password) {
		typeToElement(driverAppium, LogInPageUI_SC.PASSWORD_TXT, password);

	}

	public void clickLOGIN() {
		clickToElementByID(driverAppium, LogInPageUI_SC.LOGIN_BUTTON);

	}

	public String getErrorMsg() {
		return getTextOfElement(driverAppium, LogInPageUI_SC.MESSAGE);
		
	}

	// get text

}
