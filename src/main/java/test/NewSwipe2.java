package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import interfaces.apiAppDemoUI;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class NewSwipe2 {
	static AppiumDriver<MobileElement> driverAppium;

	public void setUpAppium() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 4");
		cap.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "//App//BT.apk");
		try {
			driverAppium = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		driverAppium.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void test() throws Exception {

		
		for (int i = 0; i <= 3; i++) {
			try {
				Thread.sleep(2000);
//				swipeHorizontal(0.90, 0.10, 0.6, 5000);
				swipeHorizontal(0.90, 0.10, 0.6, 5000);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("test");
			}
		}
		
		
	}

//	public static void swipeVerticalTopToDown(double startPercentage, double finalPercentage, double anchorPercentage, int duration) throws Exception {
//
//		Dimension size = driverAppium.manage().window().getSize();
//		int anchor = (int) (size.width * anchorPercentage);
//		int startPoint = (int) (size.height * startPercentage);
//		int endPoint = (int) (size.height * finalPercentage);
//		new TouchAction(driverAppium).press(anchor, startPoint).waitAction(Duration.ofMillis(duration))
//				.moveTo(anchor, endPoint).release().perform();
//		
//	}
	
	public static void swipeVerticalTopToDown(AppiumDriver<MobileElement> driverAppium, double startPercentage,
			double finalPercentage, double anchorPercentage, int duration) throws Exception {
		Dimension size = driverAppium.manage().window().getSize();
		int anchor = (int) (size.width * anchorPercentage);
		int startPoint = (int) (size.height * startPercentage);
		int endPoint = (int) (size.height * finalPercentage);
		new TouchAction(driverAppium).press(new PointOption().withCoordinates(anchor, startPoint)).waitAction(waitOptions(Duration.ofMillis(duration)))
		.moveTo((PointOption) point(anchor, endPoint)).release().perform();
	}

	private static WaitOptions waitOptions(Duration ofMillis) {
		// TODO Auto-generated method stub
		return null;
	}

	private static PointOption point(int anchor, int endPoint) {
		// TODO Auto-generated method stub
		return null;
	}

//	public static void swipeHorizontal(double startPercentage, double finalPercentage, double anchorPercentage,int duration) throws Exception {
//
//		Dimension size = driverAppium.manage().window().getSize();
//		int anchor = (int) (size.height * anchorPercentage);
//		int startPoint = (int) (size.width * startPercentage);
//		int endPoint = (int) (size.width * finalPercentage);
//		new TouchAction(driverAppium).press(startPoint, anchor).waitAction(Duration.ofMillis(duration)).moveTo(endPoint, anchor).release().perform();
//
//	}

	public static void swipeHorizontal(AppiumDriver<MobileElement> driverAppium, double startPercentage,
			double finalPercentage, double anchorPercentage, int duration) throws Exception {

		Dimension size = driverAppium.manage().window().getSize();
		int anchor = (int) (size.height * anchorPercentage);
		int startPoint = (int) (size.width * startPercentage);
		int endPoint = (int) (size.width * finalPercentage);
		new TouchAction(driverAppium).press(new PointOption().withCoordinates(startPoint, anchor)).waitAction(waitOptions(Duration.ofMillis(duration)))
		.moveTo(point(endPoint, anchor)).release().perform();
	}
	
	public void closeApp() {
		driverAppium.quit();
	}

	public static void main(String[] args) throws Exception {
		NewSwipe2 obj = new NewSwipe2();
		obj.setUpAppium();
		obj.test();
		obj.closeApp();
	}
}
