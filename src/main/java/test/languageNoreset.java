package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class languageNoreset {
	static AppiumDriver<MobileElement> driverAppium;

	public void setUpAppium(String lang, String locate) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 4");
		cap.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "//App//BT.apk");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		cap.setCapability("noReset", "false");
		cap.setCapability("language", lang);
		cap.setCapability("locale", locate);
		try {
			driverAppium = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		driverAppium.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void test() throws Exception {
		System.out.println("test");

	}

	public void closeApp() {
		driverAppium.quit();
	}

	public static void main(String[] args) throws Exception {
		languageNoreset obj = new languageNoreset();
		String lang = null;
		String locale = getLocalFromLang(lang);
		obj.setUpAppium(lang, locale);
		obj.test();
		obj.closeApp();
	}

	protected static String getLocalFromLang(String lang) {
		if (lang.equals("EN"))
			return "US";
		else if (lang.equals("DE"))
			return "DE";
		else if (lang.equals("IT"))
			return "IT";
		else
			return "FR";
	}

	// @Android
	// Scenario Outline: Verify that user cannot successfully register with a wrong
	// Account ID
	// Given Opening the app in language "<language>"
	// Examples:
	// | language | Content |
	// | DE | Die Angaben stimmen nicht mit unseren Daten überein. Sollten Ihre
	// Angaben korrekt sein, kontaktieren Sie bitte unseren Kundendienst unter der
	// Nummer +41 44 659 64 92. |
	// | EN | The information entered does not match our data. If your information
	// is correct, please contact our customer service on +41 44 659 64 92. |
	// | FR | Les indications ne correspondent pas à nos données. Si vos indications
	// sont correctes, contactez notre service clientèle au numéro +41 44 659 64 92.
	// |
	// | IT | I dati immessi non coincidono con i nostri dati. Nel caso in cui i
	// dati siano corretti, la preghiamo di contattare il nostro servizio clienti al
	// numero +41 44 659 64 92. |

	
	// @Given("^Opening the app in language \"([^\"]*)\"$")
	// public void open_the_app_in_language(String lang) throws Exception {
	// LOGGER.info("User open the Register");
	// System.out.println("LANG" + lang);
	// locale = getLocalFromLang(lang);
	// driver = openApp(lang.toLowerCase(), locale);
	// registerPage = new RegisterPage(driver);
	// }

	
	
	// public AppiumDriver openApp(String lang, String locale) {
	// DeviceProfile br = new DeviceProfile();
	// return Constants.driver = br.setUpAppium(lang, locale);
	// }

	
	// public void DeviceProfile() {
	// LoadDataConfig loadDataConfig = new LoadDataConfig(Constants.APP_CONFIG);
	// String userDir = System.getProperty("user.dir");
	// Constants.app = userDir + loadDataConfig.getAPP();
	// Constants.deviceName = loadDataConfig.getDeviceName();
	// Constants.platformName = loadDataConfig.getPlatformName();
	// Constants.platformVersion = loadDataConfig.getDeviceVersion();
	// Constants.bundleID = loadDataConfig.getBundleID();
	// }

}
