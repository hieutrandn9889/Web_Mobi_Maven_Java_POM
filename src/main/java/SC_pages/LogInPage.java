package SC_pages;

import SC_interfaces.LogInPageUI;
import commons.AbstractMobile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class LogInPage extends AbstractMobile {
	AppiumDriver<MobileElement> driverAppium;

	public LogInPage(AppiumDriver<MobileElement> driverAppium) {
		this.driverAppium = driverAppium;
	}

	public void enterUserName(String useremail) {
		typeToElement(driverAppium, LogInPageUI.USER_TXT, useremail);
	}

	public void enterPass(String password) {
		typeToElement(driverAppium, LogInPageUI.PASSWORD_TXT, password);

	}

	public void clickLOGIN() {
		clickToElementByID(driverAppium, LogInPageUI.LOGIN_BUTTON);

	}

	public String getErrorMsg() {
		return getTextOfElement(driverAppium, LogInPageUI.MESSAGE);
		
	}

	// get text

}
