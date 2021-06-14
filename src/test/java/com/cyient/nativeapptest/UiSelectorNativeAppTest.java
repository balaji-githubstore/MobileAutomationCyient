package com.cyient.nativeapptest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class UiSelectorNativeAppTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "lenovo");
		cap.setCapability("platformName", "Android");
		cap.setCapability("app", "C:\\Components\\app\\Khan Academy_v6.3.0_apkpure.com.apk");
		
		cap.setCapability("udid", "f43c4160");

		AndroidDriver<WebElement>  driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Dismiss\")").click();	
		
		driver.findElementByAndroidUIAutomator("UiSelector().description(\"Profile tab\")").click();
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Sign in\")").click();
		
		driver.findElementByAndroidUIAutomator("UiSelector().textContains(\"username\")").sendKeys("bala");
//		driver.findElementByAndroidUIAutomator("").click();
//		
//		String actualValue=driver.findElementByAndroidUIAutomator("").getText();
//		System.out.println(actualValue);
		
		//password 
				//click on sign in 
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"Sign in\").index(0)").click();

		Thread.sleep(5000);
		driver.quit();
		
	}

}
