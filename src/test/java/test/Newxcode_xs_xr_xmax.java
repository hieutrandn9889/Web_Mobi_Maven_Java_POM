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
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone XS Max");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, "");
        cap.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, 50000);
        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        cap.setCapability("noReset", "false");
		cap.setCapability("language", "EN");
		cap.setCapability("locale", "English");
        driverAppium = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
        driverAppium.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	}
	
	@Test(enabled= true)
	public void runMain123() throws InterruptedException, IOException {
		DOMConfigurator.configure("..//Web_Mobi_Maven_Java_POM/resource/log4j.xml");
		LOG = new LogEvent();
		Thread.sleep(1000);	
		getscreenshot(driverAppium);
		LOG.info("Login page");
		Thread.sleep(1000);	
		driverAppium.findElement(By.xpath("(//XCUIElementTypeButton)[1]")).click();
		getscreenshot(driverAppium);
		Thread.sleep(1000);
		LOG.info("Register page");
		driverAppium.findElement(By.xpath("(//XCUIElementTypeButton)[3]")).click();
		getscreenshot(driverAppium);
		Thread.sleep(1000);
		LOG.info("Register 1/7 page");
		driverAppium.findElement(By.xpath("(//XCUIElementTypeButton)[3]")).click();
		getscreenshot(driverAppium);
		Thread.sleep(1000);
		LOG.info("Register 2/7 page");
		driverAppium.findElement(By.xpath("(//XCUIElementTypeTextField)[1]")).sendKeys("1");
		LOG.info("Register 2/7 number 1");
		driverAppium.findElement(By.xpath("(//XCUIElementTypeTextField)[2]")).sendKeys("2");
		LOG.info("Register 2/7 number 2");
		driverAppium.findElement(By.xpath("(//XCUIElementTypeTextField)[3]")).sendKeys("3");
		LOG.info("Register 2/7 number 3");
		driverAppium.findElement(By.xpath("(//XCUIElementTypeTextField)[4]")).sendKeys("4");
		LOG.info("Register 2/7 number 4");
		driverAppium.findElement(By.xpath("(//XCUIElementTypeTextField)[5]")).sendKeys("5");
		LOG.info("Register 2/7 number 5");
		driverAppium.findElement(By.xpath("(//XCUIElementTypeTextField)[6]")).sendKeys("6");
		LOG.info("Register 2/7 number 6");
		driverAppium.findElement(By.xpath("(//XCUIElementTypeTextField)[7]")).sendKeys("7");
		LOG.info("Register 2/7 number 7");
		driverAppium.findElement(By.xpath("(//XCUIElementTypeTextField)[8]")).sendKeys("8");
		LOG.info("Register 2/7 number 8");
		driverAppium.findElement(By.xpath("(//XCUIElementTypeTextField)[9]")).sendKeys("9");
		LOG.info("Register 2/7 number 9");
		driverAppium.findElement(By.xpath("(//XCUIElementTypeTextField)[10]")).sendKeys("1");
		LOG.info("Register 2/7 number 10");
		driverAppium.findElement(By.xpath("(//XCUIElementTypeTextField)[11]")).sendKeys("2");
		LOG.info("Register 2/7 number 11");
		Thread.sleep(100);
		getscreenshot(driverAppium);
		driverAppium.findElement(By.xpath("(//XCUIElementTypeButton)[4]")).click();
		LOG.info("Register 2/7 done");
		Thread.sleep(100);
		driverAppium.findElement(By.xpath("(//XCUIElementTypeTextField)[1]")).sendKeys("1");
		LOG.info("Register 3/7 number 1");
		driverAppium.findElement(By.xpath("(//XCUIElementTypeTextField)[2]")).sendKeys("1");
		LOG.info("Register 3/7 number 1");
		driverAppium.findElement(By.xpath("(//XCUIElementTypeTextField)[3]")).sendKeys("1");
		LOG.info("Register 3/7 number 1");
		driverAppium.findElement(By.xpath("(//XCUIElementTypeTextField)[4]")).sendKeys("1");
		LOG.info("Register 3/7 number 1");
		getscreenshot(driverAppium);
		driverAppium.findElement(By.xpath("(//XCUIElementTypeButton)[3]")).click();
		Thread.sleep(100);
		driverAppium.findElement(By.xpath("(//XCUIElementTypeTextField)[1]")).sendKeys("CC");
		Thread.sleep(100);
		getscreenshot(driverAppium);
		driverAppium.findElement(By.xpath("(//XCUIElementTypeButton)[4]")).click();
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



 
	 