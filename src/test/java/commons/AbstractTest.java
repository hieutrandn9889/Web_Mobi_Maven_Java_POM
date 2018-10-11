package commons;

import java.util.Random;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.StartsActivity;
import utility.Hook;

public class AbstractTest {
	WebDriver driver = Hook.getDriver();
	AppiumDriver<MobileElement> driverAppium = Hook.getAppiumDriver();
	// lấy số random
	public String randomString() {
		Random rand = new Random();
		int number = rand.nextInt(9000) + 1;
		String numberString = Integer.toString(number);
		return numberString;
	}

	// random 4 numbers
	public String randomFourNumbers() {
		Random rand = new Random();
		int number = 0;
		do {
			number = rand.nextInt(9000) + 1;
		} while (number < 1000);
		String numberString = Integer.toString(number);
		return numberString;
	}
	
	public String showActivityScreen() {
		//System.out.println("===>"+ driver.getCurrentUrl());
		return driver.getCurrentUrl();
	}
	public String showActivityMobileScreen() {
		//System.out.println("===>"+ driverAppium.currentActivity());
		return ((StartsActivity) driverAppium).currentActivity();
	}
}
