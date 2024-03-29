package BT_pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PageFactory_BT {
	public static SkipPage_BT getSkipPage(AppiumDriver<MobileElement> driverAppium) {
		return new SkipPage_BT(driverAppium);
	}
	
	public static SignUpPage_BT getSignUpPage(AppiumDriver<MobileElement> driverAppium) {
		return new SignUpPage_BT(driverAppium);
	}

	public static HomePage_BT getHomePage(AppiumDriver<MobileElement> driverAppium) {
		return new HomePage_BT(driverAppium);
	}

	public static LogInPage_BT getLogInPage(AppiumDriver<MobileElement> driverAppium) {
		return new LogInPage_BT(driverAppium);
	}
	
	public static ProfileSignInPage_BT getProfilePage(AppiumDriver<MobileElement> driverAppium) {
		return new ProfileSignInPage_BT(driverAppium);
	}
	
	public static MenuTaskBar_BT getMenuTaskBarPage(AppiumDriver<MobileElement> driverAppium) {
		return new MenuTaskBar_BT(driverAppium);
	}
	
	public static Medication_BT getMedicationPage(AppiumDriver<MobileElement> driverAppium) {
		return new Medication_BT(driverAppium);
	}
}
