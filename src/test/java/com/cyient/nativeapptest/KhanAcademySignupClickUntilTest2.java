package com.cyient.nativeapptest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class KhanAcademySignupClickUntilTest2 {
	
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
		
		
		//until xpath //*[@text='Sign up with email'] presence it will click on profile
		while(driver.findElementsByXPath("//*[@text='Sign up with email']").size()==0)
		{
			driver.findElementByXPath("//*[@text='Profile']").click();
		}
		
		
		//until xpath //*[@text='Sign up with email'] presence it will click on profile
		while (driver.findElementsByXPath("//*[@text='Sign up with email']").size() == 0) 
		{
			//skip the exception
			try
			{
				driver.findElementByXPath("//*[@text='Profile']").click();
			}
			catch (Exception e) {
				
			}
		}
		
		
		driver.findElementByXPath("//*[@text='Sign in']").click();
		
		driver.findElementByXPath("//*[@text='Enter an e-mail address or username']").sendKeys("hello@gmail.com");
		
		driver.findElementByXPath("//*[contains(@text,'Pass')]").sendKeys("hello123");
		
		driver.findElementByXPath("(//*[@text='Sign in'])[2]").click();
		
		String actualValue = driver.findElementByXPath("//*[contains(@text,'Invalid')]").getText();
		System.out.println(actualValue);
		
		
	}

}



