package com;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;

public class LoginTestCases {
	 WebDriver driver =null;
  @Test(dataProvider = "dp")
  public void signInTest(String tcid,String testdesc,String username,String password,String expected) {
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("file:///E:/Java%20Software/New%20folder/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
			driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		}
		@AfterTest
		public void closeBrowser(){
		driver.close();
		}
	 
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
