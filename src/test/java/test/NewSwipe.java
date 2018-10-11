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

public class NewSwipe {
	static AppiumDriver<MobileElement> driverAppium;

	public void setUpAppium() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 4");
		cap.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "//App//ApiDemos.apk");
		try {
			driverAppium = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		driverAppium.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void test() throws Exception {
		driverAppium.findElement(By.xpath("//*[@text='Views']")).click();
		for (int i = 0; i <= 10; i++) {
			try {
				driverAppium.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
				driverAppium.findElement(By.xpath("//*[@text='Tabs']")).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
//				swipeVerticalTopToDown(0.80, 0.20, 0.3, 2000);
				swipeVerticalTopToDown();
//				swipeHorizontal();
			}
		}
	}

	
	
//	public static void swipeHorizontal() throws Exception {		
//		Dimension size = driverAppium.manage().window().getSize();
//
//	    int starty = (int) (size.height * 0.8);
//	    int endy = (int) (size.height * 0.2);
//	    int startx = size.width / 2;
//
//	    //Swipe from Bottom to Top.
//	    new TouchAction(driverAppium).press(PointOption.point(startx, starty)).
//	            moveTo(PointOption.point(startx, endy)).release().perform();	
//	}
	

	public static void swipeVerticalTopToDown() throws Exception {

		Dimension size = driverAppium.manage().window().getSize();
		int anchor = (int) (size.width * 0.3);
		int startPoint = (int) (size.height * 0.80);
		int endPoint = (int) (size.height * 0.20);
		new TouchAction(driverAppium).press(PointOption.point(anchor, startPoint)).waitAction()
				.moveTo(PointOption.point(anchor, endPoint)).release().perform();

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

	public void closeApp() {
		driverAppium.quit();
	}

	public static void main(String[] args) throws Exception {
		NewSwipe obj = new NewSwipe();
		obj.setUpAppium();
		obj.test();
		obj.closeApp();
	}
}
