package calculatorPages;

import commons.AbstractMobile;
import interfaces.calculatorUI;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utility.Hook;

public class calculator_page extends AbstractMobile {

	AppiumDriver<MobileElement> driverAppium = Hook.getAppiumDriver();
	

	public void clickSevenNumber() {
		clickToElementByID((AppiumDriver<MobileElement>) driverAppium, calculatorUI.NUMER_SEVEN);
	}
	public void clickPlus() {
		clickToElementByID((AppiumDriver<MobileElement>) driverAppium, calculatorUI.SYMBOL_PlUS);
	}
	public void clickTwoNumber() {
		clickToElementByID((AppiumDriver<MobileElement>) driverAppium, calculatorUI.NUMER_TWO);
	}
	public void clickEqual() {
		clickToElementByID((AppiumDriver<MobileElement>) driverAppium, calculatorUI.SYMBOL_EQUAL);
	}
}



	

