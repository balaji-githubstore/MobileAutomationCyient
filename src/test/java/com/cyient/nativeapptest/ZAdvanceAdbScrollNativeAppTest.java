package com.cyient.nativeapptest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ZAdvanceAdbScrollNativeAppTest {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "lenovo");
		cap.setCapability("platformName", "Android");
		cap.setCapability("app", "C:\\Components\\app\\Khan Academy_v6.3.0_apkpure.com.apk");
		
		cap.setCapability("udid", "f43c4160");

		AndroidDriver<WebElement>  driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.findElementByXPath("//*[@text='Dismiss']").click();
		
		//scroll until Art text is available 
		//adb shell input touchscreen swipe 1007 1323 1007 1167
		
		//scroll start
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		while(driver.findElementsByXPath("//*[contains(@text,'Art')]").size()==0)
		{
			//scroll
			Map<String,String> map=new HashMap<String, String>();
			map.put("command", "input touchscreen swipe 1007 1323 1007 1167");
			driver.executeScript("mobile:shell", map);
		}
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//scroll end
		
		
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
