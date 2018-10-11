package BT_pages;
import BT_interfaces.LogInPageUI_BT;
import BT_interfaces.SignUpPageUI_BT;
import commons.AbstractMobile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
public class ProfileSignInPage_BT {
	AppiumDriver<MobileElement> driverAppium;

	public ProfileSignInPage_BT(AppiumDriver<MobileElement> driverAppium) {
		this.driverAppium = driverAppium;
	}
}




