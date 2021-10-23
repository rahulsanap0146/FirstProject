package basic;


import org.apache.bcel.verifier.exc.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.SeleniumCommonFunctions;

public class Task1  {
	private Object driver;
	@Test
	public void Task() {
		WebDriver driver = SeleniumCommonFunctions.openBrowser("chrome");
		SeleniumCommonFunctions.openurl(driver,
"file:///E:/Java%20Software/New%20folder/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		SeleniumCommonFunctions.enterText(driver, "id", "email", "kiran@gmail.com");
		SeleniumCommonFunctions.enterText(driver, "id", "password", "123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		String act = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/div[1]/h3"))
				.getText();
		String exp = "Selenium";
		Assert.assertEquals(act, exp);
		System.out.println(driver.manage().getCookies());
		System.out.println(driver.manage().getCookieNamed("1rx.io"));
		//driver.manage().getCookies(); // Returns the List of all Cookies
		//driver.manage().getCookieNamed("rahul"); //Returns the specific cookie according to name
		driver.manage().deleteAllCookies();
		System.out.println("Delete all Cookies from browser");
		driver.close();

	}
}