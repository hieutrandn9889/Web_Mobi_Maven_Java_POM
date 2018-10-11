package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

public class HybridApp {
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

	public void getWebViewText() throws Exception {
		System.out.println("First Current Context : " + driverAppium.getContext());
		driverAppium.findElementByAccessibilityId("Views").click();
		for (int i = 0; i <= 20; i++) {
			try {
				driverAppium.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
				driverAppium.findElementByAccessibilityId("WebView").click();
				break;
			} catch (Exception e) {
				swipeVerticalTopToDown();
			}
		}
		// Using this method we switch to web view
		switchContext("WEBVIEW");
		String webViewText = driverAppium.findElementByXPath("//a[text()='Hello World! - 1']").getText();
		System.out.println(webViewText);

	}

	/**
	 * This method for switch view
	 * chúng ta sẽ có ban đầu là native app sau đó chúng ta chuyển sang webview thông qua switch 
	 * Đây là test cho hybrid app
	 * 
	 */

	public void switchContext(String context) {
		System.out.println("Before Switching : " + driverAppium.getContext());
		// chuyển đỏi qua webview
		Set<String> con = driverAppium.getContextHandles();
		for (String c : con) {
			System.out.println("Available Context : " + c);
			if (c.contains(context)) {
				driverAppium.context(c);
				break;
			}
		}
		// đã chuyển qua webview
		System.out.println("After Switching : " + driverAppium.getContext());
	}

	
	public static void swipeVerticalTopToDown() throws Exception {
		Dimension size = driverAppium.manage().window().getSize();
		int anchor = (int) (size.width * 0.3);
		int startPoint = (int) (size.height * 0.80);
		int endPoint = (int) (size.height * 0.20);
		new TouchAction(driverAppium).press(PointOption.point(anchor, startPoint)).waitAction()
				.moveTo(PointOption.point(anchor, endPoint)).release().perform();

	}
	
	
	public void closeApp() {
		driverAppium.quit();
	}

	public static void main(String[] args) throws Exception {
		HybridApp obj = new HybridApp();
		obj.setUpAppium();
		obj.getWebViewText();
		obj.closeApp();
	}
}
