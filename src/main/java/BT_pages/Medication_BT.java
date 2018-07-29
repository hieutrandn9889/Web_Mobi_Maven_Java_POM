package BT_pages;

import BT_interfaces.MedicationPageUI_BT;
import BT_interfaces.MenuTarkBarPageUI_BT;
import commons.AbstractMobile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Medication_BT extends AbstractMobile {

	AppiumDriver<MobileElement> driverAppium;

	public Medication_BT(AppiumDriver<MobileElement> driverAppium) {
		this.driverAppium = driverAppium;
	}

	public void clickAddAMedicationBtn() {
		clickToElementByXpath(driverAppium, MedicationPageUI_BT.ADD_MEDICATION_BUTTON);

	}
	
	public void clickExportBtn() {
		clickToElementByXpath(driverAppium, MedicationPageUI_BT.EXPORT_BUTTON);

	}
	
	
}
