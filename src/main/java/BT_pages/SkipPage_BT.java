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
	
	public SkipPage_BT swideSkipPage_BT(AppiumDriver<MobileElement> driverAppium) throws Exception {
		swipeHorizontal(driverAppium, 0.70, 0.30, 0.3, 2000);
		return this;
	}
	
	public LogInPage_BT openLogInPage_BT(AppiumDriver<MobileElement> driverAppium){
		clickToElementByXpath(driverAppium, SkipPageUI_BT.SKIP_BUTTON);
		return PageFactory_BT.getLogInPage(driverAppium);
	}
	
	

}
