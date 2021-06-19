package com.cyient.nativeapptest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class OpenExistingAppTest {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "lenovo");
		cap.setCapability("platformName", "Android");
		
//		cap.setCapability("appPackage", "org.khanacademy.android");
//		cap.setCapability("appActivity", "org.khanacademy.android.ui.library.MainActivity");
		cap.setCapability("appPackage", "com.jio.jioplay.tv");
		cap.setCapability("appActivity", "com.jio.jioplay.tv.activities.HomeActivity");
		cap.setCapability("noReset", true);
		
		//check for appActivity with main, home, splashscreen
//		cap.setCapability("appPackage", "com.ges.easyorder");
//		cap.setCapability("appActivity", "com.ges.easyorder.MainActivity");
		//com.ges.easyorder
		//com.ges.easyorder.MainActivity
		AndroidDriver<WebElement>  driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		


	}

}



