package com.cyient.nativeapptest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ZAdvanceLongPressUsingCoordinatesTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "Balaji");
		cap.setCapability("platformName", "Android");
		cap.setCapability("app", "C:\\Components\\app\\Khan Academy_v6.3.0_apkpure.com.apk");

		AndroidDriver<WebElement>  driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		
		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Dismiss']")));
		
		driver.findElementByXPath("//*[@text='Dismiss']").click();
		//x=572, y=2240
		Thread.sleep(2000);
		
		TouchAction action=new TouchAction(driver);
		action.longPress(PointOption.point(551, 1326)).perform();
		
		Thread.sleep(2000);
		action.
		press(PointOption.point(572, 1048))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
		.release().perform();
	}

}
