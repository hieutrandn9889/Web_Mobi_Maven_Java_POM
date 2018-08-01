package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Bt {
	static AppiumDriver<MobileElement> driverAppium;

	public void setUpAppium() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 4");
		cap.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "//App//BT.apk");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		try {
			driverAppium = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		driverAppium.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void test() throws Exception {
		Thread.sleep(8000);
		driverAppium.findElement(By.xpath("//*[@text='Skip']")).click();
		Thread.sleep(1000);
		driverAppium.findElement(By.xpath("//*[@text='Login']")).click();
		Thread.sleep(1000);
		driverAppium.findElement(By.xpath("//*[@text='Enter email']")).sendKeys("hieutrandn123@gmail.com");
		Thread.sleep(400);
		driverAppium.findElement(By.xpath("//android.widget.EditText[@content-desc='myPassword']")).sendKeys("Abc@123");
		Thread.sleep(1000);
		driverAppium.findElement(By.xpath("//*[@text='Login']")).click();
		Thread.sleep(3000);
		driverAppium.findElement(By.xpath("//android.widget.Button[@text='Allow']")).click();
		Thread.sleep(3000);
		driverAppium.findElement(By.xpath("//*[@content-desc='menuTaskBar']")).click();
		Thread.sleep(3000);
		driverAppium.findElement(By.xpath("//*[@text='My PA']")).click();
		Thread.sleep(3000);
		driverAppium.findElement(By.xpath("//*[@text='Medication']")).click();
		Thread.sleep(3000);
		driverAppium.findElement(By.xpath("//android.widget.TextView[@text='Add a Medicine']")).click();
		
		
	}


	public void closeApp() {
		driverAppium.quit();
	}

	public static void main(String[] args) throws Exception {
		Bt obj = new Bt();
		obj.setUpAppium();
		obj.test();
		obj.closeApp();
	}
}
