package appium.generic;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class InstalledApp {

	@Test
	public void installedAppTesting() throws MalformedURLException, InterruptedException {
		WebDriver driver;
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("appium:platformVersion", "12");
		caps.setCapability("appium:appActivity", "com.android.calculator2.Calculator");
		caps.setCapability("appium:appPackage", "com.google.android.calculator");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new RemoteWebDriver(url, caps);
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
		driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_4")).click();
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		String resultString = driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText();
		
		System.out.println(resultString);
	}
}
