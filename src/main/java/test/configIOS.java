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
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class configIOS{
	AppiumDriver<MobileElement> driverAppium;
	LogEvent LOG;
	@BeforeTest
	public void setUp() throws MalformedURLException
	{
		File f=new File("/Users/hieutran/Library/Developer/Xcode/DerivedData/boobytrapp-dycbkqsftwfybqdfeliyirqozabg/Build/Products/Release-iphonesimulator/boobytrapp.app");
		//File f=new File("/Users/hieutran/Library/Developer/Xcode/DerivedData/UICatalog-awfwyotvxeypmlgqarsnfkbhkvbb/Build/Products/Debug-iphonesimulator/UICatalog.app");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.8.0");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.3");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 7");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, "");
        cap.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, 50000);
        cap.setCapability(MobileCapabilityType.APP, f.getAbsolutePath());
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        driverAppium = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
        driverAppium.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	}
	
	@Test(enabled= true)
	public void runMain() throws InterruptedException {
		DOMConfigurator.configure("..//Web_Mobi_Maven_Java_POM/resource/log4j.xml");
		LOG = new LogEvent();
		Thread.sleep(5000);	
		MobileElement skip = driverAppium.findElement(By.xpath("(//XCUIElementTypeOther[@name='Skip'])[6]"));
		skip.click();
		
		// email
		driverAppium.findElement(By.xpath("	//XCUIElementTypeOther[@name='Enter email here']")).sendKeys("thu.nguuyen@smartdev.vn");
		// password
		driverAppium.findElement(By.xpath("	//XCUIElementTypeOther[@name='Enter password']")).sendKeys("Test@123");
		driverAppium.findElement(By.xpath("//XCUIElementTypeOther[@name='Login']")).click();
		
		Thread.sleep(5000);
		LOG.info("Login is successful");
	}
	
	@AfterTest
	public void tearDown() {
		driverAppium.quit();
		LOG.info("quit app");
	}

}



 
	 