package com;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignupTaste {
	WebDriver driver =null;
	@BeforeTest
	public void openbrowser(){
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///E:/Java%20Software/New%20folder/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
	}

	public void jbklink(){
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
	}
	@AfterTest
	public void closeBrowser(){
		driver.close();
	}
	@Test(priority=1)
	public void testSignWindow(){
		
		String acttext=driver.findElement(By.xpath("/html/body/div/div[2]/p")).getText();
		String exptext="Sign in to start your session";
		Assert.assertEquals(acttext, exptext);
	}
	@Test(priority=2)
	public void checkMembershipText(){
		
		String act= driver.findElement(By.xpath("/html/body/div/div[2]/a")).getText();
		String exp="Register a new membership";
		Assert.assertEquals(act, exp);
	}
	@Test(priority=3)
	public void verifyPlaceholdermail(){
		
		WebElement act= driver.findElement(By.id("email"));
		String actplaceholder=act.getAttribute("placeholder");
		String exp= "Email";
		Assert.assertEquals(actplaceholder, exp);
	}
	@Test(priority=4)
	public void verifyPlaceholderpassword(){
		
		WebElement act= driver.findElement(By.id("password"));
		String actplaceholder=act.getAttribute("placeholder");
		String exp= "Password";
		Assert.assertEquals(actplaceholder, exp);
	}
	@Test(priority=5)
	public void loginTitle(){
		
		String acttitle= driver.getTitle();
		String expttitle="JavaByKiran | Log in";
		Assert.assertEquals(acttitle, expttitle);
	}
	@Test(priority=6)
	public void dashboardCheck(){
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		String title=driver.getTitle();
		Assert.assertEquals(title,"JavaByKiran | Dashboard");
	}
	@Test(priority=7)
	public void seleniumCheck(){
		
		String act=driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/div[1]/h3")).getText();
		String exp="Selenium";
		Assert.assertEquals(act, exp);
	}
	@Test(priority=8)
	public void pythonTitle(){
		
		String act = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/div[1]/h3")).getText();
		String exp="Python";
		Assert.assertEquals(act, exp);
	}
	@Test(priority=9)
	public void phpTitle(){
		
		String act = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/div[1]/h3")).getText();
		String exp="Php";
		Assert.assertEquals(act, exp);
	}
	@Test(priority=10)
	public void javatitle(){
		
		String act = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/div[1]/h3")).getText();
		String exp="Java / J2EE";
		Assert.assertEquals(act, exp);
	}
	@Test(priority=11)
	public void webDevelopment(){
		
		String act = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/div[1]/p")).getText();
		String exp="Web Development";
		Assert.assertEquals(act, exp);
	}
	@Test(priority=12)
	public void automationtextcheck(){
		
		String act=driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/div[1]/p")).getText();
		String exp="Automation Testing";
		Assert.assertEquals(act, exp);
	}
	@Test(priority=13)
	public void userTitlecheck(){
		
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();
		String title=driver.getTitle();
		Assert.assertEquals(title,"JavaByKiran | User");	
	}
	@Test(priority=14)
	public void addUserTitle(){
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		String title=driver.getTitle();
		Assert.assertEquals(title,"JavaByKiran | Add User");
	}
	@Test(priority=15)
	public void operatorTitle(){
		
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[4]/a")).click();
		String title=driver.getTitle();
		Assert.assertEquals(title,"JavaByKiran | Operators");
	}
	@Test(priority=16)
	public void downloadsTitle(){
		
		String act =driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[6]/a/span")).getText();
		String exp="Downloads";
		Assert.assertEquals(act,exp);
	}
	@Test(priority=17)
	public void logoutTitle(){
		
		String act = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[7]/a")).getText();
		String exp="Logout";
		Assert.assertEquals(act, exp);
	}
	@Test(priority=18)
	public void jbkheader(){
		
		String act = driver.findElement(By.xpath("/html/body/div/header/a/span[2]/b")).getText();
		String exp="Java By Kiran";
		Assert.assertEquals(act, exp);
	}
	@Test(priority=19)
	public void usefullinks(){
		
		String act = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[5]/a/span")).getText();
		String exp="Useful Links";
		Assert.assertEquals(act, exp);
	}
	@Test(priority=13)
	public void dataScience(){
		
		String act = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/div[1]/p")).getText();
		//String act=driver.findElement(By.id("Data Science")).getText();
		String exp="Data Science";
		Assert.assertEquals(act, exp);
	}
}

