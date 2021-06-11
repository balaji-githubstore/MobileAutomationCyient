package com.cyient.nativeapptest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class KhanAcademySignupTest {
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "lenovo");
		cap.setCapability("platformName", "Android");
		cap.setCapability("app", "C:\\Components\\app\\Khan Academy_v6.3.0_apkpure.com.apk");
		
		cap.setCapability("udid", "emulator-5554");

		AndroidDriver<WebElement>  driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
//		driver.findElementByXPath("//android.widget.TextView[@text='Dismiss']").click(); //click on dismiss
	
		driver.findElementByXPath("//*[@text='Dismiss']").click();
		
		driver.findElementByXPath("//*[@text='Profile']").click();
		
		driver.findElementByXPath("//*[@text='Sign in']").click();
		
		driver.findElementByXPath("//*[@text='Enter an e-mail address or username']").sendKeys("hello@gmail.com");
		
		driver.findElementByXPath("//*[contains(@text,'Pass')]").sendKeys("hello123");
		
		driver.findElementByXPath("(//*[@text='Sign in'])[2]").click();
		
		String actualValue = driver.findElementByXPath("//*[contains(@text,'Invalid')]").getText();
		System.out.println(actualValue);
		
		
	}

}



