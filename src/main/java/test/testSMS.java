package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class testSMS {

	AppiumDriver<MobileElement> driverAppium;
	private AndroidDriver<MobileElement> driverAndroid;
	public void setup() throws MalformedURLException {
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
		System.out.println("passed1");
		
	}
	
	public void setUpSMS(){
		System.out.println("passed2");
		driverAndroid.startActivity(new Activity("com.android.messaging", "com.android.messaging.ui.conversationlist.ConversationListActivity"));
	}
	
	public void tearDown()
	{
		System.out.println("passed3");
		driverAppium.quit();
	}

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		testSMS obj = new testSMS();
		obj.setup();
		obj.setUpSMS();
		obj.tearDown();
	}

}
