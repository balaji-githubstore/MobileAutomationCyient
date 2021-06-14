package com.cyient.cloud;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class UiSelectorScrollNativeAppTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities caps = new DesiredCapabilities();

		// Set your access credentials
		caps.setCapability("browserstack.user", "dinakaranbalaji1");
		caps.setCapability("browserstack.key", "6yXRE4nK1fyvTHWA2kPD");

		// Set URL of the application under test
		caps.setCapability("app", "bs://376a530b1b6696418b303adb00b8098771c20172");

		// Specify device and os_version for testing
		caps.setCapability("device", "Google Pixel 3");
		caps.setCapability("os_version", "9.0");

		// Set other BrowserStack capabilities
		caps.setCapability("project", "Advance Native App UiSelector Project");
		caps.setCapability("build", "Java Android");
		caps.setCapability("name", "UiSelector_test");

		// Initialise the remote Webdriver using BrowserStack remote URL
		// and desired capabilities defined above
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://hub.browserstack.com/wd/hub"),
				caps);
	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Dismiss\")").click();
		
		
		String visibleText = "Arts";

        driver.findElementByAndroidUIAutomator
        ("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))").click();
		
		
        visibleText = "Art of Asia";
		
        driver.findElementByAndroidUIAutomator
        ("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))").click();
		
		Thread.sleep(5000);
		driver.quit();
	}

}








