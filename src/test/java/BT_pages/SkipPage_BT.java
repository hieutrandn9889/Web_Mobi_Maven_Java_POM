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
		Thread.sleep(2000);
//		swipeHorizontal(driverAppium, 0.90, 0.10, 0.6, 5000);
		swipeHorizontal(driverAppium);
		return this;
	}
	
	public SignUpPage_BT openSignInPageForSkip_BT(AppiumDriver<MobileElement> driverAppium){
		clickToElementByXpath(driverAppium, SkipPageUI_BT.SKIP_BUTTON);
		return PageFactory_BT.getSignUpPage(driverAppium);
	}
	
	
	public SignUpPage_BT openSignUpPageForFinish_BT(AppiumDriver<MobileElement> driverAppium){
		clickToElementByXpath(driverAppium, SkipPageUI_BT.FINISH_BUTTON);
		return PageFactory_BT.getSignUpPage(driverAppium);
	}
	

}
