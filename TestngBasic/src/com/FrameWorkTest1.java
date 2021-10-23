package com;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FrameWorkTest1 {
	/*FileInputStream fis = new FileInputStream("config.properties");
	Properties properties = new Properties();
	properties.load(fis);*/
	
	@Test
	public void loignCheck() {
		WebDriver driver= SeleniumCommonFunctions.openBrowser("chrome");
		SeleniumCommonFunctions.openurl(driver,"file:///E:/Java%20Software/New%20folder/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		SeleniumCommonFunctions.enterText(driver,"id","email","kiran@gmail.com");
		SeleniumCommonFunctions.enterText(driver,"id","password","123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		driver.close();
	}
	
}
