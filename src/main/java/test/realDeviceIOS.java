package test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import commons.LogEvent;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class realDeviceIOS {
	AppiumDriver<MobileElement> driverAppium;
	LogEvent LOG;

	@BeforeTest
	public void setUp() throws MalformedURLException {

		// boobytrapp real device
		// File f=new File("/Users/hieutran/Library/Developer/Xcode/DerivedData/boobytrapp-dycbkqsftwfybqdfeliyirqozabg/Build/Products/Release-iphoneos/boobytrapp.app");

		//UICatalog simulator
		// File f=new File("/Users/hieutran/Library/Developer/Xcode/DerivedData/UICatalog-awfwyotvxeypmlgqarsnfkbhkvbb/Build/Products/Debug-iphonesimulator/UICatalog.app");

		// IntegrationApp simulator and real devices
		File f = new File("/Users/hieutran/Library/Developer/Xcode/DerivedData/WebDriverAgent-brdadhpuduowllgivnnvuygpwhzy/Build/Products/Debug-iphonesimulator/IntegrationApp.app");
		// File f=new File("/Users/hieutran/Library/Developer/Xcode/DerivedData/WebDriverAgent-brdadhpuduowllgivnnvuygpwhzy/Build/Products/Debug-iphoneos/IntegrationApp.app");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.8.0");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Thu's iPhone");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 7");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		//cap.setCapability("udid","4a9ff9e339526894224e852a24508d49f1037d7a");
		cap.setCapability(MobileCapabilityType.APP, f.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		driverAppium = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driverAppium.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	}

	@Test(enabled = true)
	public void runMain() throws InterruptedException {
		DOMConfigurator.configure("..//Web_Mobi_Maven_Java_POM/resource/log4j.xml");
		LOG = new LogEvent();
		Thread.sleep(5000);
		MobileElement Alert = driverAppium.findElement(By.xpath("//XCUIElementTypeButton[@name='Alerts']"));
		Alert.click();
		driverAppium.findElement(By.xpath("//XCUIElementTypeTextField[@name='textField']")).sendKeys("Hello worlds!");;
		Thread.sleep(5000);
		LOG.info("Login is successful");
	}
	
	@AfterTest
	public void tearDown() {
		driverAppium.quit();
		LOG.info("quit app");
	}
	
}
