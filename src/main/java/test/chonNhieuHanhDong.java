package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.DesiredCapabilities;

import interfaces.apiAppDemoUI;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * @author CHIRAG
 *
 */
public class chonNhieuHanhDong {

	AppiumDriver<MobileElement> driverAppium;

	public void setUp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "Nexus 9");
		cap.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "//app//ApiDemos.apk");
		driverAppium = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driverAppium.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void tapAction()
	{
		// tap method using Appium driver
		MobileElement view = driverAppium.findElement(By.xpath(apiAppDemoUI.VIEW_BUTTON));
		view.click();
//		driver.tap(1, view, 500);
		// tap method using Touch Action Class
		MobileElement autoComplete = driverAppium.findElementByAccessibilityId("Auto Complete");
		new TouchAction(driverAppium).tap(autoComplete).perform().release();
		boolean flag = driverAppium.findElementByAccessibilityId("1. Screen Top").isDisplayed();
		if(flag)
		{
			System.out.println("Passed");
		}else
		{
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
		chonNhieuHanhDong obj = new chonNhieuHanhDong();
		obj.setUp();
		obj.tapAction();
		obj.tearDown();
	}

}