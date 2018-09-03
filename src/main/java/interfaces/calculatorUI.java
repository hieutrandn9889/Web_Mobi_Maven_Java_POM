package interfaces;

public class calculatorUI {
	public static String NUMER_SEVEN = "com.android.calculator2:id/digit_7";
	public static String SYMBOL_PlUS = "com.android.calculator2:id/op_add";
	public static String NUMER_TWO = "com.android.calculator2:id/digit_2";
	public static String SYMBOL_EQUAL = "com.android.calculator2:id/eq";
	public static String RESULT = "com.android.calculator2:id/result";

	
	
	public static String PASSWORD_INCORECT_ERROR_MESSAGE = "//*[@id='loginMessageFail' and contains(text(),'%s')]";
	public static String NAME_INCORECT_ERROR_MESSAGE = "//*[contains(text(),'%s')]";
	public static String RE_PASSWORD_INCORECT_ERROR_MESSAGE = "//*[contains(text(),'%s')]";
	public static String NEW_USER_BUTTON = "//span[contains(.,'New user')]";
	public static String PROFILE_NAME_TITLE = "//div[@class='username' and contains(text(),'%s')]";
}
