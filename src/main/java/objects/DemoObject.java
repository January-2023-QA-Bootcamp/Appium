package objects;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonAction.*;

public class DemoObject {

	public DemoObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"sort button\"]/android.widget.ImageView")
	WebElement orderBy;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"nameDesc\"]/android.widget.TextView[2]")
	WebElement nameDescending;
	
	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"store item\"])[2]/android.view.ViewGroup[1]/android.widget.ImageView")
	WebElement itemOnesie;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"container header\"]/android.widget.TextView")
	WebElement itemTitle;
	
	public void clcikOrderBy() {
		click(orderBy);
	}
	
	public void clickNameDescending() {
		click(nameDescending);
	}
	
	public void clickItem() {
		click(itemOnesie);
	}
	
	public void validateItemTitle(String title) {
		Assertions.assertEquals(title, getText(itemTitle));
	}
}
