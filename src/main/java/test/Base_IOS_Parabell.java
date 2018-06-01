package test;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Base_IOS_Parabell {
	protected AppiumDriverLocalService service;
	protected IOSDriver<IOSElement> driver;

	@Parameters({"wda","deviceName","port"})
	@BeforeTest(alwaysRun = true)
	public void beforeC(String wda, String deviceName, String port){
		
		service = new AppiumServiceBuilder().usingPort(Integer.valueOf(port)).build();
		service.start();
		
		if(service == null || !service.isRunning()){
			throw new AppiumServerHasNotBeenStartedLocallyException("An appium server node is not started");
		}
		File app =new File("..//Web_Mobi_Maven_Java_POM/App/IntegrationApp.app");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.8.1");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.4");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		cap.setCapability(IOSMobileCapabilityType.WDA_LOCAL_PORT,wda);
		cap.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, 5000000);
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		driver = new IOSDriver<>(service.getUrl(), cap);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	}
	
	@AfterTest(alwaysRun = true)
	public void after(){
		if(driver != null){
			driver.quit();
		}
		if(service != null){
			service.stop();
		}
	}
}
