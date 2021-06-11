package com.cyient.nativeapptest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class InstallApp2Test {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Balaji");
		cap.setCapability("platformName", "Android");
		cap.setCapability("app", "C:\\Components\\app\\com.medplus.mobile.android_2020-12-03.apk");

		AndroidDriver<WebElement>  driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		
	}
	
}
