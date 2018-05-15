package BT_pages;

import BT_interfaces.HomePageUI_BT;
import commons.AbstractMobile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HomePage_BT extends AbstractMobile {
	AppiumDriver<MobileElement> driverAppium;

	public HomePage_BT(AppiumDriver<MobileElement> driverAppium) {
		this.driverAppium = driverAppium;
	}
	
	public void clickAddNewEvent() {
		clickToElementByXpath(driverAppium, HomePageUI_BT.ADD_NEW_EVENT);

	}
	
	public void clickLogOutBtn() {
		clickToElementByXpath(driverAppium, HomePageUI_BT.LOGOUT_BUTTON);

	}
}
