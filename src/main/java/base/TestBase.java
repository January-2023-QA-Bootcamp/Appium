package base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import objects.DemoObject;
import util.ReadConfig;
import static util.IConstant.*;
import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

	protected WebDriver driver;
	protected DemoObject pageObj;
	static ReadConfig config;
	DesiredCapabilities caps;
	
	@BeforeAll
	public static void initConfig() {
		config = new ReadConfig();
	}
	
	@BeforeEach
	public void initDriver() {
		caps = new DesiredCapabilities();
		setCommonCaps();
		setCapsForInstallingAndroidApp();
		URL url;
		try {
			url = new URL(config.getPropertyValue(KEY_REMOTE_URL));
			driver = new RemoteWebDriver(url, caps);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		pageObj = new DemoObject(driver);
	}
	
	public void setCommonCaps() {
		caps.setCapability(PLATFORM_NAME, config.getPropertyValue(KEY_PLATFORM_NAME));
		caps.setCapability(PLATFORM_VERSION, config.getPropertyValue(KEY_PLATFORM_VER));
	}
	
	public void setCapsForAndroidInstalledApp() {
		caps.setCapability(APP_ACTIVITY, config.getPropertyValue(KEY_APP_ACTIVITY));
		caps.setCapability(APP_PACKAGE, config.getPropertyValue(KEY_APP_PACKAGE));
	}
	
	public void setCapsForInstallingAndroidApp() {
		caps.setCapability(APP, config.getPropertyValue(KEY_APP_LOCATION));
	}
	
	public void setWebViewBrowser(String browser) {
		caps.setBrowserName(browser);
	}
	
	@AfterEach
	public void tearUp() {
		driver.quit();
	}
}
