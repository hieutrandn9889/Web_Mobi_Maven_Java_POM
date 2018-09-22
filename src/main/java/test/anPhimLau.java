package test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author CHIRAG
 *
 */
public class anPhimLau {

	AppiumDriver<MobileElement> driverAppium;
	public void setUp() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "Nexus 9");
		
		//old sms
//		cap.setCapability("appPackage", "com.android.mms");
//		cap.setCapability("appActivity", "com.android.mms.ui.ConversationList");
		
		// new sms
		cap.setCapability("appPackage", "com.android.messaging");
		cap.setCapability("appActivity", "com.android.messaging.ui.conversationlist.ConversationListActivity");
		driverAppium = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driverAppium.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void longPress() throws InterruptedException
	{
		// longpress old java-client 5.4.1
//		TouchAction ac = new TouchAction(driverAppium);
//		MobileElement ele = driverAppium.findElementById("com.android.mms:id/subject");
//		ac.longPress(ele).perform().release();
		
		// longpress new java-client 6.1.0
		TouchActions action = new TouchActions(driverAppium);
		MobileElement ele = driverAppium.findElementById("com.android.messaging:id/swipeableContent");
		action.longPress(ele);
		action.perform();
		
		
		Thread.sleep(2000);
		boolean flag = driverAppium.findElementById("com.android.messaging:id/title").isDisplayed();
		if(flag)
		{
			System.out.println("Passed");
		}else
		{
			System.out.println("Failed");
		}
	}
	
	public void tearDown()
	{
		driverAppium.quit();
	}
	/**
	 * @param args
	 * @throws MalformedURLException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		anPhimLau obj = new anPhimLau();
		obj.setUp();
		obj.longPress();
		obj.tearDown();
	}

}