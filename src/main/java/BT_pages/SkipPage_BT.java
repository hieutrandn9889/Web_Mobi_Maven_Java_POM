package BT_pages;

import BT_interfaces.SkipPageUI_BT;
import commons.AbstractMobile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SkipPage_BT extends AbstractMobile {
	AppiumDriver<MobileElement> driverAppium;

	public SkipPage_BT(AppiumDriver<MobileElement> driverAppium) {
		this.driverAppium = driverAppium;
	}
	
	public LogInPage_BT openLogInPage_BT(AppiumDriver<MobileElement> driverAppium){
		clickToElementByXpath(driverAppium, SkipPageUI_BT.SKIP_BUTTON);
		return PageFactory_BT.getLogInPage(driverAppium);
	}

}
