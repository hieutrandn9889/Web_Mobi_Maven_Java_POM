package test;

import org.testng.annotations.Test;

public class ParallelTest extends Base_IOS_Parabell {


	@Test
	public void test(){
		driver.findElementByAccessibilityId("Alerts").click();
		driver.findElementByAccessibilityId("Create App Alert").click();
		driver.findElementByAccessibilityId("Will do").click();
		driver.findElementByAccessibilityId("Back").click();
		driver.findElementByAccessibilityId("Attributes").click();
		driver.findElementByAccessibilityId("Second").click();
		driver.findElementByAccessibilityId("First").click();
		driver.findElementByAccessibilityId("Back").click();
		driver.findElementByAccessibilityId("Scrolling").click();
		driver.findElementByAccessibilityId("TableView").click();
		driver.findElementByAccessibilityId("Back").click();
		driver.findElementByAccessibilityId("ScrollView").click();
		driver.findElementByAccessibilityId("Back").click();
	}
}
