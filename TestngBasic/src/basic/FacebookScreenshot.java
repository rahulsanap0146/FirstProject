package basic;

import java.io.File;
import java.io.IOException;

//import library.Utility;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FacebookScreenshot {

	// Create Webdriver reference
	WebDriver driver;

	@Test
	public void captureScreenshot() throws Exception
	{

		// Initiate Firefox browser
		driver=new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Pass application url
		driver.get("http://www.facebook.com");

		// Here we are forcefully passing wrong id so that it will fail our test case
		driver.findElement(By.xpath(".//*[@id='emailasdasdas']")).sendKeys("Learn Automation");


	}

	// It will execute after every test execution
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	{

		// Here will compare if test is failing then only it will enter into if condition
		if(ITestResult.FAILURE==result.getStatus())
		{
			try 
			{
				// Create reference of TakesScreenshot
				TakesScreenshot ts=(TakesScreenshot)driver;

				// Call method to capture screenshot
				File source=ts.getScreenshotAs(OutputType.FILE);

				// Copy method  specific location here it will save all screenshot in our project home directory and
				// result.getName() will return name of test case so that screenshot name will be same

				FileHandler.copy(source, new File("H:\\"+result.getName()+".png"));
				System.out.println("Screenshot taken");
			}
				finally{
					System.out.println("Sdfsd");
				}
			}
}
}