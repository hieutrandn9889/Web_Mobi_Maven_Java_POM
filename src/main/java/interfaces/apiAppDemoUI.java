package interfaces;

public class apiAppDemoUI {
	public static String ACCESSIBILITY = "//*[@text='Accessibility']";
	public static String MSG_ACCESSIBILITY_NODE_PROVIDER = "//*[@text='Accessibility Node Provider']";
	public static String CUSTOM_VIEW = "//*[@text='Custom View']";
	public static String VIEW_BUTTON = "//*[@text='Views']";
	public static String TABS_BUTTON = "//*[@text='Tabs']";
	public static String CONTENT_BY_ID_BUTTON = "//*[@text='1. Content By Id']";

	// check browser chrome
	public static String INPUT_TEXT_BOX = "//*[@name='q']";
	public static String SUBMIT_BUTTON = "//*[@name='btnK']";

	// sms
	public static String OS_BUTTON = "//*[@text='OS']";
	public static String SMS_MESSAGING_BUTTON = "//*[@text='SMS Messaging']";
	public static String INPUT_TEXT_BOX_SMS = "io.appium.android.apis:id/sms_recipient";
	public static String INPUT_CONTENT_SMS = "io.appium.android.apis:id/sms_content";
	public static String SEND_BUTTON = "//*[@text='SEND']";
	public static String MSG_SENT = "//*[@text='Message sent!']";
	public static String CONTENT_SMS = "com.android.messaging:id/subject";

	// sms
	public static String AUTO_COMPLETE_BUTTON = "//*[@text='Auto Complete']";
	public static String SCREEN_TOP_BUTTON = "//*[@text='1. Screen Top']";
	public static String TEXT_BOX_CONTENT = "io.appium.android.apis:id/edit";
	
	
	
	
	// other
	public static String PASSWORD_INCORECT_ERROR_MESSAGE = "//*[@id='loginMessageFail' and contains(text(),'%s')]";
	public static String NAME_INCORECT_ERROR_MESSAGE = "//*[contains(text(),'%s')]";
	public static String RE_PASSWORD_INCORECT_ERROR_MESSAGE = "//*[contains(text(),'%s')]";
	public static String NEW_USER_BUTTON = "//span[contains(.,'New user')]";
	public static String PROFILE_NAME_TITLE = "//div[@class='username' and contains(text(),'%s')]";
}
