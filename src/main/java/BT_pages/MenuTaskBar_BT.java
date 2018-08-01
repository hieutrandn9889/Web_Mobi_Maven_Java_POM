package BT_pages;

import BT_interfaces.MenuTarkBarPageUI_BT;
import commons.AbstractMobile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MenuTaskBar_BT extends AbstractMobile {

	AppiumDriver<MobileElement> driverAppium;

	public MenuTaskBar_BT(AppiumDriver<MobileElement> driverAppium) {
		this.driverAppium = driverAppium;
	}

	public void clickMyPa() {
		clickToElementByXpath(driverAppium, MenuTarkBarPageUI_BT.MY_PA_BUTTON);

	}

	public Medication_BT clickMedication() throws InterruptedException {
		clickToElementByXpath(driverAppium, MenuTarkBarPageUI_BT.MEDICATION_BUTTON);
		Thread.sleep(5000);
		return PageFactory_BT.getMedicationPage(driverAppium);
	}
}
