package com.cyient.webapptest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class GoogleWebAppTest {

	public static void main(String[] args) throws MalformedURLException {
DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "redmi");
		cap.setCapability("browserName", "chrome");
		
		
		cap.setCapability("chromedriverExecutable", "D:\\B-Mine\\Company\\Company\\Cyient\\Component\\chromedriver.exe");
		
		//send DesiredCapabilities details to the appium server
		AndroidDriver<WebElement>  driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://google.com/");
		
		driver.findElementByXPath("//input[@name='q']").sendKeys("king");
	}

}
