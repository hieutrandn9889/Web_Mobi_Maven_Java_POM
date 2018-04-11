package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class AbstractMobile {
	private AppiumDriver<MobileElement> driver;
	
	//trượt dọc
	public static void swipeVerticalTopToDown(AppiumDriver<MobileElement> driver, double startPercentage,
			double finalPercentage, double anchorPercentage, int duration) throws Exception {

		Dimension size = driver.manage().window().getSize();
		int anchor = (int) (size.width * anchorPercentage);
		int startPoint = (int) (size.height * startPercentage);
		int endPoint = (int) (size.height * finalPercentage);
		new TouchAction(driver).press(anchor, startPoint).waitAction(Duration.ofMillis(duration))
				.moveTo(anchor, endPoint).release().perform();
	}
	// trượt ngang
	public static void swipeHorizontal(AppiumDriver<MobileElement> driver, double startPercentage,
			double finalPercentage, double anchorPercentage, int duration) throws Exception {

		Dimension size = driver.manage().window().getSize();
		int anchor = (int) (size.height * anchorPercentage);
		int startPoint = (int) (size.width * startPercentage);
		int endPoint = (int) (size.width * finalPercentage);
		new TouchAction(driver).press(startPoint, anchor).waitAction(Duration.ofMillis(duration))
				.moveTo(endPoint, anchor).release().perform();

	}

	// LANDSCAPE & PORTRAIT
	public void testRotate() {
		if (driver.getOrientation().equals("LANDSCAPE")) {
			switchtomode("PORTRAIT");
		} else {
			switchtomode("LANDSCAPE");
		}

	}
	// LANDSCAPE & PORTRAIT
	public void switchtomode(String modeType) {
		ScreenOrientation currentOrientation = driver.getOrientation();
		System.out.println("CurrentOrientation : " + currentOrientation);
		if (modeType.equalsIgnoreCase("LANDSCAPE"))
			driver.rotate(ScreenOrientation.LANDSCAPE);
		else if (modeType.equalsIgnoreCase("PORTRAIT")) {
			driver.rotate(ScreenOrientation.PORTRAIT);
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		currentOrientation = driver.getOrientation();
		System.out.println("AfterRotate : " + currentOrientation);
	}

	// take a screenshot
	public static void getScreenshot(AndroidDriver<MobileElement> driver, String outputlocation) throws IOException {
		System.out.println("Capturing the snapshot of the page ");
		File srcFiler = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFiler, new File(outputlocation));
	}
	
	// take a screenshot if error
	public void getscreenshot(AppiumDriver<MobileElement> driver) throws IOException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		Date date = new Date();
		String fileName = sdf.format(date);
		File des = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(des, new File(System.getProperty("user.dir")+"//Screenshot//"+fileName+".png"));
		System.out.println("Screenshot is captured");
	}
//	public void testAddContact() throws InterruptedException, IOException
//	{
//		try {
//			TouchAction ac = new TouchAction(driver);
//			MobileElement ele = driver.findElementById("com.android.messaging:id/conversation_snippet");
//			ac.longPress(ele).perform().release();
//			Thread.sleep(2000);
//			boolean flag = driver.findElementById("com.android.messaging:id/action_add_contact12").isDisplayed();
//			if(flag)
//			{
//				System.out.println("Passed");
//			}else
//			{
//				System.out.println("Failed");
//				getscreenshot(driver);
//			}
//		} catch (Exception e) {
//			getscreenshot(driver);
//		}
//		
//	}

	
	
}
