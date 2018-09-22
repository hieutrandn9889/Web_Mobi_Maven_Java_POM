package commons;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import utility.Hook;

public class AbstractMobile {
	AppiumDriver<MobileElement> driverAppium = Hook.getAppiumDriver();
	LogEvent LOG = new LogEvent();
	MobileElement element;
	int timeout = 150;

	// trượt dọc old java-client 5.4.1
//	public static void swipeVerticalTopToDown(AppiumDriver<MobileElement> driverAppium, double startPercentage,
//			double finalPercentage, double anchorPercentage, int duration) throws Exception {
//		Dimension size = driverAppium.manage().window().getSize();
//		int anchor = (int) (size.width * anchorPercentage);
//		int startPoint = (int) (size.height * startPercentage);
//		int endPoint = (int) (size.height * finalPercentage);
//		new TouchAction(driverAppium).press(anchor, startPoint).waitAction(Duration.ofMillis(duration))
//				.moveTo(anchor, endPoint).release().perform();
//	}

	// trượt ngang old java-client 5.4.1
//	public static void swipeHorizontal(AppiumDriver<MobileElement> driverAppium, double startPercentage,
//			double finalPercentage, double anchorPercentage, int duration) throws Exception {
//
//		Dimension size = driverAppium.manage().window().getSize();
//		int anchor = (int) (size.height * anchorPercentage);
//		int startPoint = (int) (size.width * startPercentage);
//		int endPoint = (int) (size.width * finalPercentage);
//		new TouchAction(driverAppium).press(startPoint, anchor).waitAction(Duration.ofMillis(duration))
//				.moveTo(endPoint, anchor).release().perform();
//	}
	
//	// trượt dọc new java-client 6.1
//	private void verticalSwipe(String locator) throws InterruptedException {
//        Thread.sleep(3000);
//        MobileElement slider = driverAppium.findElementByAccessibilityId(locator);
//        Point source = slider.getCenter();
//        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//        Sequence dragNDrop = new Sequence(finger, 1);
//        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(0),
//                PointerInput.Origin.viewport(),
//                source.x / 2, source.y + 400));
//        dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()));
//        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(600),
//                PointerInput.Origin.viewport(), source.getX() / 2, source.y / 2));
//        dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));
//        driverAppium.perform(Arrays.asList(dragNDrop));
//    }
//	
//
//	// trượt ngang new java-client 6.1
//	 public void horizontalSwipingTest(String locator) throws Exception {
//	        MobileElement slider = driverAppium.findElementByAccessibilityId(locator);
//	        Point source = slider.getLocation();
//	        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//	        Sequence dragNDrop = new Sequence(finger, 1);
//	        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(0),
//	                PointerInput.Origin.viewport(), source.x, source.y));
//	        dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()));
//	        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(600),
//	                PointerInput.Origin.viewport(),
//	                source.x + 400, +source.y));
//	        dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));
//	        driverAppium.perform(Arrays.asList(dragNDrop));
//	    }
	 
	// trượt dọc old java-client 6.1
		public static void swipeVerticalTopToDown(AppiumDriver<MobileElement> driverAppium, double startPercentage,
				double finalPercentage, double anchorPercentage, int duration) throws Exception {
			Dimension size = driverAppium.manage().window().getSize();
			int anchor = (int) (size.width * anchorPercentage);
			int startPoint = (int) (size.height * startPercentage);
			int endPoint = (int) (size.height * finalPercentage);
			new TouchAction(driverAppium).press(new PointOption().withCoordinates(anchor, startPoint)).waitAction(waitOptions(Duration.ofMillis(duration)))
			.moveTo((PointOption) point(anchor, endPoint)).release().perform();
		}
		
