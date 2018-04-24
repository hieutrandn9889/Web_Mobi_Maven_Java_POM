package test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import interfaces.apiAppDemoUI;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.StartsActivity;
public class getOTPSMS {
	AppiumDriver<MobileElement>  driverAppium;
	public void setup() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "Nexus 9");
		cap.setCapability("app", System.getProperty("user.dir")+"//app//ApiDemos.apk");
		driverAppium = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driverAppium.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void verifyOTPValue()
	{
		driverAppium.findElementByAccessibilityId("OS").click();
		driverAppium.findElementByAccessibilityId("SMS Messaging").click();
		driverAppium.findElementById("io.appium.android.apis:id/sms_recipient").sendKeys("04456");
		driverAppium.findElementById("io.appium.android.apis:id/sms_content").sendKeys("DEMO OTP: 6549");
		driverAppium.findElementByAccessibilityId("Send").click();
		String otpValue = getOTP();
		System.out.println("OTP VALUE : "+otpValue);
	}
	
	public String getOTP() {
		// startActivity phải dùng driverAndroid
		((StartsActivity) driverAppium).startActivity(new Activity("com.android.messaging", "com.android.messaging.ui.conversationlist.ConversationListActivity"));
		// Detail sms: 004655 : split(":")[1].trim() sẽ lấy phần tử 2 và cắt từ
		// Detail sms: chỉ lấy thằng 004655
		String getOTPValue = driverAppium.findElement(By.id(apiAppDemoUI.CONTENT_SMS)).getText().split(":")[1].trim();
		return getOTPValue;
	}
	
	public void tearDown()
	{
		driverAppium.quit();
	}
	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		getOTPSMS obj = new getOTPSMS ();
		obj.setup();
		obj.verifyOTPValue();
		obj.tearDown();

	}
}
