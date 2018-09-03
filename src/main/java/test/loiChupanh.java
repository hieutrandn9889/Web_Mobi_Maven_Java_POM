package test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author CHIRAG
 *
 */
public class loiChupanh {

	AppiumDriver<MobileElement> driverAppium;
	
	public void setUp() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "Nexus 9");
		cap.setCapability("appPackage", "com.android.mms");
		cap.setCapability("appActivity", "com.android.mms.ui.ConversationList");
		driverAppium = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driverAppium.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void testAddContact() throws InterruptedException, IOException
	{
		try {
			TouchAction ac = new TouchAction(driverAppium);
			MobileElement ele = driverAppium.findElementById("com.android.mms:id/subject");
			ac.longPress(ele).perform().release();
			Thread.sleep(2000);
			boolean flag = driverAppium.findElementById("com.android.mms:id/title1").isDisplayed();
			if(flag)
			{
				System.out.println("Passed");
			}else
			{
				System.out.println("Failed");
				getscreenshot(driverAppium);
			}
		} catch (Exception e) {
			getscreenshot(driverAppium);
		}
		
	}
	
	public void getscreenshot(AppiumDriver<MobileElement> d) throws IOException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		Date date = new Date();
		String fileName = sdf.format(date);
		File des = d.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(des, new File(System.getProperty("user.dir")+"//Screenshot//"+fileName+".png"));
		System.out.println("Screenshot is captured");
	}
	
	public void tearDown()
	{
		driverAppium.quit();
	}
	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		loiChupanh obj = new loiChupanh();
		obj.setUp();
		obj.testAddContact();
		obj.tearDown();
	}

}