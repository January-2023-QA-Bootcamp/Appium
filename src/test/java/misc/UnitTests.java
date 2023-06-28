package misc;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

public class UnitTests {

	@Test
	public void javaLatest() {
		var a = new RemoteWebDriver(null);
		a.close();
	}
}
