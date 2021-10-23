package com;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCommonFunctions {
	public static WebDriver openBrowser(String brName) {
		WebDriver driver = null;
		if ("chrome".equals(brName)) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
		} else if ("firefox".equals(brName)) {
			System.setProperty("webdriver.firefox.driver", "firefoxdriver.exe");
			driver = new ChromeDriver();
			// driver= new FirefoxDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}

	public static void openurl(WebDriver driver, String urltoOpen) {
		driver.get(urltoOpen);
	}

	public static void enterText(WebDriver driver, String locName, String locValue, String dataToEnter) {
		if ("id".equals(locName)) {
			driver.findElement(By.id(locValue)).sendKeys(dataToEnter);
		}
		if ("xpath".equals(locName)) {
			driver.findElement(By.xpath(locValue)).sendKeys(dataToEnter);
		}
	}

	public static void clickXpathButton(WebDriver driver, String copiedXpath) {
		driver.findElement(By.xpath(copiedXpath)).click();
	}

	public static void main(String[] args) {
		WebDriver driver = SeleniumCommonFunctions.openBrowser("chrome");
		SeleniumCommonFunctions.openurl(driver,
				"file:///E:/Java%20Software/New%20folder/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		SeleniumCommonFunctions.enterText(driver, "id", "email", "kiran@gmail.com");
		SeleniumCommonFunctions.enterText(driver, "id", "password", "123456");
		SeleniumCommonFunctions.clickXpathButton(driver, "/html/body/div/div[2]/form/div[3]/div/button");
	}
}
