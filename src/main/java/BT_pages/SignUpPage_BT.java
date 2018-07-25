package BT_pages;

import BT_interfaces.LogInPageUI_BT;
import BT_interfaces.SignUpPageUI_BT;
import commons.AbstractMobile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SignUpPage_BT extends AbstractMobile {
	AppiumDriver<MobileElement> driverAppium;

	public SignUpPage_BT(AppiumDriver<MobileElement> driverAppium) {
		this.driverAppium = driverAppium;
	}
	
	public HomePage_BT clickFBBtn() {
		clickToElementByXpath(driverAppium, SignUpPageUI_BT.FB_BUTTON);
		return PageFactory_BT.getHomePage(driverAppium);
	}
	
	public HomePage_BT clickGoglePlusBtn() {
		clickToElementByXpath(driverAppium, SignUpPageUI_BT.GOOGLE_PLUS_BUTTON);
		return PageFactory_BT.getHomePage(driverAppium);
	}
	
	public LogInPage_BT clickLoginBtnInSignUpPage() {
		clickToElementByXpath(driverAppium, SignUpPageUI_BT.LOGIN_BUTTON);
		return PageFactory_BT.getLogInPage(driverAppium);
	}
	
	
	public void typeEmail(String emailSignIn) {
		typeToElementByXpath(driverAppium, LogInPageUI_BT.EMAIL_LOGIN, emailSignIn);
	}
	
	public void typePassword(String passwordSignIn) {
		typeToElementByXpath(driverAppium, LogInPageUI_BT.EMAIL_LOGIN, passwordSignIn);
	}
	
	public void typeConfirmPassword(String confirmPasswordSignIn) {
		typeToElementByXpath(driverAppium, LogInPageUI_BT.EMAIL_LOGIN, confirmPasswordSignIn);
	}
	
	
	
}
