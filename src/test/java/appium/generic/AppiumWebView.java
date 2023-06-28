package appium.generic;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AppiumWebView {

	/*
	 * Pre-Conditions: 1. Appium server running 2. Device is connected
	 */

	@Test
	public void webViewAppTesting() throws MalformedURLException, InterruptedException {
		WebDriver driver;
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("appium:platformVersion", "12");
		caps.setBrowserName("chrome");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new RemoteWebDriver(url, caps);

		System.out.println("Device connected");

		driver.get("https://www.amazon.com/");

		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.cssSelector("#nav-search-keywords")).sendKeys("iphone 14", Keys.ENTER);
		
		Thread.sleep(3000);

	}
}
