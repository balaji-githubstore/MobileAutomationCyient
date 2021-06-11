package com.cyient.webdriverwebapp;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebAppChromeMockTest {

	public static void main(String[] args) {
		
		Map<String,String> map=new HashMap<String, String>();
		map.put("deviceName", "Nexus 5");
		ChromeOptions option=new ChromeOptions();
		option.setExperimentalOption("mobileEmulation", map);
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://magento.com/");
		
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		
		

	}

}
