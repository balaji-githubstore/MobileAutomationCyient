package com.cyient.cloud;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class UiSelectorNativeAppTest2 {

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
		
		driver.findElementByAndroidUIAutomator("UiSelector().description(\"Profile tab\")").click();
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Sign in\")").click();
		
		driver.findElementByAndroidUIAutomator("UiSelector().textContains(\"username\")").sendKeys("bala");
	
		//password 
		//click on sign in 
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Sign in\").index(0)").click();
		//get the error message and print it
		
		Thread.sleep(5000);
		driver.quit();
	}
}



