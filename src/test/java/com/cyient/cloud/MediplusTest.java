package com.cyient.cloud;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MediplusTest {

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();

		// Set your access credentials
		caps.setCapability("browserstack.user", "dinakaranbalaji1");
		caps.setCapability("browserstack.key", "6yXRE4nK1fyvTHWA2kPD");

		// Set URL of the application under test
		caps.setCapability("app", "bs://b2da7ac07ff68f3d90da1798935d2c431e7bd666");

		// Specify device and os_version for testing
		caps.setCapability("device", "Samsung Galaxy S10e");
		caps.setCapability("os_version", "9.0");

		// Set other BrowserStack capabilities
		caps.setCapability("project", "First Java Project-bala-medplus");
		caps.setCapability("build", "Java Android-medplus");
		caps.setCapability("name", "first_test_Medplus");

		// Initialise the remote Webdriver using BrowserStack remote URL
		// and desired capabilities defined above
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://hub.browserstack.com/wd/hub"),
				caps);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		driver.findElementByXPath("//*[@text='Account']").click();
		//click on account
		driver.findElementByXPath("//android.widget.EditText").sendKeys("hello");
		
		
		
		driver.findElementByXPath("(//android.widget.EditText)[2]").sendKeys("hello");
		//android.widget.EditText
		
		driver.findElementByXPath("//*[@text='Sign In']").click();
		System.out.println(driver.getPageSource());

		System.out.println(driver.getPlatformName());

		System.out.println(driver.getDeviceTime());

		driver.quit();

	}

}
