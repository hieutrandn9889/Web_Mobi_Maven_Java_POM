package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import commons.LogEvent;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class AbstractMobile {
	private AppiumDriver<MobileElement> driver;
	LogEvent LOG = new LogEvent();
	WebElement element;
	int timeout = 30;
	// trượt dọc
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
	public void getscreenshot(AppiumDriver<MobileElement> driver) throws IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		Date date = new Date();
		String fileName = sdf.format(date);
		File des = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(des, new File(System.getProperty("user.dir") + "//Screenshot//" + fileName + ".png"));
		System.out.println("Screenshot is captured");
	}
	// public void testAddContact() throws InterruptedException, IOException
	// {
	// try {
	// TouchAction ac = new TouchAction(driver);
	// MobileElement ele =
	// driver.findElementById("com.android.messaging:id/conversation_snippet");
	// ac.longPress(ele).perform().release();
	// Thread.sleep(2000);
	// boolean flag =
	// driver.findElementById("com.android.messaging:id/action_add_contact12").isDisplayed();
	// if(flag)
	// {
	// System.out.println("Passed");
	// }else
	// {
	// System.out.println("Failed");
	// getscreenshot(driver);
	// }
	// } catch (Exception e) {
	// getscreenshot(driver);
	// }
	//
	// }
	

	// common functions
	public void typeToElement(AndroidDriver<MobileElement> driver, String controlName, String value) {
		waitForDynamicControlVisible(driver, controlName, value, timeout);
		element = driver.findElement(By.id(controlName));
		element.clear();
		element.sendKeys(value);
	}
	public void typeToElementByXpath(AndroidDriver<MobileElement> driver, String controlName, String value) {
		waitForDynamicControlVisible(driver, controlName, value, timeout);
		element = driver.findElement(By.xpath(controlName));
		element.clear();
		element.sendKeys(value);
	}

	public void typeToElement(AndroidDriver<MobileElement> driver, String controlName, String locator, String value) {
		String newLocator = String.format(controlName, locator);
		waitForControlVisible(driver, newLocator, timeout);
		element = driver.findElement(By.id(newLocator));
		element.clear();
		element.sendKeys(value);
	}

	public void clearTextOfElement(AndroidDriver<MobileElement> driver, String controlName) {
		waitForControlVisible(driver, controlName, timeout);
		element = driver.findElement(By.id(controlName));
		element.clear();
	}
	public void clearTextOfElementByXpath(AndroidDriver<MobileElement> driver, String controlName) {
		waitForControlVisible(driver, controlName, timeout);
		element = driver.findElement(By.xpath(controlName));
		element.clear();
	}

	public void pressTABkey(AndroidDriver<MobileElement> driver) {
		element.sendKeys(Keys.TAB);
	}

	public void clickToElement(AndroidDriver<MobileElement> driver, String controlName) {
		waitForControlVisible(driver, controlName, timeout);
		element = driver.findElement(By.id(controlName));
		element.click();
	}
	public void clickToElementByXpath(AndroidDriver<MobileElement> driver, String controlName) {
		waitForControlVisible(driver, controlName, timeout);
		element = driver.findElement(By.xpath(controlName));
		element.click();
	}

	public void clickToElement(AndroidDriver<MobileElement> driver, String controlName, String value) {
		String newControl = String.format(controlName, value);
		waitForControlVisible(driver, newControl, timeout);
		element = driver.findElement(By.id(newControl));
		element.click();
	}

	public void selectDropdownlist(AndroidDriver<MobileElement> driver, String controlName, String value) {
		waitForDynamicControlVisible(driver, controlName, value, timeout);
		Select select = new Select(driver.findElement(By.id(controlName)));
		select.selectByVisibleText(value);
	}

	public void acceptAlert(AndroidDriver<MobileElement> driver) {
		waitForAlert(driver, timeout);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void navigateToURL(AndroidDriver<MobileElement> driver, String value) {
		driver.navigate().to(value);
	}

	public String getTextAlert(AndroidDriver<MobileElement> driver) {
		waitForAlert(driver, timeout);
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}

	public void waitForDynamicControlVisible(AndroidDriver<MobileElement> driver, String locator, String value,
			int timeout) {
		String newLocator = String.format(locator, value);
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(newLocator)));
		} catch (Exception e) {
			LOG.error("Not Found Element: " + newLocator);
			LOG.error(e.getMessage());
		}
	}

	public void waitForControlVisible(AndroidDriver<MobileElement> driver, String controlName, int timeout) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(controlName)));
		} catch (Exception e) {
			LOG.error("Not Found Element: " + controlName);
			LOG.error(e.getMessage());
		}
	}

	public void waitForAlert(AndroidDriver<MobileElement> driver, int timeout) {
		try {
			new WebDriverWait(driver, timeout).ignoring(NoAlertPresentException.class)
					.until(ExpectedConditions.alertIsPresent());
		} catch (Exception e) {
			LOG.error("Not Found Alert");
			e.printStackTrace();
		}
	}

	public void verifyElementDisplayed(AndroidDriver<MobileElement> driver, String controlName, String value) {
		String newLocator = String.format(controlName, value);
		WebElement element = driver.findElement(By.id(newLocator));
		element.isDisplayed();
	}

	public String getCurrentURL(AndroidDriver<MobileElement> driver) {
		return driver.getCurrentUrl();
	}

	// get text
	public String getTextOfElement(AndroidDriver<MobileElement> driver, String controlName) {
		waitForControlVisible(driver, controlName, timeout);
		element = driver.findElement(By.id(controlName));
		return element.getText();
	}

	public String getTextOfElement(AndroidDriver<MobileElement> driver, String controlName, String value) {
		String newLocator = String.format(controlName, value);
		waitForControlVisible(driver, newLocator, timeout);
		element = driver.findElement(By.id(newLocator));
		return element.getText();
	}

	public void scrollPageToElement(AndroidDriver<MobileElement> driver, String controlName) {
		waitForControlVisible(driver, controlName, timeout);
		element = driver.findElement(By.id(controlName));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	}

	public void scrollPageToElement(AndroidDriver<MobileElement> driver, String controlName, String value) {
		String newControl = String.format(controlName, value);
		waitForControlVisible(driver, newControl, timeout);
		element = driver.findElement(By.id(newControl));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	}



}
