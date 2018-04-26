package SC_pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class PageFactory {
	public static SignUpPage getSignUpPage(AppiumDriver<MobileElement> driverAppium){
		return new SignUpPage(driverAppium);
	}
	
	public static HomePage getHomePage(AppiumDriver<MobileElement> driverAppium){
		return new HomePage(driverAppium);
	}
	
	public static LogInPage getLogInPage(AppiumDriver<MobileElement> driverAppium){
		return new LogInPage(driverAppium);
	}

}
