package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * @author CHIRAG
 *
 */
public class dropdown {

	AndroidDriver<MobileElement> driverAppium;

	public void setup() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 9");
		cap.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "//app//ApiDemos.apk");
		driverAppium = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driverAppium.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void handleAutoCompleteDropdown() throws InterruptedException {
		driverAppium.findElementByAccessibilityId("Views").click();
		driverAppium.findElementByAccessibilityId("Auto Complete").click();
		driverAppium.findElementByAccessibilityId("1. Screen Top").click();
		driverAppium.findElementById("io.appium.android.apis:id/edit").sendKeys("india");
		Thread.sleep(2000);
		driverAppium.pressKeyCode(AndroidKeyCode.KEYCODE_PAGE_DOWN);
		Thread.sleep(2000);
		driverAppium.pressKeyCode(AndroidKeyCode.KEYCODE_PAGE_DOWN);
		Thread.sleep(2000);
		driverAppium.pressKeyCode(AndroidKeyCode.ENTER);
		Thread.sleep(2000);
		String text = driverAppium.findElementById("io.appium.android.apis:id/edit").getText();
		System.out.println("Text Found : " + text);
		if (text.equals("India")) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
	}

	public void tearDown() {
		driverAppium.quit();
	}

	/**
	 * @param args
	 * @throws MalformedURLException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		dropdown obj = new dropdown();
		obj.setup();
		obj.handleAutoCompleteDropdown();
		obj.tearDown();
	}

}
