package test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
public class getOTPSMS {
	AndroidDriver<MobileElement> driver;
	public void setup() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "Nexus 9");
		cap.setCapability("app", System.getProperty("user.dir")+"//app//ApiDemos.apk");
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void verifyOTPValue()
	{
		driver.findElementByAccessibilityId("OS").click();
		driver.findElementByAccessibilityId("SMS Messaging").click();
		driver.findElementById("io.appium.android.apis:id/sms_recipient").sendKeys("04456");
		driver.findElementById("io.appium.android.apis:id/sms_content").sendKeys("DEMO OTP: 6549");
		driver.findElementByAccessibilityId("Send").click();
		String otpValue = getOTP();
		System.out.println("OTP VALUE : "+otpValue);
	}
	
	
	public String getOTP()
	{
		driver.startActivity(new Activity("com.android.mms", "com.android.mms.ui.ConversationList"));
		String getOTPValue = driver.findElementById("com.android.mms:id/subject").getText().split(":")[1].trim();
		return getOTPValue;
	}
	
	public void tearDown()
	{
		driver.quit();
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
