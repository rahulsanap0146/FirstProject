package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FrameworkTest {
	WebDriver driver =null;
	@BeforeTest
	public void openbrowser(){
		WebDriver driver= SeleniumCommonFunctions.openBrowser("chrome");
		SeleniumCommonFunctions.openurl(driver,"file:///E:/Java%20Software/New%20folder/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
	}
	public void jbklink(){
		SeleniumCommonFunctions.enterText(driver,"id","email","kiran@gmail.com");
		SeleniumCommonFunctions.enterText(driver,"id","password","123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
	}
	@AfterTest
	public void closeBrowser(){
		driver.close();
	}
	@Test
	public void testSignWindow(){
		openbrowser();
		String acttext=driver.findElement(By.xpath("/html/body/div/div[2]/p")).getText();
		String exptext="Sign in to start your session";
		Assert.assertEquals(acttext, exptext);
	}
	@Test
	public void checkMembershipText(){
		testSignWindow();
		String act= driver.findElement(By.xpath("/html/body/div/div[2]/a")).getText();
		String exp="Register a new membership";
		Assert.assertEquals(act, exp);
	}
	@Test
	public void verifyPlaceholdermail(){
		checkMembershipText();
		WebElement act= driver.findElement(By.id("email"));
		String actplaceholder=act.getAttribute("placeholder");
		String exp= "Email";
		Assert.assertEquals(actplaceholder, exp);
	}
	@Test
	public void verifyPlaceholderpassword(){
		verifyPlaceholdermail();
		WebElement act= driver.findElement(By.id("password"));
		String actplaceholder=act.getAttribute("placeholder");
		String exp= "Password";
		Assert.assertEquals(actplaceholder, exp);
	}
	@Test
	public void loginTitle(){
		verifyPlaceholdermail();
		String acttitle= driver.getTitle();
		String expttitle="JavaByKiran | Log in";
		Assert.assertEquals(acttitle, expttitle);
	}
	@Test
	public void dashboardCheck(){
		loginTitle();
		driver.findElement(By.id("email")).clear();
		SeleniumCommonFunctions.enterText(driver, "id", "email", "kiran@gmail.com");
		//driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).clear();
		SeleniumCommonFunctions.enterText(driver, "id", "password", "123456");
		//driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		String title=driver.getTitle();
		Assert.assertEquals(title,"JavaByKiran | Dashboard");
	}
	@Test
	public void seleniumCheck(){
		dashboardCheck();
		String act=driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/div[1]/h3")).getText();
		String exp="Selenium";
		Assert.assertEquals(act, exp);
	}
	@Test
	public void automationtextcheck(){
		seleniumCheck();
		String act=driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/div[1]/p")).getText();
		String exp="Automation Testing";
		Assert.assertEquals(act, exp);
	}
	@Test
	public void userTitlecheck(){
		automationtextcheck();
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();
		String title=driver.getTitle();
		Assert.assertEquals(title,"JavaByKiran | User");	
	}
	@Test
	public void addUserTitle(){
		userTitlecheck();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		String title=driver.getTitle();
		Assert.assertEquals(title,"JavaByKiran | Add User");
	}
	@Test
	public void operatorTitle(){
		addUserTitle();
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[4]/a")).click();
		String title=driver.getTitle();
		Assert.assertEquals(title,"JavaByKiran | Operators");
	}
	@Test
	public void downloadsTitle(){
		operatorTitle();
		String act =driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[6]/a/span")).getText();
		String exp="Downloads";
		Assert.assertEquals(act,exp);
	}
	@Test
	public void logoutTitle(){
		downloadsTitle();
		String act = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[7]/a")).getText();
		String exp="Logout";
		Assert.assertEquals(act, exp);
	}
	@Test
	public void pythonTitle(){
		logoutTitle();
		String act = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/div[1]/h3")).getText();
		String exp="Python";
		Assert.assertEquals(act, exp);
	}
	@Test
	public void phpTitle(){
		String act = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/div[1]/h3")).getText();
		String exp="Python";
		Assert.assertEquals(act, exp);
	}
	@Test
	public void javatitle(){
		String act = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/div[1]/h3")).getText();
		String exp="Java / J2EE";
		Assert.assertEquals(act, exp);
	}
	@Test
	public void jbkheader(){
		String act = driver.findElement(By.xpath("/html/body/div/header/a/span[2]/b")).getText();
		String exp="Java By Kiran";
		Assert.assertEquals(act, exp);
	}
	@Test
	public void usefullinks(){
		String act = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[5]/a/span")).getText();
		String exp="Useful Links";
		Assert.assertEquals(act, exp);
	}
	@Test
	public void dataScience(){
		String act = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/div[1]/p")).getText();
		String exp="Data Science";
		Assert.assertEquals(act, exp);
	}
	@Test
	public void webDevelopment(){
		String act = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/div[1]/p")).getText();
		String exp="Web Development";
		Assert.assertEquals(act, exp);
	}
}
