package basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionTask1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"file:///E:/Java%20Software/New%20folder/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");

		WebElement sign = driver.findElement(By.xpath("/html/body/div/div[2]/p"));
		WebElement email = driver.findElement(By.id("email"));
		Actions action = new Actions(driver);
		action.doubleClick(sign).perform();
		action.doubleClick(sign).perform();
		action.doubleClick(sign).perform();
		action.keyDown(Keys.CONTROL).sendKeys("c");
		//Thread.sleep(500);
		//action.sendKeys("c");
		Thread.sleep(1000);
		action.moveToElement(email).click().keyDown(Keys.CONTROL).sendKeys("v");
		Thread.sleep(1000);
		action.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(500);
		
		
		
/*
		action.doubleClick(sign).perform();
		action.contextClick(sign).perform();
		driver.switchTo().frame(sign);
		action.sendKeys(Keys.CONTROL + "c").perform();
		action.click();
		*/
		 
	}
}
