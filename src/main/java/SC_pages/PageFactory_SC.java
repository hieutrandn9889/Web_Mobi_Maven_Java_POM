package SC_pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class PageFactory_SC {
	public static SignUpPage_SC getSignUpPage(AppiumDriver<MobileElement> driverAppium){
		return new SignUpPage_SC(driverAppium);
	}
	
	public static HomePage_SC getHomePage(AppiumDriver<MobileElement> driverAppium){
		return new HomePage_SC(driverAppium);
	}
	
	public static LogInPage_SC getLogInPage(AppiumDriver<MobileElement> driverAppium){
		return new LogInPage_SC(driverAppium);
	}

}