		// trượt dọc ngang java-client 6.1
		public static void swipeHorizontal(AppiumDriver<MobileElement> driverAppium, double startPercentage,
				double finalPercentage, double anchorPercentage, int duration) throws Exception {
	
			Dimension size = driverAppium.manage().window().getSize();
			int anchor = (int) (size.height * anchorPercentage);
			int startPoint = (int) (size.width * startPercentage);
			int endPoint = (int) (size.width * finalPercentage);
			new TouchAction(driverAppium).press(new PointOption().withCoordinates(startPoint, anchor)).waitAction(waitOptions(Duration.ofMillis(duration)))
			.moveTo(point(endPoint, anchor)).release().perform();
		}
		private static WaitOptions waitOptions(Duration ofMillis) {
			// TODO Auto-generated method stub
			return null;
		}
		private static PointOption point(int anchor, int endPoint) {
		// TODO Auto-generated method stub
		return null;
		}
	
	
	 // dragAndDrop
	 public void dragAndDrop(String dragMeLocator, String dropzone) throws InterruptedException {

	        MobileElement dragMe = (MobileElement) new WebDriverWait(driverAppium, 30).until(ExpectedConditions
	                .elementToBeClickable(MobileBy.AccessibilityId(dragMeLocator)));
	        Point source = dragMe.getCenter();
	        Point target = driverAppium.findElementByAccessibilityId(dropzone).getCenter();
	        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
	        Sequence dragNDrop = new Sequence(finger, 1);
	        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(0),
	                PointerInput.Origin.viewport(), source.x, source.y));
	        dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()));
	        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(600),
	                PointerInput.Origin.viewport(),
	                target.x, target.y));
	        dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));
	        driverAppium.perform(Arrays.asList(dragNDrop));
	    }
	 
	 
	 // multin touch
	 public void multiTouchTest() throws InterruptedException {
	        MobileElement slider = driverAppium.findElementByAccessibilityId("slider");
	        MobileElement slider1 = driverAppium.findElementByAccessibilityId("slider1");

	        Dimension sizeSlider = slider.getSize();
	        Dimension sizeSlider1 = slider1.getSize();
	        TouchAction touchAction1 =
	                new TouchAction(driverAppium).press(ElementOption.element(slider, 0, sizeSlider.height / 2))
	                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
	                        .moveTo(ElementOption.element(slider, sizeSlider.width / 2, sizeSlider.height / 2));
	        TouchAction touchAction2 =
	                new TouchAction(driverAppium).press(ElementOption.element(slider1, 0, sizeSlider1.height / 2)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
	                        .moveTo(ElementOption.element(slider1, sizeSlider1.width / 2, sizeSlider1.height / 2));
	        new MultiTouchAction(driverAppium).add(touchAction1).add(touchAction2).perform();
	        Thread.sleep(2000);
	    }
	 
	 
	// LANDSCAPE & PORTRAIT
	public void testRotate() {
		if (((AppiumDriver<MobileElement>) driverAppium).getOrientation().equals("LANDSCAPE")) {
			switchtomode("PORTRAIT");
		} else {
			switchtomode("LANDSCAPE");
		}

	}

	// LANDSCAPE & PORTRAIT
	public void switchtomode(String modeType) {
		ScreenOrientation currentOrientation = ((AppiumDriver<MobileElement>) driverAppium).getOrientation();
		System.out.println("CurrentOrientation : " + currentOrientation);
		if (modeType.equalsIgnoreCase("LANDSCAPE"))
			((AppiumDriver<MobileElement>) driverAppium).rotate(ScreenOrientation.LANDSCAPE);
		else if (modeType.equalsIgnoreCase("PORTRAIT")) {
			((AppiumDriver<MobileElement>) driverAppium).rotate(ScreenOrientation.PORTRAIT);
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		currentOrientation = ((AppiumDriver<MobileElement>) driverAppium).getOrientation();
		System.out.println("AfterRotate : " + currentOrientation);
	}

	// take a screenshot
	public static void getScreenshot(AppiumDriver<MobileElement> driverAppium, String outputlocation) throws IOException {
		System.out.println("Capturing the snapshot of the page ");
		File srcFiler = ((TakesScreenshot) driverAppium).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFiler, new File(outputlocation));
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

	// common functions
	public void typeToElement(AppiumDriver<MobileElement> driverAppium, String controlName, String value) {
		waitForDynamicControlVisible(driverAppium, controlName, value, timeout);
		element = driverAppium.findElement(By.id(controlName));
		element.clear();
		element.sendKeys(value);
	}

	public void typeToElementByXpath(AppiumDriver<MobileElement> driverAppium, String controlName, String value) {
		waitForDynamicControlVisible(driverAppium, controlName, value, timeout);
		element = driverAppium.findElement(By.xpath(controlName));
		element.clear();
		element.sendKeys(value);
	}

	public void typeToElement(AppiumDriver<MobileElement> driverAppium, String controlName, String locator,
			String value) {
		String newLocator = String.format(controlName, locator);
		waitForControlVisibleID(driverAppium, newLocator, timeout);
		element = driverAppium.findElement(By.id(newLocator));
		element.clear();
		element.sendKeys(value);
	}

	public void clearTextOfElement(AppiumDriver<MobileElement> driverAppium, String controlName) {
		waitForControlVisibleXpath(driverAppium, controlName, timeout);
		element = driverAppium.findElement(By.xpath(controlName));
		element.clear();
	}

	public void clearTextOfElementByXpath(AppiumDriver<MobileElement> driverAppium, String controlName) {
		waitForControlVisibleXpath(driverAppium, controlName, timeout);
		element = driverAppium.findElement(By.xpath(controlName));
		element.clear();
	}

	public void pressTABkey(AppiumDriver<MobileElement> driver) {
		element.sendKeys(Keys.TAB);
	}

	public void clickToElementByID(AppiumDriver<MobileElement> driverAppium, String controlName) {
		waitForControlVisibleID(driverAppium, controlName, timeout);
		element = driverAppium.findElement(By.id(controlName));
		element.click();
	}

	public void clickToElementByXpath(AppiumDriver<MobileElement> driverAppium, String controlName) {
		waitForControlVisibleXpath(driverAppium, controlName, timeout);
		element = driverAppium.findElement(By.xpath(controlName));
		element.click();
	}

	public void clickToElementValue(AppiumDriver<MobileElement> driverAppium, String controlName, String value) {
		String newControl = String.format(controlName, value);
		waitForControlVisibleXpath(driverAppium, newControl, timeout);
		element = driverAppium.findElement(By.xpath(newControl));
		element.click();
	}

	public void selectDropdownlist(AppiumDriver<MobileElement> driverAppium, String controlName, String value) {
		waitForDynamicControlVisible(driverAppium, controlName, value, timeout);
		Select select = new Select(driverAppium.findElement(By.xpath(controlName)));
		select.selectByVisibleText(value);
	}

	public void acceptAlert(AppiumDriver<MobileElement> driverAppium) {
		waitForAlert(driverAppium, timeout);
		Alert alert = driverAppium.switchTo().alert();
		alert.accept();
	}

	public void navigateToURL(AppiumDriver<MobileElement> driverAppium, String value) {
		driverAppium.navigate().to(value);
	}

	public String getTextAlert(AppiumDriver<MobileElement> driverAppium) {
		waitForAlert(driverAppium, timeout);
		Alert alert = driverAppium.switchTo().alert();
		return alert.getText();
	}

	public void waitForDynamicControlVisible(AppiumDriver<MobileElement> driverAppium, String locator, String value,
			int timeout) {
		String newLocator = String.format(locator, value);
		try {
			WebDriverWait wait = new WebDriverWait(driverAppium, timeout);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newLocator)));
		} catch (Exception e) {
			LOG.error("Not Found Element: " + newLocator);
			LOG.error(e.getMessage());
		}
	}
	
	public void waitForControlVisibleID(AppiumDriver<MobileElement> driverAppium, String controlName, int timeout) {
		try {
			WebDriverWait wait = new WebDriverWait(driverAppium, timeout);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(controlName)));
		} catch (Exception e) {
			LOG.error("Not Found Element: " + controlName);
			LOG.error(e.getMessage());
		}
	}

	public void waitForControlVisibleXpath(AppiumDriver<MobileElement> driverAppium, String controlName, int timeout) {
		try {
			WebDriverWait wait = new WebDriverWait(driverAppium, timeout);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(controlName)));
		} catch (Exception e) {
			LOG.error("Not Found Element: " + controlName);
			LOG.error(e.getMessage());
		}
	}

	public void waitForAlert(AppiumDriver<MobileElement> driverAppium, int timeout) {
		try {
			new WebDriverWait(driverAppium, timeout).ignoring(NoAlertPresentException.class)
					.until(ExpectedConditions.alertIsPresent());
		} catch (Exception e) {
			LOG.error("Not Found Alert");
			e.printStackTrace();
		}
	}

	public void verifyElementDisplayed(AppiumDriver<MobileElement> driverAppium, String controlName, String value) {
		String newLocator = String.format(controlName, value);
		WebElement element = driverAppium.findElement(By.id(newLocator));
		element.isDisplayed();
	}

	public String getCurrentURL(AppiumDriver<MobileElement> driverAppium) {
		return driverAppium.getCurrentUrl();
	}

	// get text
	public String getTextOfElement(AppiumDriver<MobileElement> driverAppium, String controlName) {
		waitForControlVisibleID(driverAppium, controlName, timeout);
		element = driverAppium.findElement(By.id(controlName));
		return element.getText();
	}
	// get text by xpath
	public String getTextOfElementByXpath(AppiumDriver<MobileElement> driverAppium, String controlName) {
		waitForControlVisibleID(driverAppium, controlName, timeout);
		element = driverAppium.findElement(By.xpath(controlName));
		return element.getText();
	}

	public String getTextOfElement(AppiumDriver<MobileElement> driverAppium, String controlName, String value) {
		String newLocator = String.format(controlName, value);
		waitForControlVisibleID(driverAppium, newLocator, timeout);
		element = driverAppium.findElement(By.id(newLocator));
		return element.getText();
	}

	public void scrollPageToElement(AppiumDriver<MobileElement> driverAppium, String controlName) {
		waitForControlVisibleID(driverAppium, controlName, timeout);
		element = driverAppium.findElement(By.id(controlName));
		((JavascriptExecutor) driverAppium).executeScript("arguments[0].scrollIntoView();", element);
	}

	public void scrollPageToElement(AppiumDriver<MobileElement> driverAppium, String controlName, String value) {
		String newControl = String.format(controlName, value);
		waitForControlVisibleID(driverAppium, newControl, timeout);
		element = driverAppium.findElement(By.id(newControl));
		((JavascriptExecutor) driverAppium).executeScript("arguments[0].scrollIntoView();", element);
	}

}
