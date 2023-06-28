package common;

import org.openqa.selenium.WebElement;

import report.Logs;

public class CommonAction {

	public static void click(WebElement element) {
		element.click();
		Logs.getLog(element + " <--- has been clicked");
	}
	
	public static String getText(WebElement element) {
		Logs.getLog(element + " has text : " + element.getText());
		return element.getText();
	}
}
