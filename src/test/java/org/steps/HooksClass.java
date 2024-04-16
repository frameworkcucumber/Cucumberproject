package org.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.test.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
	@Before
	public void openBrowser() {
		ChromeBrowser();
	}
	@After
	public void closeBrowser(Scenario s) {
		if (s.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot)driver;
			byte[] ss = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(ss, "image/png");
		}
		driver.quit();
	}

}
