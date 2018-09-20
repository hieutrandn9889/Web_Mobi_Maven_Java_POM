package test;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import commons.LogEvent;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Newxcode_xs_xr_xmax{
	AppiumDriver<MobileElement> driverAppium;
	LogEvent LOG;
	@BeforeTest
	public void setUp123() throws MalformedURLException
	{
		File app =new File("..//Web_Mobi_Maven_Java_POM/App/SwissCard UAT.app");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.9.0");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone XR");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, "");
        cap.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, 50000);
        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        driverAppium = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
        driverAppium.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	}
	
	@Test(enabled= true)
	public void runMain123() throws InterruptedException, IOException {
		DOMConfigurator.configure("..//Web_Mobi_Maven_Java_POM/resource/log4j.xml");
		LOG = new LogEvent();
		Thread.sleep(5000);	
		getscreenshot(driverAppium);
		LOG.info("Login page");
		Thread.sleep(5000);	
		driverAppium.findElement(By.xpath("(//XCUIElementTypeButton)[1]")).click();
		getscreenshot(driverAppium);
		Thread.sleep(5000);
		LOG.info("Register page");
		driverAppium.findElement(By.xpath("(//XCUIElementTypeButton)[3]")).click();
		getscreenshot(driverAppium);
		Thread.sleep(5000);
		LOG.info("Register 1/7 page");
		driverAppium.findElement(By.xpath("(//XCUIElementTypeButton)[3]")).click();
		getscreenshot(driverAppium);
		Thread.sleep(5000);
		LOG.info("Register 2/7 page");
	}
	
	// take a screenshot if error
	public void getscreenshot(AppiumDriver<MobileElement> driverAppium) throws IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		Date date = new Date();
		String fileName = sdf.format(date);
		File des = driverAppium.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(des, new File(System.getProperty("user.dir") + "//Screenshot//" + fileName + ".png"));
		System.out.println("Screenshot is captured");
	}
	
	@AfterTest
	public void test123() {
		driverAppium.quit();
		LOG.info("quit app");
	}

}



 
	 