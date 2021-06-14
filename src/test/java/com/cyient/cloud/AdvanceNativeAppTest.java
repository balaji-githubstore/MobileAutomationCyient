package com.cyient.cloud;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AdvanceNativeAppTest {

	public static void main(String[] args) throws MalformedURLException {

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
		caps.setCapability("project", "Advance Native App Project");
		caps.setCapability("build", "Java Android");
		caps.setCapability("name", "Scroll_test");

		// Initialise the remote Webdriver using BrowserStack remote URL
		// and desired capabilities defined above
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://hub.browserstack.com/wd/hub"),
				caps);
	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElementByXPath("//*[@text='Dismiss']").click();

		//scroll
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		while(driver.findElementsByXPath("//*[contains(@text,'Art')]").size()==0)
		{
			Map<String,String> map=new HashMap<String, String>();
			map.put("command", "input touchscreen swipe 1007 1323 1007 1167");
			driver.executeScript("mobile:shell", map);
		}
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//*[contains(@text,'Art')]").click();
		
		
		//scroll until Asia text is available 
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		while(driver.findElementsByXPath("//*[contains(@text,'Asia')]").size()==0)
		{
			//scroll
			Map<String,String> map=new HashMap<String, String>();
			map.put("command", "input touchscreen swipe 1007 1323 1007 1167");
			driver.executeScript("mobile:shell", map);
		}
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//*[contains(@text,'Asia')]").click();
	}

}
