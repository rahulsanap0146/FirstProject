
package com;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;

public class LoginCases {
	WebDriver driver =null;
	@Test(dataProvider = "SignIn")
	public void signInTest(String tcid,String testdesc,String username,String password,String expected) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///E:/Java%20Software/New%20folder/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		String actual =driver.findElement(By.id("email_error")).getText();
		//String actual1=driver.findElement(By.id("password_error")).getText();
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		Assert.assertEquals(actual, expected);
		//Assert.assertEquals(actual1, expected);
	}
	@AfterTest
	public void closeBrowser(){
		driver.close();
	}

	@DataProvider
	public Object[][] SignIn() {
		return new Object[][] {
			new Object[] { "tc01","blank"," " ," ","Please enter email"},
			//new Object[] { "tc02","incorrect","rahulsanap777@gmail.com" ,"235645","Please enter email as kiran@gmail.com.Please enter password 123456"},
			//new Object[] {"tc03","correct","kiran@gmail.com","123456","Dashboard"},
		};
	}
}