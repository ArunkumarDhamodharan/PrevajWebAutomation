package org.hooks;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.PrevajPOM;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {

	@Before
	public void setUp() throws InterruptedException {
		try {
			getDriver("chrome");
			getUrl("https://prevaj.com/");
			windMax();
			PrevajPOM a = new PrevajPOM();
			WebElement cookies = waitForElementToBeVisible(a.getCookiesAccept(), 90);
			cookies.isDisplayed();
			cookies.click();

			System.out.println("Browser Launched and Url Opened Successfull");
		} catch (Exception e) {
			System.out.println("Browser Launched and Url Opened unSuccessfull" + "Error: " + e.getMessage());
		}
		Thread.sleep(3000);
	}

	@After
	public void signOff() {
		try {
			// Take a screenshot in case of failure
			takeScreenshot("failure_screenshot");

			// Close all browser windows
			if (driver != null) {
				driver.quit();
			}
			System.out.println("Browser closed successfully.");
		} catch (Exception e) {
			System.err.println("Error during browser close or screenshot capture: " + e.getMessage());
		}
	}
}