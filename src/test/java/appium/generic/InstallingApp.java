package appium.generic;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class InstallingApp {

	@Test
	public void installingApp() throws MalformedURLException, InterruptedException {
		@SuppressWarnings("unused")
		WebDriver driver = null;
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("appium:platformVersion", "12");
		caps.setCapability("appium:app", "/Users/mdnas/eclipse-workspace/mobile.jan.23/src/test/resources/Demo.apk");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new RemoteWebDriver(url, caps);
		Thread.sleep(2000);
	}
}
