package ZP_pages;

import org.openqa.selenium.WebDriver;
import commons.AbstractPage;
import commons.Constants;
import interfaces.zingPollPageUI;
import utility.Hook;

public class ZingPoll_HomePage extends AbstractPage {
	WebDriver driver = Hook.getDriver();
	
	public void openZingPollPage() {
		openURL(driver, Constants.ZINGPOLL_URL);
	}

	public void clickSignInTitle() {
		waitForControl(driver, zingPollPageUI.SIGN_IN_TITLE, timeWait);
		click(driver, zingPollPageUI.SIGN_IN_TITLE);
	}

	public void isSignInPopupDisplay() {
		waitForControl(driver, zingPollPageUI.SIGN_IN_POPUP, timeWait);
		isControlDisplayed(driver, zingPollPageUI.SIGN_IN_POPUP);
	}

	public void isSignUpPopupDisplay() {
		waitForControl(driver, zingPollPageUI.SIGN_IN_POPUP, timeWait);
		isControlDisplayed(driver, zingPollPageUI.SIGN_IN_POPUP);
	}

	public void typeIntoEmail(String email) {
		waitForControl(driver, zingPollPageUI.EMAIL_TEXTBOX, timeWait);
		type(driver, zingPollPageUI.EMAIL_TEXTBOX, email);
		sleep(2);
	}

	public void typeIntoPassword(String password) {
		waitForControl(driver, zingPollPageUI.PASSWORD_TEXTBOX, timeWait);
		type(driver, zingPollPageUI.PASSWORD_TEXTBOX, password);
		sleep(2);
	}

	public void clickSignInButton() {
		waitForControl(driver, zingPollPageUI.LOGIN_BUTTON, timeWait);
		click(driver, zingPollPageUI.LOGIN_BUTTON);
	}

	public void clickRegisterButton() {
		waitForControl(driver, zingPollPageUI.REGISTER_BUTTON, timeWait);
		click(driver, zingPollPageUI.REGISTER_BUTTON);
	}

	public void clickNewUserButton() {
		waitForControl(driver, zingPollPageUI.NEW_USER_BUTTON, timeWait);
		click(driver, zingPollPageUI.NEW_USER_BUTTON);
	}

	public void isNameNotRegisteredErrorMessageDisplay(String errorMsg) {
		waitForControl(driver, zingPollPageUI.ERROR_NAME_NOT_REGISTERED_MESSAGE, errorMsg, timeWait);
		isControlDisplayed(driver, zingPollPageUI.ERROR_NAME_NOT_REGISTERED_MESSAGE, errorMsg);
	}

	public void isEmailNotRegisteredErrorMessageDisplay(String errorMsg) {
		waitForControl(driver, zingPollPageUI.ERROR_NOT_REGISTERED_MESSAGE, errorMsg, timeWait);
		isControlDisplayed(driver, zingPollPageUI.ERROR_NOT_REGISTERED_MESSAGE, errorMsg);
	}

	public void isPasswordIncorrectErrorMessageDisplay(String errorMsg) {
		waitForControl(driver, zingPollPageUI.PASSWORD_INCORECT_ERROR_MESSAGE, errorMsg, timeWait);
		isControlDisplayed(driver, zingPollPageUI.PASSWORD_INCORECT_ERROR_MESSAGE, errorMsg);
	}

	public void isNameIncorrectErrorMessageDisplay(String errorMsg) {
		waitForControl(driver, zingPollPageUI.NAME_INCORECT_ERROR_MESSAGE, errorMsg, timeWait);
		isControlDisplayed(driver, zingPollPageUI.NAME_INCORECT_ERROR_MESSAGE, errorMsg);
	}

	public void isTCIncorrectErrorMessageDisplay(String errorMsg) {
		waitForControl(driver, zingPollPageUI.TC_INCORECT_ERROR_MESSAGE, errorMsg, timeWait);
		isControlDisplayed(driver, zingPollPageUI.TC_INCORECT_ERROR_MESSAGE, errorMsg);
	}

	public void isRePasswordIncorrectErrorMessageDisplay(String errorMsg) {
		waitForControl(driver, zingPollPageUI.RE_PASSWORD_INCORECT_ERROR_MESSAGE, errorMsg, timeWait);
		isControlDisplayed(driver, zingPollPageUI.RE_PASSWORD_INCORECT_ERROR_MESSAGE, errorMsg);
	}

	public void isProfileNameDisplay(String profileName) {
		waitForControl(driver, zingPollPageUI.PROFILE_NAME_TITLE, profileName, timeWait);
		isControlDisplayed(driver, zingPollPageUI.PROFILE_NAME_TITLE, profileName);
	}

	
}
