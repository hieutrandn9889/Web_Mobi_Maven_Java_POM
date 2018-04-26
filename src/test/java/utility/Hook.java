package utility;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import commons.Constants;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Hook {
	private static WebDriver driver;
	private static AppiumDriver<MobileElement> driverAppium;
	
	

	 @Before(value = "@Firefox")
	 public void setUpFirefox() {
	 System.setProperty("webdriver.gecko.driver", Constants.FIREFOX_PATH);
	 driver = new FirefoxDriver();
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 System.out.println("-----------------Firefox Hook------------------");
	 }
	
	 @Before(value = "@Chrome")
	 public void setUpChrome() {
	 System.setProperty("webdriver.chrome.driver", Constants.CHROME_PATH);
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 System.out.println("-----------------Chrome Hook------------------");
	 }
	
	 @Before(value = "@IE")
	 public void setUpIE() {
	 System.setProperty("webdriver.ie.driver", Constants.IE_PATH);
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 System.out.println("-----------------IE Hook------------------");
	 }
	

	@Before(value = "@AndroidSwipe")
	public void setUpAppium() throws MalformedURLException {
		File app = new File(Constants.APP_API);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 4");
		cap.setCapability("platformName", "Android");
		cap.setCapability("app", app.getAbsolutePath());
		try {
			driverAppium = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		driverAppium.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Before(value = "@AndroidCalculator")
	public void setUpAppiumCalculator() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 4");
		cap.setCapability("appPackage", "com.android.calculator2");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		try {
			driverAppium = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		driverAppium.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Before(value = "@Android_API_SMS")
	public void setUpAppiumAPI_SMS() throws MalformedURLException {
		File app = new File(Constants.APP_API);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 4");
		cap.setCapability("platformName", "Android");
		cap.setCapability("app", app.getAbsolutePath());
		try {
			driverAppium = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		driverAppium.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	@Before(value = "@AndroidSMS")
	public void setUpAppiumSMS() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 4");
//		cap.setCapability("appPackage", "com.android.mms");
//		cap.setCapability("appActivity", "com.android.mms.ui.ConversationList");
		cap.setCapability("appPackage", "com.android.messaging");
		cap.setCapability("appActivity", "com.android.messaging.ui.conversationlist.ConversationListActivity");
		try {
			driverAppium = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		driverAppium.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Before(value = "@AndroidSC")
	public void setUpAppiumSC() throws MalformedURLException {
		
		File app = new File(Constants.APP_SC);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 4");
		cap.setCapability("platformName", "Android");
		cap.setCapability("app", app.getAbsolutePath());
		try {
			driverAppium = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		driverAppium.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After(value = "@Firefox, @Chrome")
	public void closeDriver() {
		try {
			driver.quit();
			System.out.println("-----------------After website Hook------------------");
			System.gc();
			if (driver.toString().toLowerCase().contains("chrome")) {
				String cmd = "taskkill /IM chromedriver.exe /F";
				Process process = Runtime.getRuntime().exec(cmd);
				process.waitFor();
			}
			if (driver.toString().toLowerCase().contains("internetexplorer")) {
				String cmd = "taskkill /IM IEDriverServer.exe /F";
				Process process = Runtime.getRuntime().exec(cmd);
				process.waitFor();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@After(value = "@AndroidSwipe, @AndroidCalculator, @Android_API_SMS, @AndroidSC, @AndroidSwipe, @AndroidCalculator,")
	public void closeDriverAppium() {
		try {
			driverAppium.quit();
			System.out.println("-----------------After mobile Hook------------------");
			System.gc();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static AppiumDriver<MobileElement> getAppiumDriver() {
		return driverAppium;
	}

}