package ZP_pages;

import org.openqa.selenium.WebDriver;

public class ZingPoll_PageFactory {
	public static ZingPoll_HomePage getHomePage(WebDriver driver) {
		return new ZingPoll_HomePage();
	}
}
